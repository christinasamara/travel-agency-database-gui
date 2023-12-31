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

public class UDIT extends javax.swing.JFrame {

    /**
     * Creates new form UDIT
     */
    public UDIT() {
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

        jview = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ibranch = new javax.swing.JTextField();
        iname = new javax.swing.JTextField();
        jview1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        istart = new javax.swing.JTextField();
        ilname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        isalary = new javax.swing.JTextField();
        ipass = new javax.swing.JTextField();
        iend = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGuide = new javax.swing.JTable();
        jdelete = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        iat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jview.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jview.setText("VIEW");
        jview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jviewActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel9.setText("worker's branch code");

        iname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inameActionPerformed(evt);
            }
        });

        jview1.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jview1.setText("BACK");
        jview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jview1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel4.setText("it's start date");

        jLabel5.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel5.setText("worker's AT");

        ilname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilnameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel10.setText("it's end date");

        jTableGuide.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AT", "name", "last name", "salary", "branch code", "password", "start date", "end date"
            }
        ));
        jTableGuide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableGuideMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableGuide);

        jdelete.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jdelete.setText("DELETE");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel7.setText("worker's last name");

        jLabel3.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel3.setText("it's password");

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
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ilname, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iname, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iat, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isalary, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ibranch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ipass, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iend, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(istart, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(jview)
                        .addGap(18, 18, 18)
                        .addComponent(jupdate)
                        .addGap(18, 18, 18)
                        .addComponent(jdelete)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(iat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(iname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ilname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ibranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ipass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(istart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(iend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
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
            String sql = "SELECT * FROM worker JOIN it ON wrk_AT = it_AT";
            myRs = st.executeQuery(sql);
            DefaultTableModel tb1Model = (DefaultTableModel) jTableGuide.getModel();
            tb1Model.setRowCount(0);

            while (myRs.next()) {
                String wrk_AT = String.valueOf(myRs.getString("wrk_AT"));
                String wrk_name = String.valueOf(myRs.getString("wrk_name"));
                String wrk_lname = String.valueOf(myRs.getString("wrk_lname"));
                String wrk_salary = String.valueOf(myRs.getInt("wrk_salary"));
                String wrk_br_code = String.valueOf(myRs.getInt("wrk_br_code"));
                String it_pass = String.valueOf(myRs.getString("it_pswb"));
                String it_start = String.valueOf(myRs.getString("it_start_date"));
                String it_end = String.valueOf(myRs.getString("it_end_date"));

                String tbData[] = {wrk_AT, wrk_name, wrk_lname, wrk_salary, wrk_br_code, it_pass, it_start, it_end };

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

    private void inameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inameActionPerformed

    private void jview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jview1ActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jview1ActionPerformed

    private void ilnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilnameActionPerformed

    private void jTableGuideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGuideMouseClicked
        DefaultTableModel tb1 = (DefaultTableModel) jTableGuide.getModel();

        String at = tb1.getValueAt(jTableGuide.getSelectedRow(), 0).toString();
        String name = tb1.getValueAt(jTableGuide.getSelectedRow(), 1).toString();
        String lname = tb1.getValueAt(jTableGuide.getSelectedRow(), 2).toString();
        String salary = tb1.getValueAt(jTableGuide.getSelectedRow(), 3).toString();
        String branch = tb1.getValueAt(jTableGuide.getSelectedRow(), 4).toString();
        String pass = tb1.getValueAt(jTableGuide.getSelectedRow(), 5).toString();
        String start = tb1.getValueAt(jTableGuide.getSelectedRow(), 6).toString();
        String end = tb1.getValueAt(jTableGuide.getSelectedRow(), 7).toString();

        iat.setText(at);
        iname.setText(name);
        ilname.setText(lname);
        isalary.setText(salary);
        ibranch.setText(branch);
        ipass.setText(pass);
        istart.setText(start);
        iend.setText(end);
    }//GEN-LAST:event_jTableGuideMouseClicked

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
        // TODO add your handling code here:
        Connection myConn = null;
        ResultSet myRs = null;
        Statement st = null;

        String user = "root";
        String pass = "Skazas082002";

        try {

            if (jTableGuide.getSelectedRowCount() == 1) {
                String uat = iat.getText();
                String uname = iname.getText();
                String ulname = ilname.getText();
                String usalary = isalary.getText();
                String ubranch = ibranch.getText();
                String upassword = ipass.getText();
                String ustart = istart.getText();
                String uend = iend.getText();

                myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);

                String sql = "DELETE FROM worker WHERE wrk_AT='" + uat + "';";
                st = myConn.prepareStatement(sql);

                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(this, "Deleted successfully.");
                jview.doClick();

            } else {
                if (jTableGuide.getRowCount() == 0) {
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

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        Connection myConn = null;
        ResultSet myRs = null;
        Statement st = null;

        String user = "root";
        String pass = "Skazas082002";

        try {

            if (jTableGuide.getSelectedRowCount() == 1) {
                String uat = iat.getText();
                String uname = iname.getText();
                String ulname = ilname.getText();
                String usalary = isalary.getText();
                String ubranch = ibranch.getText();
                String upassword = ipass.getText();
                String ustart = istart.getText();
                String uend = iend.getText();

                myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);

                String sql = "UPDATE it JOIN worker ON wrk_AT = it_AT SET wrk_name='" + uname + "', wrk_lname='" + ulname + "', wrk_salary='" + usalary + "', wrk_br_code='" + ubranch + "', it_pswb='" + upassword + "', it_start_date='" + ustart + "', it_end_date='" + uend +"' WHERE it_AT='" + uat + "';";
                st = myConn.prepareStatement(sql);

                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(this, "Update successfully.");
                jview.doClick();

            } else {
                if (jTableGuide.getRowCount() == 0) {
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
            java.util.logging.Logger.getLogger(UDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UDIT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField iat;
    private javax.swing.JTextField ibranch;
    private javax.swing.JTextField iend;
    private javax.swing.JTextField ilname;
    private javax.swing.JTextField iname;
    private javax.swing.JTextField ipass;
    private javax.swing.JTextField isalary;
    private javax.swing.JTextField istart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGuide;
    private javax.swing.JButton jdelete;
    private javax.swing.JButton jupdate;
    private javax.swing.JButton jview;
    private javax.swing.JButton jview1;
    // End of variables declaration//GEN-END:variables
}
