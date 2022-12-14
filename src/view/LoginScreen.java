/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package view;
import models.Student;
import models.User;
import java.sql.*;
import javax.swing.*;
import controller.UserController;
import controller.StudentController;
import controller.TeacherController;
import database.DbConnection;
import models.Teacher;

/**
 *
 * @author HP
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginScreen() {
        initComponents();
    }
    
    public boolean enrollmentStudent(){
        
        boolean isvalid=false;
        String username = tfusername.getText();
        String pass = new String(tfpass.getPassword());
        
        StudentController sc=new StudentController();
        Student student=sc.loginStudent(username, pass);
        if(student!=null){
                    constraint.Constant.loggedInStudent=student;                
                    JOptionPane.showMessageDialog(null, "Welcome to Scholar","Student",
                        JOptionPane.INFORMATION_MESSAGE);
                    new StudentDashboard().setVisible(true);
                    return isvalid=true;
            
        }else{
            return isvalid=false;
            
        }     
       
    }
    
    public boolean enrollmentTeacher(){
        
        String username = tfusername.getText();
        String pass = new String(tfpass.getPassword());
        boolean isvalid=false;
        
        TeacherController sc=new TeacherController();
        Teacher teacher=sc.loginTeacher(username, pass);
        if(teacher!=null){
                    constraint.Constant.loggedInTeacher=teacher;                
                    JOptionPane.showMessageDialog(null, "Welcome to Scholar","Teacher",
                        JOptionPane.INFORMATION_MESSAGE);
                    new teacherDashScreen().setVisible(true);
                    return true;
            
        }else{
            return false;
            
                        // return false;
            
        }     
//        return isvalid;
        
//        Connection conn=DbConnection.getconnection();
//        ResultSet rs;
//        PreparedStatement pst;
//        boolean isvalid=false;
//        String username = tfusername.getText();
//        String pass = new String(tfpass.getPassword());
//        try {
//
//                String query = "Select * from AddTeacher where Username='"+username+"' and Password='"+pass+"' ";
//                
//                Statement smt = conn.createStatement();
//                rs = smt.executeQuery(query);
//                
//            if(rs.next()){
//                    int user_id = rs.getInt(DB_STUDENT_ID);
//                    String user_username = rs.getString(DB_STUDENT_USERNAME);
//                    String user_password = rs.getString(DB_STUDENT_PASSWORD);
//                    String user_email = rs.getString(DB_STUDENT_EMAIL);
//                    User user = new User(user_id,user_username,user_email,user_password);
//
//                    constraint.Constant.loggedInUser=user;
//
//                    JOptionPane.showMessageDialog(null, "Welcome to Scholar","Student",
//                                JOptionPane.INFORMATION_MESSAGE);
//                    return true;
//
//            }else{
//                return false;
//
//                }
//                
//            } catch (HeadlessException | SQLException e) {
//                JOptionPane.showMessageDialog(null, e);
//                System.out.println(e);
//                
//                
//            }
//        
//        
//
//        
//        return isvalid;
    }
    
    public boolean testenrollment(){
        
        String uname = tfusername.getText();
//        String email = user.getuserEmail();
        Connection conn=DbConnection.getconnection();
        
        boolean isExist=false;
        
        try{
        
            String query1="Select * from Admin where username=?";
            String query2="Select * from AddStudent where Username=?";
            String query3="Select * from AddTeacher where Username=?";
            PreparedStatement usernamePST=conn.prepareStatement(query1);
            PreparedStatement studentPST=conn.prepareStatement(query2);
            PreparedStatement TeacherPST=conn.prepareStatement(query3);
            usernamePST.setString(1, uname);
            studentPST.setString(1, uname);
            TeacherPST.setString(1, uname);
            
            ResultSet rs2=studentPST.executeQuery();
            ResultSet rs1=usernamePST.executeQuery();
            ResultSet rs3=TeacherPST.executeQuery();
            if (rs1.next()){
            
                isExist=true;
                lblEnrollment.setText("Admin");
            
            }else if(rs2.next()){
                 isExist=true;
                 lblEnrollment.setText("Student");
            
            }else if(rs3.next()){
                 isExist=true;
                 lblEnrollment.setText("Teacher");
            
            }
            else{
            
            isExist=false;
            lblEnrollment.setText("Invalid Username!!");
            }
        
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null, e); 
        }
        return isExist;
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
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfusername = new javax.swing.JTextField();
        tfpass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnlogin = new javax.swing.JButton();
        btnsignup = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnForgotpass = new javax.swing.JButton();
        lblEnrollment = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/login.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 160, 510, 440);

        jPanel1.setBackground(new java.awt.Color(152, 200, 231));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 2, 30)); // NOI18N
        jLabel4.setText("Log In!");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 60, 140, 42);

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 2, 25)); // NOI18N
        jLabel3.setText("Welcome Back,");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(14, 14, 210, 40);

        tfusername.setBackground(new java.awt.Color(152, 200, 231));
        tfusername.setFont(new java.awt.Font("Leelawadee UI", 0, 17)); // NOI18N
        tfusername.setText("Username or email");
        tfusername.setBorder(null);
        tfusername.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tfusernameMouseMoved(evt);
            }
        });
        tfusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfusernameMouseClicked(evt);
            }
        });
        tfusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfusernameActionPerformed(evt);
            }
        });
        jPanel1.add(tfusername);
        tfusername.setBounds(120, 160, 210, 30);

        tfpass.setBackground(new java.awt.Color(152, 200, 231));
        tfpass.setText("jPasswordField1");
        tfpass.setBorder(null);
        tfpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfpassMouseClicked(evt);
            }
        });
        tfpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpassActionPerformed(evt);
            }
        });
        jPanel1.add(tfpass);
        tfpass.setBounds(126, 227, 209, 22);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(120, 190, 211, 10);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(126, 255, 209, 10);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/icons8-user-30.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 160, 40, 40);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel9.setText("Don't have an account yet?");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 370, 152, 14);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(450, 290, 107, 19);

        btnlogin.setFont(new java.awt.Font("Leelawadee UI", 0, 17)); // NOI18N
        btnlogin.setText("LOG IN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin);
        btnlogin.setBounds(80, 310, 420, 50);

        btnsignup.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnsignup.setText("Sign Up");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel1.add(btnsignup);
        btnsignup.setBounds(10, 390, 140, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/icons8-secure-40-2.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(66, 218, 50, 40);

        btnForgotpass.setBackground(new java.awt.Color(152, 200, 231));
        btnForgotpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/icons8-alzheimer-40.png"))); // NOI18N
        btnForgotpass.setText("Forgot Password?");
        btnForgotpass.setBorderPainted(false);
        btnForgotpass.setContentAreaFilled(false);
        btnForgotpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotpassActionPerformed(evt);
            }
        });
        jPanel1.add(btnForgotpass);
        btnForgotpass.setBounds(390, 247, 180, 60);

        lblEnrollment.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        lblEnrollment.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblEnrollment);
        lblEnrollment.setBounds(350, 160, 180, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(610, 180, 580, 460);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/logo1.png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(540, 0, 160, 140);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1190, 650);

        setSize(new java.awt.Dimension(1200, 654));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfusernameActionPerformed

        tfusername.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_tfusernameActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed

        String username = tfusername.getText();
        String pass = new String(tfpass.getPassword());
        ResultSet rs;


        if(username.equals("") || pass.equals("") ){
            JOptionPane.showMessageDialog(null, "Please fill all the details");
        }else if(enrollmentStudent()==true){
            dispose();
            new StudentDashboard().setVisible(true);
        
        }else if(enrollmentTeacher()==true){
            dispose();
            new teacherDashScreen().setVisible(true);
            
        }else{

            UserController uc=new UserController();
            User user=uc.loginUser(username, pass);
            if(user!=null){
                constraint.Constant.loggedInUser=user;                
                         JOptionPane.showMessageDialog(null, "Welcome to Scholar "+username,"Administration",
                            JOptionPane.INFORMATION_MESSAGE);
                         dispose();
                         new AdminScreen().setVisible(true);
                
            }else{
               JOptionPane.showMessageDialog(null, "Wrong password. Try again","Failed!!",
                         JOptionPane.ERROR_MESSAGE);
                
            }            
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed

       this.dispose();
       new SignupScreen().setVisible(true);
     
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsignupActionPerformed

    private void tfpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpassActionPerformed


        // TODO add your handling code here:
    }//GEN-LAST:event_tfpassActionPerformed

    private void tfpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfpassMouseClicked
        // TODO add your handling code here:
        tfpass.setText("");
    }//GEN-LAST:event_tfpassMouseClicked

    private void tfusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfusernameMouseClicked
        tfusername.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_tfusernameMouseClicked

    private void tfusernameMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfusernameMouseMoved
testenrollment();        // TODO add your handling code here:
    }//GEN-LAST:event_tfusernameMouseMoved

    private void btnForgotpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotpassActionPerformed
        this.dispose();
        new ForgotPssScreen().setVisible(true);
    }//GEN-LAST:event_btnForgotpassActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgotpass;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblEnrollment;
    private javax.swing.JPasswordField tfpass;
    private javax.swing.JTextField tfusername;
    // End of variables declaration//GEN-END:variables
}
