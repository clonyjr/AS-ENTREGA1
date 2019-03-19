/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa1_p2_g02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * This class is responsible to start the Control Center
 * @author Carlos Soares
 */
public class CCMain {

    private static ServerSocket server;
    private static Socket clientSocket = null;
    private static final int cc_server = 5000;

    /**
     * Function that starts the Control Center. 
     * It creates the GUI and start the server.
     * It also creates a ThreadEcho whose function is to answer to the clients messages.
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ControlCenter cc = new ControlCenter();
        // shows the interface
        cc.setVisible(true);
        // creates a new server
        server = new ServerSocket(cc_server);
        while (true) {
            // wait for a new connection/client
            clientSocket = server.accept();
            // create a new thread to deal with the new client
            CCThreadEcho te = new CCThreadEcho(clientSocket, cc);
            // Launch the Thread (run).
            te.start();
        }

    }

}
