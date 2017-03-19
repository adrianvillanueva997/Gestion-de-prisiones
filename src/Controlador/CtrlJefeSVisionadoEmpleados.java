/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ViewJefeSeguridad;
import Vista.VwJefeSVisionadoEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author adria
 */
public class CtrlJefeSVisionadoEmpleados implements ActionListener {
    
    VwJefeSVisionadoEmpleados vse;
    ViewJefeSeguridad vjs;
    ControladorJefeSeguridad cjs;
    public String usuario;
    
    public CtrlJefeSVisionadoEmpleados(VwJefeSVisionadoEmpleados vse) {
        this.vse = vse;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vse.btnAtras)){
            volver();
        }
    }
    public void volver(){
        vse.dispose();
        vjs = new ViewJefeSeguridad();
        cjs = new ControladorJefeSeguridad(vjs, usuario);
        vjs.addController(cjs);
        vjs.crearVentana(usuario);
    }
}
