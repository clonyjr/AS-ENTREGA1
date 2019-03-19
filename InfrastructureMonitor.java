/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa1_p2_g02;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

/**
 *
 * @author ivo
 */
public class InfrastructureMonitor 
{
    private int carsOnPark;
    private int carsOnRace; 
    RaceInfraStructureGUI raceInfraGui;

    public InfrastructureMonitor() 
    {
        carsOnPark = 10;
        carsOnRace = 0;
        raceInfraGui = new RaceInfraStructureGUI();
        // shows the interface

         raceInfraGui.setVisible(true);

    }
    public synchronized void getOutOfParkingLot(int carId)   
    {
        raceInfraGui.getOutOfParkingLot(carId);    
    }
    public synchronized void returnToParkingArea(int carId)   
    {
        raceInfraGui.returnCarToParkingArea(carId);    
    }
    public synchronized void prepare(int numbCars) 
    {
        carsOnPark = 10 - numbCars;
        carsOnRace = numbCars;
    }  
        
    public synchronized int getCarsOnRace() 
    {
        return carsOnRace;
    } 
    
    public synchronized int getCarsOnPark() 
    {
        return carsOnPark;
    } 

    public synchronized void stop() 
    {
        carsOnPark = 10;
        carsOnRace = 0;
    }
    
    public synchronized void newCarPosition(int carId, int location) 
    {
        raceInfraGui.setNewLocation(carId, location);
    }
}
