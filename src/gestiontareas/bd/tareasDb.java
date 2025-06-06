/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontareas.bd;

import gestiontareas.Clases.Tarea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;


/**
 *
 * @author joms_
 */
public class tareasDb {
    private Connection con;
    private PreparedStatement ps;
    
     /*
    * SE IMPLEMENTAron TRES METODOS PARA REGISTRAR,MODIFICAR Y BUSCAR TAREAS
    *
    */
    
    public boolean RegistrarTarea(Tarea t){
        con = conexion.conn();
        
        if ( con == null){
            System.out.println("No se pudo conectar con la DB");
            return false;
        }
        
    String sql = "INSERT INTO tarea (nombre, descripcion, status, fecha) VALUES (?,?,?,?)";

    
    try{
        ps = con.prepareStatement(sql);
        ps.setString(1, t.getNombre());
        ps.setString(2, t.getDescripcion());
        ps.setString(3, t.getStatus());
        ps.setDate(4, java.sql.Date.valueOf(t.getLimite()));

    
        ps.executeUpdate();
        return true;
    }catch (Exception e){
        System.out.println("Error al agregar tarea :" + e.getMessage());
        return false;
    } finally{
        try{
            if (ps != null) ps.close();
            if (con != null) con.close();
        }catch (SQLException e){
            System.out.println("Error al cerrar la conexion :" + e.getMessage());
        }
    }
    }
    
   
    
    public boolean ModificarTarea(Tarea t){
        con = conexion.conn();
        
        if (con == null){
            System.out.println("No se pudo conectar a la base de datos");
            return false;
        }
    String sql = "UPDATE tarea SET nombre=?, descripcion=?, status=?, fecha=? WHERE id=?";

    
    try{
        ps = con.prepareStatement(sql);
        ps.setString(1, t.getNombre());
        ps.setString(2, t.getDescripcion());
        ps.setString(3, t.getStatus());
        ps.setDate(4, java.sql.Date.valueOf(t.getLimite()));
        ps.setInt(5, t.getId());
    
        ps.executeUpdate();
        return true;
    }catch (Exception e){
        System.out.println("Error al modificar la tarea :" + e.getMessage());
        return false;
    } finally{
        try{
            if (ps != null) ps.close();
            if (con != null) con.close();
        }catch (SQLException e){
            System.out.println("Error al cerrar la conexion :" + e.getMessage());
        }
    }
    }
    
     /*
    * EL USO DEL METODO BUSCAR TAREA POR ID SE USA PARA LLAMAR LA DATA DE MODIFICAR
    *
    */
    
    public Tarea BuscarTareaPorId(int id) {
    con = conexion.conn();

    if (con == null) {
        System.out.println("No se pudo conectar a la base de datos");
        return null;
    }

    String sql = "SELECT * FROM tarea WHERE id = ?";
    Tarea tarea = null;

    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            tarea = new Tarea();
            tarea.setId(rs.getInt("id"));
            tarea.setNombre(rs.getString("nombre"));
            tarea.setDescripcion(rs.getString("descripcion"));
            tarea.setStatus(rs.getString("status"));
            java.sql.Date fechaSql = rs.getDate("fecha");
            if (fechaSql != null) {
                tarea.setLimite(fechaSql.toLocalDate());
            }
        }
    } catch (Exception e) {
        System.out.println("Error al buscar la tarea :" + e.getMessage());
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión :" + e.getMessage());
        }
    }

    return tarea;
}

}
