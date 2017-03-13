/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ViewJefeSeguridad;
import Vista.ViewLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class ControladorJefeSeguridad implements ActionListener {
    public String usuario;
    ViewJefeSeguridad vjs;
    public JFrame frmDialogo;

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

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource().equals(vjs.btnDesconectar)){
      int respuesta = JOptionPane.showConfirmDialog( frmDialogo, "¿Desea cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
      if(respuesta == JOptionPane.YES_OPTION){
        crearVentanaLogin();
      }
    }
    }
   
    public void crearVentanaLogin () {
       
        vjs.setVisible(false);  //Cierra la ventana de inicio
        ViewLogin vl = new ViewLogin(); //crea nueva ventana
        Main mc = new Main (vl);    //crea nuevo controlador de ventana
        vl.addController(mc);   //asigna el controlador a la ventana creada
        vl.crearVentanaLogin();
    }
    
}
