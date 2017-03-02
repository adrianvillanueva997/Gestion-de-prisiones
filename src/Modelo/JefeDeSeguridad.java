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
public class JefeDeSeguridad extends Seguridad {

    private Bloque bloque;
    
    public JefeDeSeguridad(String nombre, int ID,Bloque bloque) {
        super(nombre, ID);
        this.bloque = bloque;
    }
    /**
     *
     * @return
     */
    public Bloque getBloque(){
        return bloque;
    }
    /**
     *
     * @param bloque
     */
    public void setBloque(Bloque bloque){
        bloque = this.bloque;
    }
    
}
