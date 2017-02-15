/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author adria
 */
public class Celda {
    private Prisionero prisionero;
    private int capacidad;
    private int ID;
    /**
     *
     * @param prisionero
     * @param capacidad
     * @param ID
     */
    public Celda(Prisionero prisionero, int capacidad, int ID){
        this.prisionero = prisionero;
        this.capacidad = capacidad;
        this.ID = ID;
    }
    
    public Prisionero getPrisionero(){
        return prisionero;
    }
    public void setPrisionero(Prisionero prisionero){
        prisionero = this.prisionero;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(int capacidad){
        capacidad = this.capacidad;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        ID = this.ID;
    }
    
    
}
