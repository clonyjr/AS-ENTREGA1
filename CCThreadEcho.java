package pa1_p2_g02;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * This class implements the thread responsible for
 * dealing with the new incoming clients
 * @author Carlos Soares
 */
class CCThreadEcho extends Thread {

    private final Socket socket;
    private BufferedReader in = null;
    ControlCenter cc= null;

    // constructor receives the socket
    public CCThreadEcho(Socket socket,ControlCenter cc) {
        this.socket = socket;
        this.cc=cc;
    }
    @Override
    public void run() {
        try {
            
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String text = in.readLine();
                // null message?
                if (text == null) {
                    // end of communication with this client
                    break;
                }
                System.out.println("Received: " + text );
                cc.show(text);
            }
            socket.close();
        } catch (IOException ex) {}
    }
}
