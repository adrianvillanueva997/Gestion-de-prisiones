/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ViewAlguacil;
import Vista.VwAlguacilGReclusos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class CtrlAlguacilGestionReclusos implements ActionListener{
    public VwAlguacilGReclusos vagr;
    public String usuario;
    
    @Override
    public void actionPerformed(ActionEvent e){
         if(e.getSource().equals(vagr.btnAtras)){
            volver();
        }
    }
    
    public void volver(){
    vagr.dispose();
    ViewAlguacil var = new ViewAlguacil();
    ControladorAlguacil car = new ControladorAlguacil(var,usuario);
    var.addController(car);
    var.crearVentana(usuario);
    }
    
}
