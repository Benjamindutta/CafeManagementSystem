/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author BENJAMIN DUTTA
 */
public class Tables {
    public static void main(String args[]){
        try{
            String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
            String adminDetails="insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','Gohain Tekela Gaon','admin','What was your primary School you attend','ebc','true')";
            String catagoryTable="create table catagory(id int AUTO_INCREMENT primary key,catagoryName varchar(200))";
            String ProductTable="create table product(id int AUTO_INCREMENT primary key,name varchar(200),catagory varchar(200),price varchar(200))";
            String BillTable="create table bill(id int primary key,name varchar(200),mobileNumber varchar(200),emailAddress varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
//            dboperations.setDataOrDelete(adminDetails, "Admin details updated successfully!");
//            dboperations.setDataOrDelete(userTable, "Table created Successfully!");
//            dboperations.setDataOrDelete(ProductTable, "Product Table created Successfully!");
            dboperations.setDataOrDelete(BillTable, "Bill Table created Successfully!");

            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
