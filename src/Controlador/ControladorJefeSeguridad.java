/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ViewJefeSeguridad;

/**
 *
 * @author adria
 */
public class ControladorJefeSeguridad {
    public String usuario;
    ViewJefeSeguridad vjs;

    /**
     *
     * @param vjs
     * @param usuario
     */
    public ControladorJefeSeguridad(ViewJefeSeguridad vjs,String usuario){
        super();
        this.vjs = vjs;
        this.usuario = usuario;
    }
    
}
