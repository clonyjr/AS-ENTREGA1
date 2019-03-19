/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa1_p2_g02;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ivo
 */
public class CarMonitor 
{
    private int carRacing;
    private boolean stop;
    private static ServerSocket server;
    private static Socket echoSocket = null;
    private static int ri_server = 5001;
    private static int ri_client = 5000;
    private static Socket clientSocket = null;

    private Car[] carPositions = null;
    
    // the Lock
    private final ReentrantLock rl;
    //used to check if I should race
    private Condition[] racing = null;
    private InfrastructureMonitor monitor;

    public CarMonitor(InfrastructureMonitor monitor) 
    {
        //start with car number 1
        carRacing = 1;
        stop = false;
        this.monitor = monitor;
        rl = new ReentrantLock(true);
        
        racing = new Condition[monitor.getCarsOnPark()];
        
        for(int i=0; i < monitor.getCarsOnPark(); i++)
        {
            racing[i] = rl.newCondition();
            
        }
    }
        
    public void race(int thread) {
        rl.lock();
        try {

            while (carRacing != thread)
            {
                if(stop == true)
                {
                    return;
                }
                racing[thread-1].await();
            }
            
            int steps = carPositions[thread-1].increaseSteps();
            monitor.newCarPosition(thread-1, steps);

        } 
        catch (Exception ex) 
        {}
        finally 
        {
            // always inside a finally block.
            rl.unlock();
        }
    }
    
    public void awakeNext(int thread)
    {
        rl.lock();

        try 
        {
            //if last one
            if(monitor.getCarsOnRace()==(thread))
            {
                this.carRacing = 1;
                boolean finished = calculatePositions();
                if(!finished)
                    sendInformation();

                // wake Thread waiting in codition decrement. Why signal and not signalAll?
                racing[0].signal();

            }
            else
            {
                // wake Thread waiting in codition decrement. Why signal and not signalAll?
                this.carRacing++;
                racing[thread].signal();    

            }

        } 
        catch (IOException ex) 
        {
            Logger.getLogger(CarMonitor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarMonitor.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally 
        {
            // always inside a finally block.
            rl.unlock();

        }
    }  
    
    
    private boolean calculatePositions() 
    {
        int[][] tempPositions = new int[monitor.getCarsOnRace()][2];
        int possiblePosition = 1;
        boolean allFinished = true;

        //let's check all
        for(int i = 0; i < monitor.getCarsOnRace(); i++)
        {
            //check if car has already finished
            if(carPositions[i].getState() == carPositions[i].FINISHED)
            {        
                possiblePosition ++;
            }
            else
            {
                allFinished = false;

                //if it hasn't finished goes to the array to be latter ordered
                tempPositions[i][0] = carPositions[i].getSteps();
                tempPositions[i][1] = carPositions[i].getId();
            }
            
        }

        //if all the cars finished just leave
        if(allFinished)
        {
            return true;
        }

        //now let's put it in the array
        int tempCarSteps = 0;
        int tempcarId = 0;
        for (int i = 1; i < monitor.getCarsOnRace(); i++) 
        {
            for (int j = i; j > 0; j--) 
            {
                if (tempPositions[j][0] > tempPositions [j - 1][0]) 
                {
                    tempCarSteps = tempPositions[j][0];
                    tempcarId = tempPositions[j][1];

                    tempPositions[j][0] = tempPositions[j - 1][0];
                    tempPositions[j][1] = tempPositions[j - 1][1];

                    tempPositions[j - 1][0] = tempCarSteps;
                    tempPositions[j - 1][1] = tempcarId;

                }
            }
        }

        int auxCount = 1;

        //the first of the array there is no doubt which positions is on
        carPositions[tempPositions[0][1]-1].setPosition(possiblePosition);
        //let's calculate positions 

        for(int i = 1; i < monitor.getCarsOnRace(); i++)
        {              
            if(tempPositions[i][1] != 0)
            {
                //if equal to the previous the position is the same
                if(tempPositions[i][0] == tempPositions[i-1][0])
                {
                    carPositions[tempPositions[i][1]-1].setPosition(possiblePosition);
                    auxCount++;
                }
                else
                {
                    possiblePosition += auxCount;
                    auxCount=1;
                    carPositions[tempPositions[i][1]-1].setPosition(possiblePosition);
                }
            }
        }

        for(int i = 0; i < monitor.getCarsOnRace(); i++)
        {  
            //eliminar isto
            if( carPositions[i].getSteps() == carPositions[i].MAXPOS)
                carPositions[i].setState(carPositions[i].FINISHED);
            
        }
        //let's see if anyone finished
        return false;
    }
    private void sendInformation() throws IOException, ClassNotFoundException
    {

        String message= buildMessage();
        sendMessageToSocket(message);
    }
      
            
    private String buildMessage()
    {
        
        Map<Integer,Integer> positions= new TreeMap<Integer,Integer>() {};
        
        for (Car c: carPositions){
            positions.put(c.getId(),c.getPosition());
            Logger.getLogger(RaceInfrastructure.class.getName()).log(Level.INFO, "car " +c.getId() +" steps=" + c.getSteps() + " position=" + c.getPosition());

        }
        
        JSONObject json = new JSONObject();
        json.put("positions",positions);
        return json.toString();
    }
    
    private void sendMessageToSocket(String message) throws IOException, ClassNotFoundException
    {

        echoSocket = new Socket("localhost",ri_client);
        PrintWriter out = new PrintWriter( echoSocket.getOutputStream(), true );
        out.println(message);
        out.close();
    }

    void stopCar(int id) {
        rl.lock();

        try 
        {
            monitor.returnToParkingArea(id-1);
        } 
        finally 
        {
            // always inside a finally block.
            rl.unlock();

        } 
    }
    
            

    void stop() {
        rl.lock();

        try 
        {
            stop = true;
            for(int i=0; i < monitor.getCarsOnRace(); i++)
            {
                racing[i].signal();
            }
            monitor.stop();
        } 
        finally 
        {
            // always inside a finally block.
            rl.unlock();

        } 
    }

    void prepare(int numbCars) 
    {
        rl.lock();

        try 
        {
            monitor.prepare(numbCars);
            carPositions = null;        
            carPositions = new Car[numbCars];

            
            for(int i=0; i < numbCars; i++)
            {
                carPositions[i] = new Car(i+1);
                System.out.println("<AFTER INSTANTIATE NEW CAR> getting out of parking lot car " + i);
                monitor.getOutOfParkingLot(i);
            }
            carRacing = 1;
            stop = false;
        } 
        finally 
        {
            // always inside a finally block.
            rl.unlock();

        }    
    }

    boolean keeprunning() 
    {
        if(stop == true)
        {
            return false;
        }
        return true;
    }
}
