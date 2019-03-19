/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa1_p2_g02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ivo
 */
public class CarThread extends Thread 
{    

    // unique id for each Thread
    private final int id;
    
    // interface implemented by the CarMonitor to increment
    private  CarMonitor monitor;
    
    // Step time
    private int stepTime;
  
    // Monitors(interfaces) are passed as arguments
    public CarThread(int id, CarMonitor monitor, int stepTime) 
    {
        System.out.println("Creating thread "+id);
        this.id = id;
        this.monitor = monitor;
        this.stepTime = stepTime;
    }
    
    @Override
    public void run() 
    {
        while (monitor.keeprunning()) 
        {
            try 
            {
                monitor.race(id);
                Thread.sleep(stepTime);
                monitor.awakeNext(id);
            } catch (InterruptedException ex) {
                Logger.getLogger(CarThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
        monitor.stopCar(id);
    } 
}
