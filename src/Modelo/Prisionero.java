/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class Prisionero {
    private String nombre;
    private String delito;
    private int ID;
    private int identificadorDelito;
    /**
     *
     * @param nombre
     * @param ID
     * @param delito
     * @param identificadorDelito
     */
    public Prisionero(String nombre, int ID, String delito, int identificadorDelito){
        this.nombre = nombre;
        this.ID = ID;
        this.delito = delito;
        this.identificadorDelito = identificadorDelito;
        
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
    /**
     *
     * @return
     */
    public String getDelito(){
        return delito;
    }
    /**
     *
     * @param delito
     */
    public void setDelito(String delito){
        delito = this.delito;
    }
    /**
     *
     * @return
     */
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
    /**
     *
     * @return
     */
    public int getidentificadorDelito(){
        return identificadorDelito;
    }
    /**
     *
     * @param identificador
     */
    public void setidentificadorDelito(int identificador){
        identificador = this.identificadorDelito;
    }
    
}
