/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author chris
 */

import java.sql.DriverManager;
import java.sql.*; //for handling jdbc related syntax
import javax.swing.JOptionPane;  //for showing message
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class SURNAMES extends javax.swing.JFrame {

    /**
     * Creates new form SURNAMES
     */
    public SURNAMES() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jlname = new javax.swing.JTextField();
        jview1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jsearch1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Playbill", 0, 24)); // NOI18N
        jLabel6.setText("last name");

        jlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlnameActionPerformed(evt);
            }
        });

        jview1.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jview1.setText("BACK");
        jview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jview1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "reservation's id", "name", "last name", "count"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jsearch1.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jsearch1.setText("SEARCH");
        jsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jview1)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(44, 44, 44)
                        .addComponent(jlname, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jsearch1)))
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jview1)
                        .addGap(18, 18, 18)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(52, 52, 52)
                .addComponent(jsearch1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jview1ActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jview1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlnameActionPerformed

    private void jsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearch1ActionPerformed
        // TODO add your handling code here:
        Connection myConn = null;
        ResultSet myRs = null;
        Statement st = null;

        String user = "root";
        String pass = "Skazas082002";
        String lname = jlname.getText();

        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);
            st = myConn.createStatement();
            String sql = "SELECT resof_name, resof_lname, resof_id, COUNT(*) FROM reservation_offers "
                    + "WHERE resof_lname = '" + lname + "' "
                    + "GROUP BY resof_id;";
            myRs = st.executeQuery(sql);
            DefaultTableModel tb1Model = (DefaultTableModel) jTable1.getModel();
            tb1Model.setRowCount(0);

            while (myRs.next()) {
                String r1 = String.valueOf(myRs.getString("resof_id"));
                String r2 = String.valueOf(myRs.getString("resof_name"));
                String r3 = String.valueOf(myRs.getString("resof_lname"));
                String r4 = String.valueOf(myRs.getString("COUNT(*)"));

                String tbData[] = { r1, r2, r3, r4 };

                tb1Model.addRow(tbData);
            }

        } // Catch bblock to handle DB exceptions
        catch (SQLException exc) {
            exc.printStackTrace();
        } finally {
            try {
                if (myRs != null) {
                    myRs.close();
                }
                if (myConn != null) {
                    System.out.println("Connection Successful");
                    myConn.close();
                }
            } catch (SQLException exc) {
                exc.printStackTrace();
            }
        }
    }//GEN-LAST:event_jsearch1ActionPerformed

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
            java.util.logging.Logger.getLogger(SURNAMES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SURNAMES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SURNAMES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SURNAMES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SURNAMES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jlname;
    private javax.swing.JButton jsearch1;
    private javax.swing.JButton jview1;
    // End of variables declaration//GEN-END:variables
}