/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author BENJAMIN DUTTA
 */

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Catagory;
public class CatagoryDao {
    public static void save(Catagory catagory){
        String query="insert into catagory(catagoryName) values(+'"+catagory.getName()+"')";
        dboperations.setDataOrDelete(query,"Catagory added successfully!");
                
    }
    public static ArrayList<Catagory> getAllRecords(){
        ArrayList<Catagory> arrayList=new ArrayList<>();
        
       try{
            ResultSet rs=dboperations.getData("select * from catagory");
            while(rs.next()){
                Catagory newCatagory=new Catagory();
                newCatagory.setId(rs.getInt("id"));
                newCatagory.setName(rs.getString("catagoryName"));
                arrayList.add(newCatagory);
            }
            
       }catch(Exception  e){
           JOptionPane.showMessageDialog(null, e);
       }
        return arrayList;
    }
    public static void delete(String id){
        String query="delete from catagory where id="+id;
        dboperations.setDataOrDelete(query,"Query Deleted Successfully");
        
    }
}
