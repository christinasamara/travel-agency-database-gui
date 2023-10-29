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

public class UDTRIP extends javax.swing.JFrame {

    /**
     * Creates new form UDTRIP
     */
    public UDTRIP() {
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

        jmaxseats = new javax.swing.JTextField();
        jupdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcost = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jview1 = new javax.swing.JButton();
        jbranch = new javax.swing.JTextField();
        jdelete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jguide = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jview = new javax.swing.JButton();
        jid = new javax.swing.JTextField();
        jdriver = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jdeparture = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jreturn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jupdate.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jupdate.setText("UPDATE");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel8.setText("trip's maxseats");

        jLabel3.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel3.setText("trip's branch code");

        jLabel5.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel5.setText("trip's id");

        jLabel10.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel10.setText("trip's guide");

        jview1.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jview1.setText("BACK");
        jview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jview1ActionPerformed(evt);
            }
        });

        jdelete.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jdelete.setText("DELETE");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel11.setText("trip's driver");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "departure", "return", "maxseats", "cost", "branch code", "guide", "driver"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jview.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jview.setText("VIEW");
        jview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jviewActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel7.setText("trip's return date");

        jdeparture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdepartureActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel6.setText("trip's departure date");

        jreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jreturnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel9.setText("trip's cost");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jbranch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcost, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jmaxseats, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jguide, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdriver, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdeparture, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(jview1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jview)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdeparture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jupdate)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jreturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jdelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jmaxseats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jguide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jdriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(108, 108, 108))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        Connection myConn = null;
        ResultSet myRs = null;
        Statement st = null;

        String user = "root";
        String pass = "Skazas082002";

        try {

            if (jTable1.getSelectedRowCount() == 1) {
                String uid = jid.getText();
                String udeparture = jdeparture.getText();
                String ureturn = jreturn.getText();
                String umaxseats = jmaxseats.getText();
                String ucost = jcost.getText();
                String ubranch = jbranch.getText();
                String uguide = jguide.getText();
                String udriver = jdriver.getText();

                myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);

                String sql = "UPDATE trip SET tr_departure='" + udeparture + "', tr_return='" + ureturn + "', tr_maxseats='" + umaxseats + "', tr_cost='" + ucost + "', tr_br_code='" + ubranch + "', tr_gui_AT='" + uguide + "', tr_drv_AT='" + udriver + "' WHERE tr_id='" + uid + "'";
                st = myConn.prepareStatement(sql);

                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(this, "Update successfully.");
                jview.doClick();

            } else {
                if (jTable1.getRowCount() == 0) {
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

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
        // TODO add your handling code here:Connection myConn = null;
        Connection myConn = null;
        ResultSet myRs = null;
        Statement st = null;

        String user = "root";
        String pass = "root";

        try {

            if (jTable1.getSelectedRowCount() == 1) {
                String uid = jid.getText();
                String udeparture = jdeparture.getText();
                String ureturn = jreturn.getText();
                String umaxseats = jmaxseats.getText();
                String ucost = jcost.getText();
                String ubranch = jbranch.getText();
                String uguide = jguide.getText();
                String udriver = jdriver.getText();

                myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);

                String sql = "DELETE FROM trip WHERE tr_id='" + uid + "'";
                st = myConn.prepareStatement(sql);

                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(this, "Deleted successfully.");
                jview.doClick();

            } else {
                if (jTable1.getRowCount() == 0) {
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //set data to their textfield

        DefaultTableModel tb1 = (DefaultTableModel) jTable1.getModel();

        String tid = tb1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tdeparture = tb1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String treturn = tb1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tmaxseats = tb1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String tcost = tb1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String tbranch = tb1.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String tguide = tb1.getValueAt(jTable1.getSelectedRow(), 6).toString();
        String tdriver = tb1.getValueAt(jTable1.getSelectedRow(), 7).toString();

        jid.setText(tid);
        jdeparture.setText(tdeparture);
        jreturn.setText(treturn);
        jmaxseats.setText(tmaxseats);
        jcost.setText(tcost);
        jbranch.setText(tbranch);
        jguide.setText(tguide);
        jdriver.setText(tdriver);
    }//GEN-LAST:event_jTable1MouseClicked

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
            String sql = "SELECT * FROM trip";
            myRs = st.executeQuery(sql);
            DefaultTableModel tb1Model = (DefaultTableModel) jTable1.getModel();
            tb1Model.setRowCount(0);

            while (myRs.next()) {
                String tr_id = String.valueOf(myRs.getInt("tr_id"));
                String tr_dep = String.valueOf(myRs.getString("tr_departure"));
                String tr_return = String.valueOf(myRs.getString("tr_return"));
                String tr_maxseats = String.valueOf(myRs.getInt("tr_maxseats"));
                String tr_cost = String.valueOf(myRs.getInt("tr_cost"));
                String tr_br_code = String.valueOf(myRs.getInt("tr_br_code"));
                String tr_gui_AT = String.valueOf(myRs.getString("tr_gui_AT"));
                String tr_drv_AT = String.valueOf(myRs.getString("tr_drv_AT"));

                String tbData[] = {tr_id, tr_dep, tr_return, tr_maxseats, tr_cost, tr_br_code, tr_gui_AT, tr_drv_AT};

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

    private void jdepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdepartureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdepartureActionPerformed

    private void jreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jreturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jreturnActionPerformed

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
            java.util.logging.Logger.getLogger(UDTRIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UDTRIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UDTRIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UDTRIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UDTRIP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jbranch;
    private javax.swing.JTextField jcost;
    private javax.swing.JButton jdelete;
    private javax.swing.JTextField jdeparture;
    private javax.swing.JTextField jdriver;
    private javax.swing.JTextField jguide;
    private javax.swing.JTextField jid;
    private javax.swing.JTextField jmaxseats;
    private javax.swing.JTextField jreturn;
    private javax.swing.JButton jupdate;
    private javax.swing.JButton jview;
    private javax.swing.JButton jview1;
    // End of variables declaration//GEN-END:variables
}
