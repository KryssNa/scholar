/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import constraint.Constant;
import database.DbConnection;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kritimakhatri
 */
public class UpdateProfileScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form UpdateProfileScreen
     */
    public UpdateProfileScreen() {
        initComponents();
    }
    public void updaterecord(){
        
        if(Constant.loggedInTeacher !=null){
    
        int id=Constant.loggedInTeacher.getTeacher_id();
        String idd=String.valueOf(id);
        lbluser_id.setText(idd);
        tf_username.setText(Constant.loggedInTeacher.getUsername());
        tf_Fname.setText(Constant.loggedInTeacher.getFname());
        tf_Sname.setText(Constant.loggedInTeacher.getSname());
        tf_address.setText(Constant.loggedInTeacher.getAddress());
        tf_contact.setText(Constant.loggedInTeacher.getContact());
        tf_password.setText(Constant.loggedInTeacher.getPassword());
        lblcourse.setText(Constant.loggedInTeacher.getCourse_name());
        tf_dob.setText(Constant.loggedInTeacher.getDob());
        tf_dob.setText(Constant.loggedInTeacher.getEmail());
        lblgender.setText(Constant.loggedInTeacher.getGender());
    
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

        jPanel1 = new javax.swing.JPanel();
        tf_address = new javax.swing.JTextField();
        tf_username = new javax.swing.JTextField();
        tf_password = new javax.swing.JTextField();
        tf_contact = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label7 = new java.awt.Label();
        tf_Sname = new javax.swing.JTextField();
        tf_dob = new javax.swing.JTextField();
        tf_email1 = new javax.swing.JTextField();
        tf_Fname = new javax.swing.JTextField();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        lblgender = new javax.swing.JLabel();
        lblcourse = new javax.swing.JLabel();
        lbluser_id = new javax.swing.JLabel();
        btn_editDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1060, 650));
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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_address.setBackground(new java.awt.Color(0, 0, 0));
        tf_address.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        tf_address.setForeground(new java.awt.Color(255, 51, 51));
        tf_address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_address.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tf_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 243, 190, 30));

        tf_username.setBackground(new java.awt.Color(0, 0, 0));
        tf_username.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        tf_username.setForeground(new java.awt.Color(255, 51, 51));
        tf_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_username.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 303, 190, 30));

        tf_password.setBackground(new java.awt.Color(0, 0, 0));
        tf_password.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        tf_password.setForeground(new java.awt.Color(255, 51, 51));
        tf_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_password.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 353, 190, 30));

        tf_contact.setBackground(new java.awt.Color(0, 0, 0));
        tf_contact.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        tf_contact.setForeground(new java.awt.Color(255, 51, 51));
        tf_contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_contact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_contact.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tf_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_contactActionPerformed(evt);
            }
        });
        jPanel1.add(tf_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 190, 30));

        label1.setBackground(java.awt.Color.black);
        label1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Update Profile");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 220, 60));

        label2.setBackground(java.awt.Color.black);
        label2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 255, 51));
        label2.setText("Name:");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 193, 90, 30));

        label3.setBackground(java.awt.Color.black);
        label3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 255, 51));
        label3.setText("User ID:");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, 23));

        label4.setBackground(java.awt.Color.black);
        label4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 255, 51));
        label4.setText("D.O.B:");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 243, 80, 30));

        label5.setBackground(java.awt.Color.black);
        label5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 255, 51));
        label5.setText("Email:");
        jPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 293, 90, 30));

        label7.setBackground(java.awt.Color.black);
        label7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 255, 51));
        label7.setText("Gender:");
        jPanel1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 90, 23));

        tf_Sname.setBackground(new java.awt.Color(0, 0, 0));
        tf_Sname.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        tf_Sname.setForeground(new java.awt.Color(255, 51, 51));
        tf_Sname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Sname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_Sname.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tf_Sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_SnameActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 90, 30));

        tf_dob.setBackground(java.awt.Color.black);
        tf_dob.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        tf_dob.setForeground(new java.awt.Color(255, 51, 51));
        tf_dob.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_dob.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_dob.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tf_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 190, 30));

        tf_email1.setBackground(new java.awt.Color(0, 0, 0));
        tf_email1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        tf_email1.setForeground(new java.awt.Color(255, 51, 51));
        tf_email1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_email1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_email1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tf_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 288, 190, 30));

        tf_Fname.setBackground(new java.awt.Color(0, 0, 0));
        tf_Fname.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        tf_Fname.setForeground(new java.awt.Color(255, 51, 51));
        tf_Fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Fname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_Fname.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tf_Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_FnameActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 100, 30));

        label8.setBackground(java.awt.Color.black);
        label8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        label8.setForeground(new java.awt.Color(0, 255, 51));
        label8.setText("Contact:");
        jPanel1.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 100, 30));

        label9.setBackground(java.awt.Color.black);
        label9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        label9.setForeground(new java.awt.Color(0, 255, 51));
        label9.setText("Course:");
        jPanel1.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 100, 30));

        label10.setBackground(java.awt.Color.black);
        label10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        label10.setForeground(new java.awt.Color(0, 255, 51));
        label10.setText("Address:");
        jPanel1.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 243, 90, 30));

        label11.setBackground(java.awt.Color.black);
        label11.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        label11.setForeground(new java.awt.Color(0, 255, 51));
        label11.setText("Username:");
        jPanel1.add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 303, 110, 30));

        label12.setBackground(java.awt.Color.black);
        label12.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        label12.setForeground(new java.awt.Color(0, 255, 51));
        label12.setText("Password:");
        jPanel1.add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 120, 30));

        lblgender.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        lblgender.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 190, 30));

        lblcourse.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        lblcourse.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 190, 30));

        lbluser_id.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        lbluser_id.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbluser_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 190, 30));

        btn_editDetails.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        btn_editDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/icons8-pencil-35.png"))); // NOI18N
        btn_editDetails.setText("Save Details");
        btn_editDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_editDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 170, 40));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/FrameBG.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_FnameActionPerformed

    private void tf_SnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_SnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_SnameActionPerformed

    private void tf_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_contactActionPerformed

    private void btn_editDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editDetailsActionPerformed
        
