/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Vector;

/**
 *
 * @author adria
 */
class Bloque {
    private Vector<Prisionero> listaPrisioneros = new Vector<Prisionero>();
    private Vector<Celda> listaCeldas = new Vector<Celda>();
    
    public Bloque(Vector<Prisionero> listaPrisioneros,Vector<Celda> listaCeldas){
        this.listaPrisioneros = listaPrisioneros;
        this.listaCeldas = listaCeldas;
    }
    
    public Vector<Prisionero> getlistabloques(){
        return listaPrisioneros;
    }
    public void setListaprisioneros(Vector<Prisionero> listaPrisioneros){
        listaPrisioneros = this.listaPrisioneros;
    }
    public Vector<Celda> getListaceldas(){
        return listaCeldas;
    }
    public void setListaceldas(Vector<Celda> listaCeldas){
        listaCeldas = this.listaCeldas;
    }
    

}
