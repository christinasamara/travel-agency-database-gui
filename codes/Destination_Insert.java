import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class Destination_Insert extends javax.swing.JFrame {

    /**
     * Creates new form Destination_Insert
     */
    public Destination_Insert() {
        initComponents();
        show_destination();
    }
    
    public ArrayList<destination> userList(){
        ArrayList<destination> usersList = new ArrayList<>();
        Connection myConn = null;
        ResultSet myRs = null;
        
        String user = "root";
        String pass = "Skazas082002";
        try{
               myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);
               String sql = "SELECT * FROM travel_to JOIN destination ON to_dst_id = dst_id";
               Statement statement = myConn.createStatement();
               myRs = statement.executeQuery(sql);
               destination dst;
               while(myRs.next()){
                   dst = new destination(myRs.getInt("to_tr_id"), myRs.getInt("to_dst_id"), myRs.getString("to_arrival"), myRs.getString("to_departure"), myRs.getInt("dst_id"), myRs.getString("dst_name"), myRs.getString("dst_descr"), myRs.getString("dst_rtype"), myRs.getString("dst_language"), myRs.getString("dst_name"));
                   usersList.add(dst);
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
    
    public void show_destination(){
        ArrayList<destination> list = userList();
        DefaultTableModel model = (DefaultTableModel)destination_table_insert.getModel();
        Object[] row = new Object[10];
        for(int i = 0; i<list.size(); i++){
            row[0] = i+1;
            row[1] = list.get(i).getto_dst_id();
            row[2] = list.get(i).getto_arrival();
            row[3] = list.get(i).getto_departure();
            row[4] = i+1;
            row[5] = list.get(i).getdst_name();
            row[6] = list.get(i).getdst_descr();
            row[7] = list.get(i).getdst_rtype();
            row[8] = list.get(i).getdst_language();
            row[9] = list.get(i).getdst_location();
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
        destination_table_insert = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dst_name_text_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dst_descr_text_field = new javax.swing.JTextField();
        dst_language_text_field = new javax.swing.JTextField();
        dst_location_text_field = new javax.swing.JTextField();
        dst_rtype_text_field = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        to_arrival_text_field = new javax.swing.JTextField();
        to_departure_text_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        destination_table_insert.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "to_tr_id", "to_dst_id", "to_arrival", "to_departure", "dst_id", "dst_name", "dst_descr", "dst_rtype", "dst_language", "dst_location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(destination_table_insert);

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Destination Name");

        jLabel2.setText("Destination Description");

        jLabel3.setText("Destination Type");

        jLabel4.setText("Destination Location");

        jLabel5.setText("Destination Language");

        dst_language_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dst_language_text_fieldActionPerformed(evt);
            }
        });

        dst_rtype_text_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LOCAL", "ABROAD" }));
        dst_rtype_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dst_rtype_text_fieldActionPerformed(evt);
            }
        });

        jButton2.setText("Insert New Record");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Arrival Time");

        jLabel8.setText("Departure Time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dst_rtype_text_field, 0, 164, Short.MAX_VALUE)
                            .addComponent(dst_name_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(dst_language_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(dst_location_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(dst_descr_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(to_arrival_text_field)
                            .addComponent(to_departure_text_field))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dst_name_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dst_rtype_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dst_language_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dst_location_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dst_descr_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_arrival_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_departure_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dst_language_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dst_language_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dst_language_text_fieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection myConn = null;
        ResultSet myRs = null;
        
        String user = "root";
        String pass = "Skazas082002";
        try{
               myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", user, pass);
               String sql1 = "SELECT COUNT(*) FROM trip";
               Statement st = myConn.createStatement();
               myRs = st.executeQuery(sql1);
               int num_of_tr_to = 0;
               while(myRs.next()){
                   num_of_tr_to = myRs.getInt("COUNT(*)");
               }
               String temp_string = String.valueOf(num_of_tr_to);
               
               String sql2 = "INSERT INTO travel_to (to_tr_id, to_dst_id, to_arrival, to_departure) VALUES(?,?,?,?)";
               PreparedStatement statement;
               statement = myConn.prepareStatement(sql2);
               statement.setString(1, temp_string);
               statement.setString(2, temp_string);
               statement.setString(3, to_arrival_text_field.getText());
               statement.setString(4, to_departure_text_field.getText());
               
               String sql3 = "INSERT INTO destination(dst_id, dst_name, dst_descr, dst_rtype, dst_language, dst_location) VALUES(?,?,?,?,?,?)";
               statement = myConn.prepareStatement(sql3);
               statement.setString(1, temp_string);
               statement.setString(2, dst_name_text_field.getText());
               statement.setString(3, dst_descr_text_field.getText());
               statement.setString(4, (String)dst_rtype_text_field.getSelectedItem());
               statement.setString(5, dst_language_text_field.getText());
               statement.setString(6, dst_location_text_field.getText());
               
               statement.execute();
               JOptionPane.showMessageDialog(this, "Record Added");
               
               DefaultTableModel model = (DefaultTableModel)destination_table_insert.getModel();
               Object[] row = new Object[10];
               row[0] = temp_string;
               row[1] = temp_string;
               row[2] = to_arrival_text_field.getText();
               row[3] = to_departure_text_field.getText();
               row[4] = temp_string;
               row[5] = dst_name_text_field.getText();
               row[6] = dst_descr_text_field.getText();
               row[7] = dst_rtype_text_field.getSelectedItem().toString();
               row[8] = dst_language_text_field.getText();
               row[9] = dst_location_text_field.getText();
               model.addRow(row);
               
               dst_name_text_field.setText("");
               dst_descr_text_field.setText("");
               dst_location_text_field.setText("");
               dst_language_text_field.setText("");
               to_arrival_text_field.setText("");
               to_departure_text_field.setText("");
               
               
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Trip_Insert tr = new Trip_Insert();
        tr.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dst_rtype_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dst_rtype_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dst_rtype_text_fieldActionPerformed

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
            java.util.logging.Logger.getLogger(Destination_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Destination_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Destination_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Destination_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Destination_Insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable destination_table_insert;
    private javax.swing.JTextField dst_descr_text_field;
    private javax.swing.JTextField dst_language_text_field;
    private javax.swing.JTextField dst_location_text_field;
    private javax.swing.JTextField dst_name_text_field;
    private javax.swing.JComboBox<String> dst_rtype_text_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField to_arrival_text_field;
    private javax.swing.JTextField to_departure_text_field;
    // End of variables declaration//GEN-END:variables
}