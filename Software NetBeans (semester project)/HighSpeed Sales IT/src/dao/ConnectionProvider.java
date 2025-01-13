/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tolga
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://3.69.96.96:80/db6","db6","!db6.covid23?WS1");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        
        }
    
    }
    
}
