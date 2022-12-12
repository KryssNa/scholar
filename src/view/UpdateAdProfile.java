/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import constraint.Constant;
import database.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kritimakhatri
 */
public class UpdateAdProfile extends javax.swing.JInternalFrame {

    /**
     * Creates new form UpdateAdProfile
     */
    public UpdateAdProfile() {
        initComponents();
    }
     public void updaterecord(){
    
        int id=Constant.loggedInUser.getUserId();
        String idd=String.valueOf(id);
        lbluser_id.setText(idd);
        tf_username.setText(Constant.loggedInUser.getuserUsername());

        tf_password.setText(Constant.loggedInUser.getuserPass());
        tf_email.setText(Constant.loggedInUser.getuserEmail());
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tf_username = new javax.swing.JTextField();
        tf_password = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label3 = new java.awt.Label();
        label7 = new java.awt.Label();
        tf_email = new javax.swing.JTextField();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        btn_editDetails = new javax.swing.JButton();
        lbluser_id = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1060, 650));
        jPanel1.setLayout(null);

        tf_username.setBackground(java.awt.Color.black);
        tf_username.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        tf_username.setForeground(new java.awt.Color(255, 51, 51));
        tf_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_username.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tf_username);
        tf_username.setBounds(670, 170, 190, 30);

        tf_password.setBackground(java.awt.Color.black);
        tf_password.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        tf_password.setForeground(new java.awt.Color(255, 51, 51));
        tf_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_password.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tf_password);
        tf_password.setBounds(670, 240, 190, 30);

        label1.setBackground(java.awt.Color.black);
        label1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Update Profile");
        jPanel1.add(label1);
        label1.setBounds(400, 60, 160, 28);

        label3.setBackground(java.awt.Color.black);
        label3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 255, 51));
        label3.setText("User ID:");
        jPanel1.add(label3);
        label3.setBounds(110, 200, 86, 23);

        label7.setBackground(java.awt.Color.black);
        label7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 255, 51));
        label7.setText("Email:");
        jPanel1.add(label7);
        label7.setBounds(110, 260, 90, 23);

        tf_email.setBackground(java.awt.Color.black);
        tf_email.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        tf_email.setForeground(new java.awt.Color(255, 51, 51));
        tf_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_email.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tf_email);
        tf_email.setBounds(240, 250, 190, 30);

        label11.setBackground(java.awt.Color.black);
        label11.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        label11.setForeground(new java.awt.Color(0, 255, 51));
        label11.setText("Username:");
        jPanel1.add(label11);
        label11.setBounds(530, 170, 110, 30);

        label12.setBackground(java.awt.Color.black);
        label12.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        label12.setForeground(new java.awt.Color(0, 255, 51));
        label12.setText("Password:");
        jPanel1.add(label12);
        label12.setBounds(520, 240, 120, 30);

        btn_editDetails.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        btn_editDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/icons8-pencil-35.png"))); // NOI18N
        btn_editDetails.setText("Save Details");
        btn_editDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_editDetails);
        btn_editDetails.setBounds(390, 340, 170, 40);

        lbluser_id.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        lbluser_id.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbluser_id);
        lbluser_id.setBounds(230, 190, 130, 40);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/FrameBG.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editDetailsActionPerformed
                try{
                    String password=tf_password.getText();
                    String username=tf_username.getText();
                    String email=tf_email.getText();
                    String tec_idd=lbluser_id.getText();
                    int ttid=Integer.parseInt(tec_idd);
                    
                    String query="update Admin set Password='"+password+"', username='"+username+"', "
                    + "email='"+email+"' where user_id='"+ttid+"'";
                    Connection conn=DbConnection.getconnection();
                    PreparedStatement pst=conn.prepareStatement(query);
                    int isupdated=pst.executeUpdate();
                    if(isupdated>0){
                    
                        JOptionPane.showMessageDialog(null, "Details Updated Succesfully","Success",JOptionPane.INFORMATION_MESSAGE);
                        updaterecord();
                    
                    }}catch(SQLException e){
                    
                        System.out.println(e);
                    
                    }
        
        
    }//GEN-LAST:event_btn_editDetailsActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        
        int id=Constant.loggedInUser.getUserId();
        String idd=String.valueOf(id);
        lbluser_id.setText(idd);
        tf_username.setText(Constant.loggedInUser.getuserUsername());

        tf_password.setText(Constant.loggedInUser.getuserPass());
        tf_email.setText(Constant.loggedInUser.getuserEmail());
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label3;
    private java.awt.Label label7;
    private javax.swing.JLabel lbluser_id;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
