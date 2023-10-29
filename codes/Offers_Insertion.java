import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Offers_Insertion extends javax.swing.JFrame {

    /**
     * Creates new form Offers_Insertion
     */
    public Offers_Insertion() {
        initComponents();
        show_offers();
    }

    public ArrayList<offers> userList(){
        ArrayList<offers> usersList = new ArrayList<>();
        Connection myConn = null;
        ResultSet myRs = null;
        
        String user = "root";
        String pass = "Skazas082002";
        try{
               myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);
               String sql = "SELECT * FROM offers";
               Statement statement = myConn.createStatement();
               myRs = statement.executeQuery(sql);
               offers of;
               while(myRs.next()){
                    of = new offers(myRs.getInt("of_id"), myRs.getString("of_start"), myRs.getString("of_end"), myRs.getInt("of_costpp"), myRs.getInt("of_dst_id"), myRs.getInt("of_br_code"));
                    usersList.add(of);
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
    
    public void show_offers(){
        ArrayList<offers> list = userList();
        DefaultTableModel model = (DefaultTableModel)offers_table_insert.getModel();
        Object[] row = new Object[6];
        for(int i = 0; i<list.size(); i++){
            row[0] = list.get(i).getof_id();
            row[1] = list.get(i).getof_start();
            row[2] = list.get(i).getof_end();
            row[3] = list.get(i).getof_costpp();
            row[4] = list.get(i).getof_dst_id();
            row[5] = list.get(i).getof_br_code();
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        offers_table_insert = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dst_name_jcb = new javax.swing.JComboBox<>();
        of_start_text_field = new javax.swing.JTextField();
        of_end_text_field = new javax.swing.JTextField();
        of_costpp_text_field = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        br_jcb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        offers_table_insert.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "of_id", "of_start", "of_end", "of_costpp", "of_dst_id", "br_code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(offers_table_insert);

        jLabel1.setText("Offer Starting Date");

        jLabel2.setText("Offer Ending Date");

        jLabel3.setText("Offer Cost");

        jLabel4.setText("Destinations");

        jButton2.setText("Show Destinations");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add New Record");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Branch Code");

        jButton4.setText("Show Branch Codes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dst_name_jcb, 0, 142, Short.MAX_VALUE)
                            .addComponent(of_start_text_field)
                            .addComponent(of_end_text_field)
                            .addComponent(of_costpp_text_field)
                            .addComponent(br_jcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(of_start_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(of_end_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(of_costpp_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dst_name_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(br_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(23, 23, 23)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
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
               PreparedStatement statement;
               
               String sql1 = "SELECT dst_name FROM destination";
               stm = myConn.createStatement();
               myRs = stm.executeQuery(sql1);
               while(myRs.next()){
                   String code = myRs.getString("dst_name");
                   dst_name_jcb.addItem(code);
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
               String sql1 = "SELECT COUNT(*) FROM offers";
               Statement st = myConn.createStatement();
               myRs = st.executeQuery(sql1);
               int num_of_offers = 0;
               int dst_id = 0;
               if(myRs.next()){
                   num_of_offers = myRs.getInt("COUNT(*)");
                   num_of_offers = num_of_offers + 1;
               }
               String temp_string1 = String.valueOf(num_of_offers);
               String temp_string2 = (String)dst_name_jcb.getSelectedItem();
               
               String sql2 = "SELECT dst_id FROM destination WHERE dst_name='" + temp_string2 + "'"; 
               myRs = st.executeQuery(sql2);
               if(myRs.next()){
                   dst_id = myRs.getInt("dst_id");
               }
               temp_string2 = String.valueOf(dst_id);
               String sql3 = "INSERT INTO offers(of_id, of_start, of_end, of_costpp, of_dst_id, of_br_code) VALUES(?,?,?,?,?,?)";
               statement = myConn.prepareStatement(sql3);
               statement.setString(1, temp_string1);
               statement.setString(2, of_start_text_field.getText());
               statement.setString(3, of_end_text_field.getText());
               statement.setString(4, of_costpp_text_field.getText());
               statement.setString(5, temp_string2);
               statement.setString(6, (String)br_jcb.getSelectedItem());
               
               statement.execute();
               JOptionPane.showMessageDialog(this, "Record Added");
               
               DefaultTableModel model = (DefaultTableModel)offers_table_insert.getModel();
               Object[] row = new Object[6];
               row[0] = temp_string1;
               row[1] = of_start_text_field.getText();
               row[2] = of_end_text_field.getText();
               row[3] = of_costpp_text_field.getText();
               row[4] = temp_string2;
               row[5] = br_jcb.getSelectedItem().toString();
               model.addRow(row);
               
               of_start_text_field.setText("");
               of_end_text_field.setText("");
               of_costpp_text_field.setText("");
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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
                   br_jcb.addItem(code);
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
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Offers_Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Offers_Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Offers_Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Offers_Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Offers_Insertion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> br_jcb;
    private javax.swing.JComboBox<String> dst_name_jcb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField of_costpp_text_field;
    private javax.swing.JTextField of_end_text_field;
    private javax.swing.JTextField of_start_text_field;
    private javax.swing.JTable offers_table_insert;
    // End of variables declaration//GEN-END:variables
}
