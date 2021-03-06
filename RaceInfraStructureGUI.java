/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa1_p2_g02;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import jdk.nashorn.internal.objects.NativeMath;
import org.json.JSONObject;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 * This class is the GUI used to show the race track.
 * @author clonyjr  (based on Carlos Soares works)
 */
public class RaceInfraStructureGUI extends javax.swing.JFrame {
   
    /**
     * Creates new form RaceInfraStructure
     */
    public RaceInfraStructureGUI() {
        initComponents();  
        createRace();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        car02 = new javax.swing.JLabel();
        car01 = new javax.swing.JLabel();
        car03 = new javax.swing.JLabel();
        car04 = new javax.swing.JLabel();
        car05 = new javax.swing.JLabel();
        car06 = new javax.swing.JLabel();
        car07 = new javax.swing.JLabel();
        car08 = new javax.swing.JLabel();
        car09 = new javax.swing.JLabel();
        car10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        carP01 = new javax.swing.JLabel();
        carP02 = new javax.swing.JLabel();
        carP03 = new javax.swing.JLabel();
        carP04 = new javax.swing.JLabel();
        carP05 = new javax.swing.JLabel();
        carP06 = new javax.swing.JLabel();
        carP07 = new javax.swing.JLabel();
        carP08 = new javax.swing.JLabel();
        carP09 = new javax.swing.JLabel();
        carP10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel13.setText("START");

        jLabel14.setText("END");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("RACE TRACK"));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        car02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-02.PNG"))); // NOI18N

        car01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-01.PNG"))); // NOI18N

        car03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-03.PNG"))); // NOI18N

        car04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-04.PNG"))); // NOI18N

        car05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-05.PNG"))); // NOI18N

        car06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-06.PNG"))); // NOI18N

        car07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-07.PNG"))); // NOI18N

        car08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-08.PNG"))); // NOI18N

        car09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-09.PNG"))); // NOI18N

        car10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-10.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(car10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(car09, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(car08, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(car07, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(car06, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(car05, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(car04, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(car03, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(car02, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(car01, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(car02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(car07, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(car06, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(car04, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(car03, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(car05, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(car01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(car08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(car09, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(car10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("PARKING AREA"));

        carP01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-01.PNG"))); // NOI18N
        carP01.setName("carP01"); // NOI18N

        carP02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-02.PNG"))); // NOI18N

        carP03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-03.PNG"))); // NOI18N

        carP04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-04.PNG"))); // NOI18N

        carP05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-05.PNG"))); // NOI18N

        carP06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-06.PNG"))); // NOI18N

        carP07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-07.PNG"))); // NOI18N

        carP08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-08.PNG"))); // NOI18N

        carP09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-09.PNG"))); // NOI18N

        carP10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RCInfra/Imagens/car-10.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carP10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(carP01, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(carP03, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(carP05, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(carP09, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(carP07, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(carP04, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(carP02, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(carP08, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(carP06, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(carP02, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(carP04, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(carP01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carP03, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carP05, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carP06, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carP07, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carP08, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carP09, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carP10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RaceInfraStructureGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RaceInfraStructureGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RaceInfraStructureGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RaceInfraStructureGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RaceInfraStructureGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel car01;
    private javax.swing.JLabel car02;
    private javax.swing.JLabel car03;
    private javax.swing.JLabel car04;
    private javax.swing.JLabel car05;
    private javax.swing.JLabel car06;
    private javax.swing.JLabel car07;
    private javax.swing.JLabel car08;
    private javax.swing.JLabel car09;
    private javax.swing.JLabel car10;
    private javax.swing.JLabel carP01;
    private javax.swing.JLabel carP02;
    private javax.swing.JLabel carP03;
    private javax.swing.JLabel carP04;
    private javax.swing.JLabel carP05;
    private javax.swing.JLabel carP06;
    private javax.swing.JLabel carP07;
    private javax.swing.JLabel carP08;
    private javax.swing.JLabel carP09;
    private javax.swing.JLabel carP10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
    private static int serverPort = 5100;
    private static int clientPort = 5101;
    
    static List<javax.swing.JLabel> listCars;
    static List<javax.swing.JLabel> listParkingAreaCars;
    
    
    /**
     * Method to prepare the graphic environment to the race. Receives the numberOfCars and the timout parameters to
     * tells how many cars will exists in the race and what is the timeout between then. It uses two arrays lists to 
     * keep the cars objects (jLabels with an image set to icon property) and iterates through then using a for to set
     * the visible properties of the number of cars to true at jpanel2 (race track) and false at the jpanel1(parkin area)
     * This method signature must be change to support the JSON, as the mouse click event example in comment above
     * A JSON object contains these informations and it is send by a socket
     * @param numberOfCars 
     * @param timeout 
     */
    public void createRace()
    {
        listCars = new ArrayList<>();
        listParkingAreaCars = new ArrayList<>();

        listCars.add(0, car01);
        listCars.add(1, car02);
        listCars.add(2, car03);
        listCars.add(3, car04);
        listCars.add(4, car05);
        listCars.add(5, car06);
        listCars.add(6, car07);
        listCars.add(7, car08);
        listCars.add(8, car09);
        listCars.add(9, car10);

        listParkingAreaCars.add(0, carP01);
        listParkingAreaCars.add(1, carP02);
        listParkingAreaCars.add(2, carP03);
        listParkingAreaCars.add(3, carP04);
        listParkingAreaCars.add(4, carP05);
        listParkingAreaCars.add(5, carP06);
        listParkingAreaCars.add(6, carP07);
        listParkingAreaCars.add(7, carP08);
        listParkingAreaCars.add(8, carP09);
        listParkingAreaCars.add(9, carP10);

        for(int i=0;i<10;i++)
        {
            listCars.get(i).setVisible(false);
        }

        for(int i=0;i<10;i++)
        {
            listParkingAreaCars.get(i).setVisible(true);
        }                              

    }
    
    public void getOutOfParkingLot(int carId)
    {
        listCars.get(carId).setVisible(true);
        listParkingAreaCars.get(carId).setVisible(false);
    }
    
    /**
     * Method used do remove the cars objects from the start grid. It uses an array list to add the jLabel objects
     * (named as car01, car02 and so on) and set it visible properties to false. The objects are really at the same
     * location, but are not visible when this method is called. Although it is a thread, there is no need to send
     * sockets messages to this action/state. The method must be called before it construct the user interface, so 
     * the cars are not visible on a initial state.
     */
    public final void removeCarFromStartGrid(int id)
    {
        listCars.get(id).setVisible(false);
    }
    /**
    * Method used to return cars into parking area. It return cars to parking area by removing all cars from the 
    * start grid , calling the method removeAllCarsFromStartGrid, and using object listParkingAreaCars which
    * contains the objects that represents the cars. Uses a for to set each visible propertie to true. The objects are 
    * at panel2 (the parking area) and never leave there, was only with their visible properties set to false.
    */
    public void returnCarToParkingArea(int id)
    { 
        removeCarFromStartGrid(id);
        listParkingAreaCars.get(id).setVisible(true);
    }
    
    public void setNewLocation(int carId, int location)
    {
        listCars.get(carId).setLocation(listCars.get(carId).getLocation().x, listCars.get(carId).getLocation().y+location*20);
    }
}
