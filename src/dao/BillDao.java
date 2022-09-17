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
import java.sql.*;
import java.util.ArrayList;
import model.Bill;
public class BillDao {
    public static String getId(){
        int id=1;
        try{
            ResultSet rs=dboperations.getData("select Max(id) from bill");
            if(rs.next()){
                id=rs.getInt(1);
                id=id+1;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    public static void save(Bill bill){
        String query="insert into bill values('"+bill.getId()+"','"+bill.getName()+"'"+"','"+bill.getMobileNumber()+"'"+"','"+bill.getEmail()+"'"+"','"+bill.getDate()+"'"+"','"+bill.getDate()+"'"+"','"+bill.getTotal()+"'"+"','"+bill.getCreatedBy()+"')";
        dboperations.setDataOrDelete(query,"Bill saved successfully");
    }
    public static ArrayList<Bill> recordByinc(String date){
        ArrayList<Bill> list=new ArrayList<>();
        try{
            ResultSet rs=dboperations.getData("select * from bill where date like'%"+date+"%'");
            
            while(rs.next()){
                Bill bill=new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setCreatedBy(rs.getString("createdBy"));
                bill.setDate(rs.getString("date"));
                bill.setEmail(rs.getString("emailAddress"));
                bill.setTotal(rs.getString("total"));
                list.add(bill);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return list;
    }
    public static ArrayList<Bill> recordBydsc(String date){
        ArrayList<Bill> list=new ArrayList<>();
        try{
            ResultSet rs=dboperations.getData("select * from bill where date like'%"+date+"%' order by id DESC");
            
            while(rs.next()){
                Bill bill=new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setCreatedBy(rs.getString("createdBy"));
                bill.setDate(rs.getString("date"));
                bill.setEmail(rs.getString("emailAddress"));
                bill.setTotal(rs.getString("total"));
                list.add(bill);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return list;
    }
}
