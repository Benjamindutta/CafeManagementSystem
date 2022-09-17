package dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BENJAMIN DUTTA
 * 
 */
import javax.swing.JOptionPane;
import model.UserClass;
import java.sql.*;
import java.util.*;

public class UserDao {
    public static void save(UserClass user){
        String query="insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobilenumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurityQuestion()+"','"+user.getAnswer()+"','false')";
        System.out.println(query);
        dboperations.setDataOrDelete(query,"Registered successfully!");
        
    }
    
    public static UserClass getSecurityQuestion(String email){
        UserClass user=null;
        try{
            ResultSet rs=dboperations.getData("select * from user where email='"+email+"'");
            while(rs.next()){
                user=new UserClass();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    public static UserClass login(String email,String password){
        UserClass user=null;
        try{
            ResultSet rs=dao.dboperations.getData("select * from user where email='"+email+"' and password='"+password+"'");
            while(rs.next()){
                user=new UserClass();
                user.setStatus(rs.getString("status"));
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    public static void updatePassword(String email,String password){
        String query="update user set password='"+password+"' where email='"+email+"'";
        dboperations.setDataOrDelete(query,"Password Set successfully");
    }
    public static ArrayList<UserClass> getAllUsers(String email){
        ArrayList<UserClass> list=new ArrayList<>();
        
        try{
            ResultSet rs=dboperations.getData("select * from user where email like '%"+email+"%'");
            while(rs.next()){
                UserClass user=new UserClass();
                user.setId(rs.getInt("id"));
                user.setAddress(rs.getString("address"));
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setMobilenumber(rs.getString("mobileNumber"));
                user.setName(rs.getString("name"));
                user.setStatus(rs.getString("status"));
                user.setEmail(rs.getString("email"));
                list.add(user);
            }
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, e);
        }
        return list;
    }
    public static void updateStatus(String email,String status){
        String query="Update user set status='"+status+"' where email='"+email+"'";
        dboperations.setDataOrDelete(query,"Status Updated successfully!");
    }
}
