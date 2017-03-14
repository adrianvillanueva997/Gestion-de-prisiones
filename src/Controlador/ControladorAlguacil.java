/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
 
import Vista.*;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Adrián Villanueva Martínez
 */
public class ControladorAlguacil implements ActionListener {
    public String usuario;
    public ViewLogin vistaLogin;
    public VwAlguacilEmpleados vae;
    public VwAlguacilGReclusos var;
    public ViewAlguacil va;
    public ViewLogin vl;
    public Main mc;
    public JFrame frmDialogo;
    /**
     *
     * @param va
     * @param usuario
     */
    public ControladorAlguacil(ViewAlguacil va,String usuario){
        this.va = va;
        this.usuario = usuario;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(va.btnDesconectar)){
        int respuesta = JOptionPane.showConfirmDialog( frmDialogo, "¿Desea cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        if(respuesta == JOptionPane.YES_OPTION){
        crearVentanaLogin();
      }
    }else if(e.getSource().equals(va.btnGEmpleados)){
        crearVentanaGEmpleados();
    }else if(e.getSource().equals(va.btnGReclusos)){
        crearVentanaGReclusos();
    }
    }
    public void crearVentanaLogin() {
        va.setVisible(false);   //Cierra la ventana de inicio
        ViewLogin vl = new ViewLogin(); //crea nueva ventana
        Main mc = new Main (vl);    //crea nuevo controlador de ventana
        vl.addController(mc);   //asigna el controlador a la ventana creada
        vl.crearVentanaLogin();
    }
    public void crearVentanaGEmpleados(){
        va.setEnabled(false);
        VwAlguacilEmpleados vae = new VwAlguacilEmpleados();
        CtrlAlguacilEmpleados cae = new CtrlAlguacilEmpleados();
        vae.addController(cae);
        vae.crearVentana(usuario);
    }
    public void crearVentanaGReclusos(){
        va.setEnabled(false);
        VwAlguacilGReclusos var = new VwAlguacilGReclusos();
        CtrlAlguacilGestionReclusos car = new CtrlAlguacilGestionReclusos();
        var.addController(car);
        var.crearVentana(usuario);
    }
    
}