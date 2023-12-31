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

public class UDBRANCH extends javax.swing.JFrame {

    /**
     * Creates new form UDBRANCH
     */
    public UDBRANCH() {
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

        jLabel2 = new javax.swing.JLabel();
        jview = new javax.swing.JButton();
        jview1 = new javax.swing.JButton();
        bcity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jupdate = new javax.swing.JButton();
        bphone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jdelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bcode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bstreet = new javax.swing.JTextField();
        bnumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBranch = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jview.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jview.setText("VIEW");
        jview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jviewActionPerformed(evt);
            }
        });

        jview1.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jview1.setText("BACK");
        jview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jview1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel9.setText("branch's phone");

        jupdate.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jupdate.setText("UPDATE");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel8.setText("branch's city");

        jdelete.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jdelete.setText("DELETE");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel5.setText("branch's code");

        jLabel7.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel7.setText("branch's number");

        bstreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bstreetActionPerformed(evt);
            }
        });

        bnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnumberActionPerformed(evt);
            }
        });

        jTableBranch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "code", "street", "number", "city", "phone"
            }
        ));
        jTableBranch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBranchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBranch);

        jLabel6.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel6.setText("branch's street");

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bstreet, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcode, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcity, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bphone, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(bcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bstreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(bnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(bcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(bphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(209, 209, 209))
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
            String sql = "SELECT * FROM branch JOIN phones ON ph_br_code = br_code";
            myRs = st.executeQuery(sql);
            DefaultTableModel tb1Model = (DefaultTableModel) jTableBranch.getModel();
            tb1Model.setRowCount(0);

            while (myRs.next()) {
                String br_code = String.valueOf(myRs.getString("br_code"));
                String br_street = String.valueOf(myRs.getString("br_street"));
                String br_number = String.valueOf(myRs.getString("br_num"));
                String br_city = String.valueOf(myRs.getString("br_city"));
                String br_phone = String.valueOf(myRs.getString("ph_number"));

                String tbData[] = {br_code, br_street, br_number, br_city, br_phone };

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

    private void jview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jview1ActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jview1ActionPerformed

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        Connection myConn = null;
        ResultSet myRs = null;
        Statement st = null;

        String user = "root";
        String pass = "Skazas082002";

        try {

            if (jTableBranch.getSelectedRowCount() == 1) {
                String ucode = bcode.getText();
                String ustreet = bstreet.getText();
                String unumber = bnumber.getText();
                String ucity = bcity.getText();
                String uphone = bphone.getText();

                myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);

                String sql = "UPDATE branch JOIN phones ON ph_br_code = br_code SET br_street='" + ustreet + "', br_num='" + unumber + "', br_city='" + ucity + "' , ph_number='" + uphone + "' WHERE br_code='" + ucode + "';";
                st = myConn.prepareStatement(sql);

                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(this, "Update successfully.");
                jview.doClick();

            } else {
                if (jTableBranch.getRowCount() == 0) {
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

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        Connection myConn = null;
        ResultSet myRs = null;
        Statement st = null;

        String user = "root";
        String pass = "Skazas082002";

        try {

            if (jTableBranch.getSelectedRowCount() == 1) {
                String ucode = bcode.getText();
                String ustreet = bstreet.getText();
                String unumber = bnumber.getText();
                String ucity = bcity.getText();
                String uphone = bphone.getText();

                myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);

                String sql = "DELETE FROM branch WHERE br_code='" + ucode + "';";
                st = myConn.prepareStatement(sql);

                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(this, "Deleted successfully.");
                jview.doClick();

            } else {
                if (jTableBranch.getRowCount() == 0) {
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

    private void bstreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bstreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bstreetActionPerformed

    private void bnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnumberActionPerformed

    private void jTableBranchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBranchMouseClicked
        DefaultTableModel tb1 = (DefaultTableModel) jTableBranch.getModel();

        String code = tb1.getValueAt(jTableBranch.getSelectedRow(), 0).toString();
        String street = tb1.getValueAt(jTableBranch.getSelectedRow(), 1).toString();
        String number = tb1.getValueAt(jTableBranch.getSelectedRow(), 2).toString();
        String city = tb1.getValueAt(jTableBranch.getSelectedRow(), 3).toString();
        String phone = tb1.getValueAt(jTableBranch.getSelectedRow(), 4).toString();

        bcode.setText(code);
        bstreet.setText(street);
        bnumber.setText(number);
        bcity.setText(city);
        bphone.setText(phone);
    }//GEN-LAST:event_jTableBranchMouseClicked

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
            java.util.logging.Logger.getLogger(UDBRANCH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UDBRANCH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UDBRANCH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UDBRANCH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UDBRANCH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bcity;
    private javax.swing.JTextField bcode;
    private javax.swing.JTextField bnumber;
    private javax.swing.JTextField bphone;
    private javax.swing.JTextField bstreet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBranch;
    private javax.swing.JButton jdelete;
    private javax.swing.JButton jupdate;
    private javax.swing.JButton jview;
    private javax.swing.JButton jview1;
    // End of variables declaration//GEN-END:variables
}
