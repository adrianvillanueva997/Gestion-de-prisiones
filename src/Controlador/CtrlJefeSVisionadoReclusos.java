/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ViewJefeSeguridad;
import Vista.VwJefeSVisionadoReclusos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author adria
 */
public class CtrlJefeSVisionadoReclusos implements ActionListener {
    
    VwJefeSVisionadoReclusos vsr;
    ViewJefeSeguridad vjs;
    ControladorJefeSeguridad cjs;
    String usuario;
    
    public CtrlJefeSVisionadoReclusos(VwJefeSVisionadoReclusos vsr) {
        this.vsr = vsr;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vsr.btnAtras)){
            volver();
        }
        
    }
    public void volver(){
        vsr.dispose();
        vjs = new ViewJefeSeguridad();
        cjs = new ControladorJefeSeguridad(vjs, usuario);
        vjs.addController(cjs);
        vjs.crearVentana(usuario);
    }
    
}
