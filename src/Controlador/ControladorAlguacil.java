/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ViewAlguacil;

/**
 *
 * @author adria
 */
public class ControladorAlguacil {
    public String usuario;
    ViewAlguacil va;

    /**
     *
     * @param va
     * @param usuario
     */
    public ControladorAlguacil(ViewAlguacil va,String usuario){
        super();
        this.va = va;
        this.usuario = usuario;
    }
    
}
