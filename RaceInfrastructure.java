/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa1_p2_g02;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import org.json.JSONObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ivo
 */
public class RaceInfrastructure {

    private static ServerSocket server;
    //socket server port on which it will listen
    private static int serverPort = 9877;

    private static Socket echoSocket = null;
    private static int ri_server = 5001;
    private static int ri_client = 5000;
    private static Socket clientSocket = null;
    private static InfrastructureMonitor im = null;
    private static CarMonitor cm = null;
    private static CarThread[] carThreads = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        RaceInfrastructure ri = new RaceInfrastructure();
        im = new InfrastructureMonitor();
        cm = new CarMonitor(im);

        Logger.getLogger(RaceInfrastructure.class.getName()).log(Level.INFO, "welcome");

        try {    //comunication
            server = new ServerSocket(serverPort);
        } catch (IOException ex) {
            Logger.getLogger(RaceInfrastructure.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }

        server = new ServerSocket(ri_server);
        while (true) {
            // wait for a new connection/client
            clientSocket = server.accept();
            // create a new thread to deal with the new client
            RIThreadEcho te = new RIThreadEcho(clientSocket, ri, im, cm, carThreads);
            // Launch the Thread (run).
            te.start();
        }

    }

    public static void setCarThreads(CarThread[] carThreads) {
        RaceInfrastructure.carThreads = carThreads;
    }

    public static void prepareRace(int numberOfCars) {
        Logger.getLogger(RaceInfrastructure.class.getName()).log(Level.INFO, "prepare " + numberOfCars + " cars");
        cm.prepare(numberOfCars);

    }

    public static void startRace(int numberOfCars, int stepTime) {
        Logger.getLogger(RaceInfrastructure.class.getName()).log(Level.INFO, "Command to Race");

        for (int i = 0; i < numberOfCars; i++) {
            // create instance of a class extending Thread
            carThreads[i] = new CarThread(i + 1, cm, stepTime);
            // launch (run) the thread
            carThreads[i].start();
        }
    }

    public static void stopRace(int numberOfCars) throws InterruptedException {
        Logger.getLogger(RaceInfrastructure.class.getName()).log(Level.INFO, "stop race");
        cm.stop();
        for (int i = 0; i < numberOfCars; i++) {
            // wait while the thread does not die
            carThreads[i].join();
        }
    }
    
}
