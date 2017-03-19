/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ViewAlguacil;
import Vista.VwAlguacilGReclusos;
import Vista.VwFormularioRecluso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class CtrlAlguacilGestionReclusos implements ActionListener{
    public VwAlguacilGReclusos vr;
    public ViewAlguacil va;
    public VwFormularioRecluso vfr;
    public String usuario;
    
    public CtrlAlguacilGestionReclusos(VwAlguacilGReclusos vr){
        this.vr = vr;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vr.btnAtras)){
            volver();
        }else if(e.getSource().equals(vr.btnanadir)){
            formulario();
        }
    }
    public void volver(){
        vr.dispose();
        va = new ViewAlguacil();
        ControladorAlguacil cr = new ControladorAlguacil(va,usuario);
        va.addController(cr);
        va.crearVentana(usuario);
    }
    
    public void formulario(){
        vfr = new VwFormularioRecluso();
        CtrlFormularioRecluso cfr = new CtrlFormularioRecluso(vfr);
        vfr.addController(cfr);
        vfr.crearVentanaFormularioRecluso(usuario);
    }
    
}
