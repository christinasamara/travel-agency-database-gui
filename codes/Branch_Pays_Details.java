import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class Branch_Pays_Details extends javax.swing.JFrame {

    /**
     * Creates new form Branch_Pays_Details
     */
    public Branch_Pays_Details() {
        initComponents();
        show_branch_pays();
    }
    
    public ArrayList<Branch_Pays> userList(){
        ArrayList<Branch_Pays> usersList = new ArrayList<>();
        Connection myConn = null;
        ResultSet myRs = null;

        
        String user = "root";
        String pass = "Skazas082002";
        try{
               myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);
               String brc_str = (String)br_code_jcb.getSelectedItem();
               int brc;
               brc = Integer.parseInt(brc_str);
                
               String sql = "SELECT wrk_name, wrk_lname, wrk_salary FROM worker JOIN branch ON wrk_br_code = br_code WHERE br_code =" + brc;
               
               Statement statement = myConn.prepareStatement(sql);            
               myRs = statement.executeQuery(sql);
               
               Branch_Pays br_p;
               while(myRs.next()){
               br_p = new Branch_Pays(myRs.getString("wrk_name"), myRs.getString("wrk_lname"), myRs.getFloat("wrk_salary"));
               usersList.add(br_p);
               }
               //}
        }catch(SQLException exc){
               exc.printStackTrace();
        }finally{
            try{
                if(myRs != null){
                    myRs.close();
                }
                if(myConn != null){
                    myConn.close();
                }
            }catch(SQLException exc){
                   exc.printStackTrace();
            }
        }
        return usersList;
    }
    
    
    public void remove_table_data(){
        ArrayList<Branch_Pays> list = userList();
        DefaultTableModel model = (DefaultTableModel)detail_bp_table.getModel();
        Object[] row = new Object[3];
        for(int i = list.size()-1; i>=0; i--){
            model.removeRow(i);
        }
    }
    
    public void show_branch_pays(){
        ArrayList<Branch_Pays> list = userList();
        DefaultTableModel model = (DefaultTableModel)detail_bp_table.getModel();
        Object[] row = new Object[3];
            for(int i = 0; i<list.size(); i++){
                row[0] = list.get(i).getwrk_name();
                row[1] = list.get(i).getwrk_lname();
                row[2] = list.get(i).getwrk_salary();
                model.addRow(row);
            }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        detail_bp_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        br_code_jcb = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        total_pays_text_field = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        ref_data = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        detail_bp_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "wrk_name", "wrk_lname", "wrk_salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(detail_bp_table);

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Branch Code");

        br_code_jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        br_code_jcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br_code_jcbActionPerformed(evt);
            }
        });

        jButton2.setText("Show Branch Codes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Total Pays");

        jButton3.setText("Show Total");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ref_data.setText("Refresh Data");
        ref_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_dataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(87, 87, 87))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(112, 112, 112))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addComponent(jButton1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(38, 38, 38)
                                    .addComponent(br_code_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(total_pays_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(ref_data, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(br_code_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_pays_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ref_data, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection myConn = null;
        Statement stm = null;
        ResultSet myRs = null;
        
        String user = "root";
        String pass = "Skazas082002";
        try{
               myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);
               
               String sql1 = "SELECT br_code FROM branch where br_code != 1";
               stm = myConn.createStatement();
               myRs = stm.executeQuery(sql1);
               while(myRs.next()){
                   String code = myRs.getString("br_code");
                   br_code_jcb.addItem(code);                   
               }
               
        }catch(SQLException exc){
               exc.printStackTrace();
        }finally{
            try{
                if(myRs != null){
                    myRs.close();
                }
                if(stm != null){
                    stm.close();
                }
                if(myConn != null){
                    myConn.close();
                }
            }catch(SQLException exc){
                   exc.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ref_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_dataActionPerformed
        userList();
        remove_table_data();
        show_branch_pays();
        total_pays_text_field.setText("");
    }//GEN-LAST:event_ref_dataActionPerformed

    private void br_code_jcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_br_code_jcbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_br_code_jcbActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection myConn = null;
        ResultSet myRs = null;
        
        String user = "root";
        String pass = "Skazas082002";
        try{
               myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);
               String brc_str = (String)br_code_jcb.getSelectedItem();
               int brc;
               float total_pay = 0;
               brc = Integer.parseInt(brc_str);
               String sql = "SELECT wrk_salary FROM worker JOIN branch ON wrk_br_code = br_code WHERE br_code =" + brc;
               Statement statement = myConn.createStatement();
               myRs = statement.executeQuery(sql);
               while(myRs.next()){
                   total_pay = total_pay + myRs.getFloat("wrk_salary");
               }
               String sql2 = "SELECT SUM(wrk_salary) FROM it JOIN worker ON it_AT=wrk_AT";
               myRs = statement.executeQuery(sql2);
               if(myRs.next()){
                   total_pay = total_pay + myRs.getFloat("SUM(wrk_salary)");
               }
            
               String pay = Float.valueOf(total_pay).toString();
               total_pays_text_field.setText(pay);
               
        } catch(SQLException exc){
               exc.printStackTrace();
        }finally{
            try{
                if(myRs != null){
                    myRs.close();
                }
                if(myConn != null){
                    myConn.close();
                }
            }catch(SQLException exc){
                   exc.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Branch_Pays_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Branch_Pays_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Branch_Pays_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Branch_Pays_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Branch_Pays_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> br_code_jcb;
    private javax.swing.JTable detail_bp_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ref_data;
    private javax.swing.JTextField total_pays_text_field;
    // End of variables declaration//GEN-END:variables
}
