import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class Driver_Insert extends javax.swing.JFrame {

    /**
     * Creates new form Driver_Insert
     */
    public Driver_Insert() {
        initComponents();
        show_driver();
    }
    
    public ArrayList<driver> userList(){
        ArrayList<driver> usersList = new ArrayList<>();
        Connection myConn = null;
        ResultSet myRs = null;
        
        String user = "root";
        String pass = "Skazas082002";
        try{
               myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);
               String sql = "SELECT * FROM driver JOIN worker ON drv_AT = wrk_AT";
               Statement statement = myConn.createStatement();
               myRs = statement.executeQuery(sql);
               driver dr;
               while(myRs.next()){
                   dr = new driver(myRs.getString("wrk_AT"), myRs.getString("wrk_name"), myRs.getString("wrk_lname"), myRs.getFloat("wrk_salary"), myRs.getInt("wrk_br_code"), myRs.getString("drv_AT"), myRs.getString("drv_license"), myRs.getString("drv_route"), myRs.getInt("drv_experience"));
                   usersList.add(dr);
               }
               
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
    
    public void show_driver(){
        ArrayList<driver> list = userList();
        DefaultTableModel model = (DefaultTableModel)driver_table_insert.getModel();
        Object[] row = new Object[9];
        for(int i = 0;i<list.size(); i++){
            row[0] = list.get(i).getwrk_AT();
            row[1] = list.get(i).getwrk_name();
            row[2] = list.get(i).getwrk_lname();
            row[3] = list.get(i).getwrk_salary();
            row[4] = list.get(i).getwrk_br_code();
            row[5] = list.get(i).getdrv_AT();
            row[6] = list.get(i).getdrv_license();
            row[7] = list.get(i).getdrv_route();
            row[8] = list.get(i).getdrv_license();
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
        driver_table_insert = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        wrk_AT_text_field = new javax.swing.JTextField();
        wrk_name_text_field = new javax.swing.JTextField();
        wrk_lname_text_field = new javax.swing.JTextField();
        wrk_salary_text_field = new javax.swing.JTextField();
        drv_experience_text_field = new javax.swing.JTextField();
        drv_license_jcb = new javax.swing.JComboBox<>();
        drv_route_jcb = new javax.swing.JComboBox<>();
        wrk_br_code_jcb = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        driver_table_insert.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "wrk_AT", "wrk_name", "wrk_lname", "wrk_salary", "wrk_br_code", "drv_AT", "drv_license", "drv_route", "drv_experience"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(driver_table_insert);

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Worker AT");

        jLabel2.setText("Worker Name");

        jLabel3.setText("Worker Last Name");

        jLabel4.setText("Worker Salary");

        jLabel5.setText("Driver License");

        jLabel6.setText("Driver Route");

        jLabel7.setText("Driver Experience");

        jLabel8.setText("Branch Code");

        wrk_name_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrk_name_text_fieldActionPerformed(evt);
            }
        });

        drv_license_jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        drv_route_jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LOCAL", "ABROAD" }));

        jButton2.setText("Show Branch Codes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Insert New Record");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(wrk_AT_text_field)
                                .addComponent(wrk_name_text_field)
                                .addComponent(wrk_lname_text_field)
                                .addComponent(wrk_salary_text_field)
                                .addComponent(drv_experience_text_field)
                                .addComponent(drv_license_jcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(drv_route_jcb, 0, 156, Short.MAX_VALUE)
                                .addComponent(wrk_br_code_jcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wrk_AT_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wrk_name_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wrk_lname_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wrk_salary_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drv_license_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drv_route_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drv_experience_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wrk_br_code_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wrk_name_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrk_name_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wrk_name_text_fieldActionPerformed

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
               PreparedStatement statement;
               
               String sql1 = "SELECT br_code FROM branch";
               stm = myConn.createStatement();
               myRs = stm.executeQuery(sql1);
               while(myRs.next()){
                   String code = myRs.getString("br_code");
                   wrk_br_code_jcb.addItem(code);
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection myConn = null;
        ResultSet myRs = null;
        
        String user = "root";
        String pass = "Skazas082002";
        try{
               myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);
               PreparedStatement statement;
                
               String sql1 = "INSERT INTO worker(wrk_AT, wrk_name, wrk_lname, wrk_salary, wrk_br_code) VALUES(?,?,?,?,?)";
               statement = myConn.prepareStatement(sql1);
               statement.setString(1, wrk_AT_text_field.getText());
               statement.setString(2, wrk_name_text_field.getText());
               statement.setString(3, wrk_lname_text_field.getText());
               statement.setString(4, wrk_salary_text_field.getText());
               statement.setString(5, (String)wrk_br_code_jcb.getSelectedItem());
               
               statement.execute();
               
               String sql2 = "INSERT INTO driver(drv_AT, drv_license, drv_route, drv_experience) VALUES(?,?,?,?)";
               statement = myConn.prepareStatement(sql2);
               statement.setString(1, wrk_AT_text_field.getText());
               statement.setString(2, (String)drv_license_jcb.getSelectedItem());
               statement.setString(3, (String)drv_route_jcb.getSelectedItem());
               statement.setString(4, drv_experience_text_field.getText());
               
               statement.execute();
               JOptionPane.showMessageDialog(this, "Record Added");
               
               DefaultTableModel model = (DefaultTableModel) driver_table_insert.getModel();
               Object[] row = new Object[9];
               row[0] = wrk_AT_text_field.getText();
               row[1] = wrk_name_text_field.getText();
               row[2] = wrk_lname_text_field.getText();
               row[3] = Float.parseFloat(wrk_salary_text_field.getText());
               row[4] = wrk_br_code_jcb.getSelectedItem().toString();
               row[5] = wrk_AT_text_field.getText();
               row[6] = drv_license_jcb.getSelectedItem().toString();
               row[7] = drv_route_jcb.getSelectedItem().toString();
               row[8] = drv_experience_text_field.getText();
               model.addRow(row);
               
               wrk_AT_text_field.setText("");
               wrk_name_text_field.setText("");
               wrk_lname_text_field.setText("");
               wrk_salary_text_field.setText("");
               drv_experience_text_field.setText("");
               
        }catch(SQLException exc){
               exc.printStackTrace();
        }finally{
            try{
                if(myRs != null){
                    myRs.close();
                }
                if(myConn != null){
                    System.out.println("Connection Successful");
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
            java.util.logging.Logger.getLogger(Driver_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Driver_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Driver_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Driver_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Driver_Insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable driver_table_insert;
    private javax.swing.JTextField drv_experience_text_field;
    private javax.swing.JComboBox<String> drv_license_jcb;
    private javax.swing.JComboBox<String> drv_route_jcb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField wrk_AT_text_field;
    private javax.swing.JComboBox<String> wrk_br_code_jcb;
    private javax.swing.JTextField wrk_lname_text_field;
    private javax.swing.JTextField wrk_name_text_field;
    private javax.swing.JTextField wrk_salary_text_field;
    // End of variables declaration//GEN-END:variables
}
