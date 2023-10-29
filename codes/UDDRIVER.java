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

public class UDDRIVER extends javax.swing.JFrame {

    /**
     * Creates new form UDDRIVER
     */
    public UDDRIVER() {
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

        jLabel7 = new javax.swing.JLabel();
        jview = new javax.swing.JButton();
        drroute = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        aname = new javax.swing.JTextField();
        asalary = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jupdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        abranch = new javax.swing.JTextField();
        jview1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        alname = new javax.swing.JTextField();
        drlicense = new javax.swing.JTextField();
        drexperience = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDriver = new javax.swing.JTable();
        aat = new javax.swing.JTextField();
        jdelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel7.setText("worker's last name");

        jview.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jview.setText("VIEW");
        jview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jviewActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel9.setText("worker's branch code");

        aname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anameActionPerformed(evt);
            }
        });

        jupdate.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jupdate.setText("UPDATE");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel6.setText("worker's name");

        jLabel8.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel8.setText("worker's salary");

        jLabel10.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel10.setText("driver's route");

        jLabel3.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel3.setText("driver's licence");

        jview1.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jview1.setText("BACK");
        jview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jview1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel5.setText("worker's AT");

        jLabel11.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel11.setText("driver's experience");

        alname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alnameActionPerformed(evt);
            }
        });

        jTableDriver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AT", "name", "last name", "salary", "branch code", "license", "route", "experience"
            }
        ));
        jTableDriver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDriverMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDriver);

        jdelete.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jdelete.setText("DELETE");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jview)
                    .addComponent(jupdate)
                    .addComponent(jdelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alname, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aname, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aat, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asalary, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abranch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drlicense, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drroute, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drexperience, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(aat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(aname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(asalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(abranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(drlicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(drroute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(drexperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jview)
                        .addGap(18, 18, 18)
                        .addComponent(jupdate)
                        .addGap(18, 18, 18)
                        .addComponent(jdelete)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jviewActionPerformed
        // TODO add your handling code here:

        Connection myConn = null;
        ResultSet myRs = null;
        Statement st = null;

        String user = "root";
        String pass = "Skazas082002";

        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);
            st = myConn.createStatement();
            String sql = "SELECT * FROM worker JOIN driver ON wrk_AT = drv_AT";
            myRs = st.executeQuery(sql);
            DefaultTableModel tb1Model = (DefaultTableModel) jTableDriver.getModel();
            tb1Model.setRowCount(0);

            while (myRs.next()) {
                String wrk_AT = String.valueOf(myRs.getString("wrk_AT"));
                String wrk_name = String.valueOf(myRs.getString("wrk_name"));
                String wrk_lname = String.valueOf(myRs.getString("wrk_lname"));
                String wrk_salary = String.valueOf(myRs.getInt("wrk_salary"));
                String wrk_br_code = String.valueOf(myRs.getInt("wrk_br_code"));
                String drv_license = String.valueOf(myRs.getString("drv_license"));
                String drv_route = String.valueOf(myRs.getString("drv_route"));
                String drv_experience = String.valueOf(myRs.getString("drv_experience"));

                String tbData[] = {wrk_AT, wrk_name, wrk_lname, wrk_salary, wrk_br_code, drv_license, drv_route, drv_experience};

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
    }//GEN-LAST:event_jviewActionPerformed

    private void anameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anameActionPerformed

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        Connection myConn = null;
        ResultSet myRs = null;
        Statement st = null;

        String user = "root";
        String pass = "Skazas082002";

        try {

            if (jTableDriver.getSelectedRowCount() == 1) {
                String uat = aat.getText();
                String uname = aname.getText();
                String ulname = alname.getText();
                String usalary = asalary.getText();
                String ubranch = abranch.getText();
                String ulicense = drlicense.getText();
                String uroute = drroute.getText();
                String uexp = drexperience.getText();

                myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);

                String sql = "UPDATE driver JOIN worker ON wrk_AT = drv_AT SET wrk_name='" + uname + "', wrk_lname='" + ulname + "', wrk_salary='" + usalary + "', wrk_br_code='" + ubranch + "', drv_license='" + ulicense + "', drv_route='" + uroute + "', drv_experience='" + uexp + "' WHERE drv_AT='" + uat + "';";
                st = myConn.prepareStatement(sql);

                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(this, "Update successfully.");
                jview.doClick();

            } else {
                if (jTableDriver.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, "Cannot perform an update with no records.");
                } else {
                    JOptionPane.showMessageDialog(this, "Please select single row for update.");
                }

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
    }//GEN-LAST:event_jupdateActionPerformed

    private void jview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jview1ActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jview1ActionPerformed

    private void alnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alnameActionPerformed

    private void jTableDriverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDriverMouseClicked
        DefaultTableModel tb1 = (DefaultTableModel) jTableDriver.getModel();

        String at = tb1.getValueAt(jTableDriver.getSelectedRow(), 0).toString();
        String name = tb1.getValueAt(jTableDriver.getSelectedRow(), 1).toString();
        String lname = tb1.getValueAt(jTableDriver.getSelectedRow(), 2).toString();
        String salary = tb1.getValueAt(jTableDriver.getSelectedRow(), 3).toString();
        String branch = tb1.getValueAt(jTableDriver.getSelectedRow(), 4).toString();
        String license = tb1.getValueAt(jTableDriver.getSelectedRow(), 5).toString();
        String route = tb1.getValueAt(jTableDriver.getSelectedRow(), 6).toString();
        String experience = tb1.getValueAt(jTableDriver.getSelectedRow(), 7).toString();

        aat.setText(at);
        aname.setText(name);
        alname.setText(lname);
        asalary.setText(salary);
        abranch.setText(branch);
        drlicense.setText(license);
        drroute.setText(route);
        drexperience.setText(experience);
    }//GEN-LAST:event_jTableDriverMouseClicked

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        Connection myConn = null;
        ResultSet myRs = null;
        Statement st = null;

        String user = "root";
        String pass = "root";

        try {

            if (jTableDriver.getSelectedRowCount() == 1) {
                String uat = aat.getText();
                String uname = aname.getText();
                String ulname = alname.getText();
                String usalary = asalary.getText();
                String ubranch = abranch.getText();
                String utype = drlicense.getText();
                String udiploma = drroute.getText();

                myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);

                String sql = "DELETE FROM worker WHERE wrk_AT='" + uat + "';";
                st = myConn.prepareStatement(sql);

                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(this, "Deleted successfully.");
                jview.doClick();

            } else {
                if (jTableDriver.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, "Cannot perform a deletion with no records.");
                } else {
                    JOptionPane.showMessageDialog(this, "Please select single row for deletion.");
                }

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
    }//GEN-LAST:event_jdeleteActionPerformed

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
            java.util.logging.Logger.getLogger(UDDRIVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UDDRIVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UDDRIVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UDDRIVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UDDRIVER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aat;
    private javax.swing.JTextField abranch;
    private javax.swing.JTextField alname;
    private javax.swing.JTextField aname;
    private javax.swing.JTextField asalary;
    private javax.swing.JTextField drexperience;
    private javax.swing.JTextField drlicense;
    private javax.swing.JTextField drroute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDriver;
    private javax.swing.JButton jdelete;
    private javax.swing.JButton jupdate;
    private javax.swing.JButton jview;
    private javax.swing.JButton jview1;
    // End of variables declaration//GEN-END:variables
}
