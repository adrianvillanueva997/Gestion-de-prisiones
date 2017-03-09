/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ViewSeguridad;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class ControladorSeguridad {
    public String usuario;
    ViewSeguridad vjs;

    /**
     *
     * @param vjs
     * @param usuario
     */
    public ControladorSeguridad(ViewSeguridad vjs,String usuario){
        this.usuario = usuario;
        this.vjs = vjs;
    }
}