//        int id=Constant.loggedInTeacher.getTeacher_id();
//        String idd=String.valueOf(id);
//        lbluser_id.setText(idd);
//        tf_username.setText(Constant.loggedInTeacher.getUsername());
//        tf_Fname.setText(Constant.loggedInTeacher.getFname());
//        tf_Sname.setText(Constant.loggedInTeacher.getSname());
//        tf_address.setText(Constant.loggedInTeacher.getAddress());
//        tf_contact.setText(Constant.loggedInTeacher.getContact());
//        tf_password.setText(Constant.loggedInTeacher.getPassword());
//        lblcourse.setText(Constant.loggedInTeacher.getCourse_name());
//        tf_dob.setText(Constant.loggedInTeacher.getDob());
//        
//        if(evt.getSource()==btn_editDetails){
//            
 int value=JOptionPane.showConfirmDialog(null, "Are you sure you want to Update details?", "Update details", JOptionPane.YES_NO_OPTION);
        if(value==0){ 
                try{
                    String fname=tf_Fname.getText();
                    String sname=tf_Sname.getText();
                    String address=tf_address.getText();
                    String email=tf_dob.getText();
                    String contact=tf_contact.getText();
                    String password=tf_password.getText();
                    String username=tf_username.getText();
                    String dob=tf_dob.getText();
                    String tec_idd=lbluser_id.getText();
                    int ttid=Integer.parseInt(tec_idd);
                    
                    String query="update AddTeacher set FirstName='"+fname+"', SurName='"+sname+"', "
                    + "DOB='"+dob+"',Email='"+email+"',Contact='"+contact+"',Address='"+address+"', "
                    + "Username='"+username+"',Password='"+password+"' where teacher_id='"+ttid+"'";
                    
                    Connection conn=DbConnection.getconnection();
                    PreparedStatement pst=conn.prepareStatement(query);
                    int isupdated=pst.executeUpdate();
                    if(isupdated>0){
                    
                        JOptionPane.showMessageDialog(null, "Details Updated Succesfully","Success",JOptionPane.INFORMATION_MESSAGE);
                        updaterecord();
                    
                    }
                    
                    
                
                    
                }catch(HeadlessException | NumberFormatException | SQLException e){
                
                    System.out.println("SQL Error:"+e);
                }
            
                          
        }
        
        
        
    }//GEN-LAST:event_btn_editDetailsActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        
        if(Constant.loggedInTeacher !=null){
         int id=Constant.loggedInTeacher.getTeacher_id();
        String idd=String.valueOf(id);
        lbluser_id.setText(idd);
        tf_username.setText(Constant.loggedInTeacher.getUsername());
        tf_Fname.setText(Constant.loggedInTeacher.getFname());
        tf_Sname.setText(Constant.loggedInTeacher.getSname());
        tf_address.setText(Constant.loggedInTeacher.getAddress());
        tf_contact.setText(Constant.loggedInTeacher.getContact());
        tf_password.setText(Constant.loggedInTeacher.getPassword());
        lblcourse.setText(Constant.loggedInTeacher.getCourse_name());
        tf_dob.setText(Constant.loggedInTeacher.getDob());
        tf_dob.setText(Constant.loggedInTeacher.getEmail());
        lblgender.setText(Constant.loggedInTeacher.getGender());
        }
    
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JLabel lblcourse;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lbluser_id;
    private javax.swing.JTextField tf_Fname;
    private javax.swing.JTextField tf_Sname;
    private javax.swing.JTextField tf_address;
    private javax.swing.JTextField tf_contact;
    private javax.swing.JTextField tf_dob;
    private javax.swing.JTextField tf_email1;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
