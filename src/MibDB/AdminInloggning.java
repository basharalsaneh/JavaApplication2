package MibDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;




/**
 *
 * @author mac
 */
public class AdminInloggning extends javax.swing.JFrame {

    /**
     * Creates new form AdminInloggning
     */
    
    private InfDB idb;
    ResultSet resultat = null;
    Statement statement = null;
    PreparedStatement prepStatement = null;
    Connection connection1 = null;
    
    
    
    public AdminInloggning(InfDB idb){
        initComponents();
       
        this.idb = idb;
    }
    
    
    
    public final void getConnection() throws Exception{
        try{
        Class.forName("com.mysql.cj.jdbc.Driver"); // Tror den hämtar mysql driver och gör det möjligt att koppla upp till databasen.
             connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey"); // Denna ska också på något sätt
             // koppa upp till databasen. Ingen kod är "röd" men osäker på om projektet inte funkar pga att jag är "disconnected" från databasen eller inte.
             System.out.println("Databasen kopplad till projektet, lyckats!");
            
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
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

        labelID = new javax.swing.JLabel();
        labelLösenord = new javax.swing.JLabel();
        labelTitel = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        loggaIn = new javax.swing.JButton();
        gåTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelID.setText("ID");

        labelLösenord.setText("Lösenord");

        labelTitel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        labelTitel.setText("Logga in som Admin");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        loggaIn.setText("Logga in");
        loggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaInActionPerformed(evt);
            }
        });

        gåTillbaka.setText("Gå tillbaka");
        gåTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gåTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLösenord)
                            .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loggaIn)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gåTillbaka)
                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelTitel)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLösenord)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loggaIn)
                    .addComponent(gåTillbaka))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaInActionPerformed
        // TODO add your handling code here:
        
        String ID = txtUser.getText();
        String password = txtPass.getText(); 
        // boolean okejPassword = false;
        // boolean okejID = false;
        ResultSet resultat1;
        try{
           statement = connection1.createStatement();
           String fraga = "SELECT Agent_ID, Losenord FROM Agent where "
                   + "Agent_ID = '"+ID+"' and Losenord = '"+password+"';";
           
         
                resultat1 = statement.executeQuery(fraga);
                
                
            if(resultat1.next()){
                    dispose();
                    Agent agent = new Agent();
                    agent.show();
            }
            else{
                JOptionPane.showMessageDialog(null, "ID / lösenord är felaktigt");
                txtUser.setText("");
                txtPass.setText("");
                txtUser.requestFocus();
            }                  
        } catch (SQLException | HeadlessException ex) {
            Logger.getLogger(AgentInloggning.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_loggaInActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void gåTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gåTillbakaActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        new Start(idb).setVisible(true);
    }//GEN-LAST:event_gåTillbakaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gåTillbaka;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelLösenord;
    private javax.swing.JLabel labelTitel;
    private javax.swing.JButton loggaIn;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
