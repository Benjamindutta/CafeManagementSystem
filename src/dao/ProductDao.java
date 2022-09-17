/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author BENJAMIN DUTTA
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Product;
import java.sql.*;

public class ProductDao {
    public static void save(Product product){
        String query="insert into product(name,catagory,price) values('"+product.getName()+"','"+product.getCatagory()+"','"+product.getPrice()+"')";
        dboperations.setDataOrDelete(query,"Product added Successfully!");
    }
    public static ArrayList<Product> getAllrecords(){
        ArrayList<Product> list=new ArrayList<>();
        try{
            ResultSet rs=dboperations.getData("select * from product");
            while(rs.next()){
                Product product=new Product();
                product.setId(rs.getInt("id"));
                product.setCatagory(rs.getString("catagory"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getString("price"));
                
                list.add(product);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        return list;
    }
    public static void update(Product product){
        String query="update product set name='"+product.getName()+"',catagory ='"+product.getCatagory()+"',price='"+product.getPrice()+"' where id='"+product.getId()+"'";
        dboperations.setDataOrDelete(query,"Product updated successfully!");
        
    }
    
    public static void delete(String id){
            String query="delete from product where id='"+id+"'";
            dboperations.setDataOrDelete(query,"Product deleted successfully!");
    }
    public static ArrayList<Product> getAllRecordsByCategory(String category){
        ArrayList<Product> list=new ArrayList<>();
        
        try{
            ResultSet rs=dboperations.getData("select * from product where catagory='"+category+"'");
            while(rs.next()){
                Product product=new Product();
                product.setName(rs.getString("name"));
                list.add(product);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    public static ArrayList<Product> getAllRecordsByName(String name,String category){
        ArrayList<Product> list=new ArrayList<>();
        
        try{
            ResultSet rs=dboperations.getData("select * product where name like '%"+name+"'% catagory='"+category+"'");
            while(rs.next()){
                Product product=new Product();
                product.setName(rs.getString("name"));
                list.add(product);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    public static Product getProductByName(String name){
        Product product=new Product();
        try{
            ResultSet rs=dboperations.getData("select * from product where name='"+name+"'");
            product.setCatagory(rs.getString("catagory"));
            product.setName(rs.getString("name"));
            product.setId(rs.getInt("id"));
            product.setPrice(rs.getString("price"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return product;
    }
}
