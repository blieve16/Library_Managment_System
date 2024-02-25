/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
//"jdbc:mysql://localhost:3306/lms", "root", "ayushsingh16"
//"com.mysql.cj.jdbc.Driver"
public class DBConnection {
    
    static Connection con;
    
    
    public static Connection getConnection() throws Exception{
       
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "ayushsingh16");
//            System.out.println("Connection Established");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return con;

            if(con != null) return con;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("No database");
        }

        String connectionURL = "jdbc:mysql://localhost:3306/lms";
        con = DriverManager.getConnection(connectionURL, "root", "ayushsingh16");        
    return con;
    }

    public void close(){
        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
            }
        }
    }
}
