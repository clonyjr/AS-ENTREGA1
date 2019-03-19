/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa1_p2_g02;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ivo
 */
public class Car 
{
    public final int MAXPOS = 25;
    public final boolean FINISHED = true;

    private int id;
    private int steps;
    private int position;
    private boolean state;
    
    public Car(int id)
    {
        System.out.println("create car "+id);

        this.id = id;
        this.steps = 0;
        this.position = 0;
        this.state = false;
    }
    
    public int increaseSteps()
    {
        System.out.println("increaseSteps 1");

        if(this.steps == MAXPOS)
        {
            return 0;
        }

        //nextStep
        Random r = new Random();
        int nextStep = r.nextInt(5) + 1;
        this.steps = this.steps + nextStep;
        if(this.steps > MAXPOS)
        {
            this.steps = MAXPOS;
        }
        System.out.println("increaseSteps 2");
        return nextStep;
    }
    
    public int getSteps()
    {
        return this.steps;
    }
    
    public int getPosition()
    {
        return this.position;
    }
        
    public boolean getState()
    {
        return this.state;
    }
    
    public void setPosition(int position)
    {
        Logger.getLogger(RaceInfrastructure.class.getName()).log(Level.INFO, "car=" + this.id + " setPosition=" + position);
        this.position = position;
    }

    public void setState(boolean state)
    {
        System.out.println("car " + id + " has finished");
        this.state = state;
    }
    
    public int getId()
    {
        return this.id;
    }
}
