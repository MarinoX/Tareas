/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontareas.Clases;

import java.time.LocalDate;

/**
 *
 * @author joms_
 */
public class Tarea {
    public int id;
    public String nombre;
    public String descripcion;
    public String status;
    public LocalDate limite;
    
    public Tarea(){}

    public Tarea(int id,String nombre, String descripcion, String status, LocalDate limite) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.status = status;
        this.limite = limite;
    }

     /*
    * GETTERS, SETTERS Y ARRIBA LOS CONSTRUCTORES
    *
    */
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getLimite() {
        return limite;
    }

    public void setLimite(LocalDate limite) {
        this.limite = limite;
    }
    
}
