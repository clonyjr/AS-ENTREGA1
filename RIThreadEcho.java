package pa1_p2_g02;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/**
 * This class implements the thread responsible for
 * dealing with the new incoming clients
 * @author Óscar Pereira
 */
class RIThreadEcho extends Thread {

    private final Socket socket;
    private BufferedReader in = null;
    RaceInfrastructure ri= null;
    InfrastructureMonitor im=null;
    CarMonitor cm = null;
    CarThread[] ct = null;
    int numberOfCars=0;
    int stepTime=0;

    // constructor receives the socket
    public RIThreadEcho(Socket socket,RaceInfrastructure ri,InfrastructureMonitor im, CarMonitor cm,CarThread[] ct) {
        this.socket = socket;
        this.ri=ri;
        this.im=im;
        this.cm=cm;
        this.ct=ct;
    }
    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String message = in.readLine();
                // null message?
                if (message == null) {
                    // end of communication with this client
                    break;
                }
                System.out.println("Received: " + message );
                JSONObject jsonObj = new JSONObject(message);
                if (jsonObj.get("type").equals("prepare"))
                {
                    numberOfCars=Integer.parseInt(jsonObj.get("numberOfCars").toString());
                    stepTime=Integer.parseInt(jsonObj.get("timeout").toString());
                    Logger.getLogger(RaceInfrastructure.class.getName()).log(Level.INFO,"Prepare to race with " + numberOfCars + " and a step time of " + stepTime + " ms");

                    ri.prepareRace(numberOfCars);
                    ct=null;
                    ri.setCarThreads(ct);
                    ct = new CarThread[numberOfCars];
                    ri.setCarThreads(ct);
                }
                
                if (jsonObj.get("type").equals("start"))
                {
                    Logger.getLogger(RaceInfrastructure.class.getName()).log(Level.INFO,"Command to Race");
                    numberOfCars=Integer.parseInt(jsonObj.get("numberOfCars").toString());
                    stepTime=Integer.parseInt(jsonObj.get("timeout").toString());
                    ri.startRace(numberOfCars,stepTime);
                    
                }
                                
                if (jsonObj.get("type").equals("stop"))
                {
                    Logger.getLogger(RaceInfrastructure.class.getName()).log(Level.INFO,"Command to Stop");
                    numberOfCars=Integer.parseInt(jsonObj.get("numberOfCars").toString());
                    ri.stopRace(numberOfCars);
                    
                }
            }
            socket.close();
            
        } catch (IOException ex) {} catch (InterruptedException ex) {
            Logger.getLogger(RIThreadEcho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
