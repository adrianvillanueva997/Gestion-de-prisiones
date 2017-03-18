/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ViewAlguacil;
import Vista.VwAlguacilEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class CtrlAlguacilEmpleados implements ActionListener {
    public VwAlguacilEmpleados vage;
    public String usuario;
    public ViewAlguacil va;
    
    public CtrlAlguacilEmpleados(VwAlguacilEmpleados vage){
        this.vage = vage;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(vage.btnAtras)){
            volver();
        }
    }
    public void volver(){
        vage.dispose();
        ViewAlguacil var = new ViewAlguacil();
        ControladorAlguacil car = new ControladorAlguacil(var,usuario);
        var.addController(car);
        var.crearVentana(usuario);
    }
    
}
