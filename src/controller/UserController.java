package controller;

import static constraint.Constant.*;
import java.sql.*;
import database.DbConnection;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import models.User; 

public class UserController {
    Connection conn=DbConnection.getconnection();
    ResultSet rs;
    PreparedStatement pst;
    DbConnection db=new DbConnection();


    //    fetching username and password----for login
    public User loginUser(String username, String password) {
        User user = null;
        try {
            String query;
            query = "select * from Admin where username =? and password =?";
            pst = DbConnection.getconnection().prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = db.retrieve(pst);
            while (rs.next()) {
                int user_id = rs.getInt(DB_USER_ID);
                String user_username = rs.getString(DB_USER_USERNAME);
                String user_password = rs.getString(DB_USER_PASSWORD);
                String user_email = rs.getString(DB_EMAIL);
                user = new User(user_id,user_username,user_email,user_password);
                return user;
            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
        return user;
    }
        //    fetching username and password----for login
    public User fetchUserDetails(String username, String password) {
        User user = null;
        try {
            String query;
            query = "select * from Admin where username =? and password =?";
            pst = DbConnection.getconnection().prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = db.retrieve(pst);
            while (rs.next()) {
                user = new User();
                user.SETUserID(rs.getInt("email"));
                // Login.CUSTOMER_ID=rs.getInt("custId");
            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
        return user;
    }
    

    public int testUser(User newuser) {
              
        String username =newuser.getuserUsername();
        String password = newuser.getuserPass();
        try {
                
                Connection conn=DbConnection.getconnection();
                String query = "Select * from Admin where username='"+username+"' and password='"+password+"' ";
                
                Statement smt = conn.createStatement();
                rs = smt.executeQuery(query);
                
            if(rs.next()){

                JOptionPane.showMessageDialog(null, "You have logged in successfully","Success",
                            JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(null, "Wrong password. Try again","Failed!!",
                            JOptionPane.ERROR_MESSAGE);
                
            }
                
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
                System.out.println(e);
                
                
            }
        return 0;
       
    }

    public int insertuser(User user) {
        String uname = user.getuserUsername();
        String email = user.getuserEmail();
        String pass = user.getuserPass();
//        String cpass = user.getuserCpass();
        int isinserted=0;
        try{
        String insertQuery ="insert into Admin(username,password,email)"
                + "values('"+uname+"','"+pass+"','"+email+"')";
        conn =  DbConnection.getconnection();
        PreparedStatement pst=conn.prepareStatement(insertQuery);
        isinserted=pst.executeUpdate();
//        if(isinserted >0){
//            return 1;       
//        }else{
//        return 0;
//                }
        
     
        }
        catch(SQLException e){
        
            JOptionPane.showMessageDialog(null, e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return isinserted;
       
    }
    
    public boolean validateduplicatedata(User user){
        String uname = user.getuserUsername();
        String email = user.getuserEmail();
        
        boolean isExist=false;
        
        try{
        
            String query1="Select * from Admin where username=?";
            String query2="Select * from Admin where email=?";
            PreparedStatement usernamePST=conn.prepareStatement(query1);
            PreparedStatement emailPST=conn.prepareStatement(query2);
            usernamePST.setString(1, uname);
            emailPST.setString(1, email);
            
            ResultSet rs2=emailPST.executeQuery();
            ResultSet rs1=usernamePST.executeQuery();
            if (rs1.next()){
            
                isExist=true;
                JOptionPane.showMessageDialog(null, "Username Already Exist!!","Duplicate Data",JOptionPane.ERROR_MESSAGE);
            
            }else if(rs2.next()){
                 isExist=true;
                JOptionPane.showMessageDialog(null, "Email Already Exist!!","Duplicate Data",JOptionPane.ERROR_MESSAGE);
            
            }
            else{
            
            isExist=false;}
        
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null, e); 
        }
        return isExist;

}

}