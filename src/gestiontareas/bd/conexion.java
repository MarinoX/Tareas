/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontareas.bd;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author joms_
 */
public class conexion {
   private static final String url = "jdbc:mysql://localhost:3306/tareas";
   private static final String user = "admin";
   private static final String password = "admin";
   
   public static Connection conn(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
       
         return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
            return null;
        }
    }
}
