/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import view.LandingScreen;
import database.DbConnection;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class NewSettingScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form LogoutScreen
     */
    public NewSettingScreen() {
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

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/password c.png"))); // NOI18N
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(360, 250, 200, 30);

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/kkkkk.png"))); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logout);
        btn_logout.setBounds(360, 370, 200, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/deactive.png"))); // NOI18N
        jButton2.setText("Deactivate Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(360, 310, 200, 30);

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/icons8-settings-58.png"))); // NOI18N
        jLabel2.setText("Settings");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 60, 250, 80);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/icons8-password-reset-100.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(730, 260, 110, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/icons8-denied-100.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(670, 330, 110, 100);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\icons8-webpage-log-out-of-personal-account-layout-100.png")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(820, 330, 100, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/FrameBG.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 990, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ChangingPassScreen cp=new ChangingPassScreen();
        jPanel1.removeAll();
        jPanel1.add(cp);
        cp.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        int value=JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout?", "Logout", JOptionPane.YES_NO_OPTION);
        System.out.println(value);
        if(value==0){
        
            constraint.Constant.loggedInUser=null;
            constraint.Constant.loggedInStudent=null;
            constraint.Constant.loggedInTeacher=null;
            dispose();
            new LoginScreen().setVisible(true);
            
        }else if(value==1){
        
        }
        
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
     int getvalue=   JOptionPane.showConfirmDialog(null, "Are you Sure you want to deactivate? Your account will be deleted permanently", "Deactivate Account", JOptionPane.YES_NO_CANCEL_OPTION);
     if(getvalue==0){
         PreparedStatement pst;
         Connection conn=DbConnection.getconnection();
         String uname="";
         if(constraint.Constant.loggedInUser !=null){
             uname=constraint.Constant.loggedInUser.getuserUsername();
             String sql ="delete from Admin where username=? ";
            try{
                pst=conn.prepareStatement(sql);
                pst.setString(1, uname);
                pst.execute();

                JOptionPane.showMessageDialog(null,"Account Deactivated");
            this.dispose();
                new LandingScreen().setVisible(true);
            }catch(Exception e){

                JOptionPane.showMessageDialog(null, e);}
         } else if(constraint.Constant.loggedInStudent !=null){
             uname=constraint.Constant.loggedInStudent.getUsername();
             String sql ="delete from AddStudent where Username=? ";
            try{
                pst=conn.prepareStatement(sql);
                pst.setString(1, uname);
                pst.execute();

                JOptionPane.showMessageDialog(null,"Account Deactivated");
               
            }catch(Exception e){

                JOptionPane.showMessageDialog(null, e);}
             this.dispose();
                new LandingScreen().setVisible(true);
         } else if(constraint.Constant.loggedInTeacher !=null){
             uname=constraint.Constant.loggedInTeacher.getUsername();
             String sql ="delete from AddTeacher where Username=? ";
            try{
                pst=conn.prepareStatement(sql);
                pst.setString(1, uname);
                pst.execute();

                JOptionPane.showMessageDialog(null,"Account Deactivated");

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, e);}
             this.dispose();
                new LandingScreen().setVisible(true);
             
         }else{
             System.out.println("Some error occured");
//         String sql ="delete from AddStudent where std_id=? ";
//            try{
//                pst=conn.prepareStatement(sql);
//                pst.setString(1, uname);
//                pst.execute();
//
//                JOptionPane.showMessageDialog(null,"Record Deleted");
//
//            }catch(Exception e){
//
//                JOptionPane.showMessageDialog(null, e);
//         
     }}
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
