/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Adrián Villanueva Martínez
 */
class Empleado {
    private String nombre;
    private int ID;
    
    public Empleado(String nombre, int ID){
        this.nombre = nombre;
        this.ID = ID;
        
    }
    public String getNombre(){
        return nombre;
    }
    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre){
        nombre = this.nombre;
    }
    public int getID(){
        return ID;
    }
    /**
     *
     * @param id
     */
    public void setID(int id){
        id = this.ID;
    }
}
