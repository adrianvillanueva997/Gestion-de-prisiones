/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
 
import Vista.*;

 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Adrián Villanueva Martínez
 */
public class ControladorAlguacil implements ActionListener{
    
    public String usuario;
    ViewAlguacil vas;
    VwAlguacilEmpleados vae;
    VwAlguacilGReclusos var;
    public JFrame frmDialogo;

    /**
     *
     * @param vas
     * @param usuario
     */
    public ControladorAlguacil(ViewAlguacil vas,String usuario){
        this.vas = vas;
        this.usuario = usuario;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource().equals(vas.btnDesconectar)){
      int respuesta = JOptionPane.showConfirmDialog( frmDialogo, "¿Desea cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
      if(respuesta == JOptionPane.YES_OPTION){
        crearVentanaLogin();
      }
    }else if (e.getSource().equals(vas.btnGEmpleados)){
        crearVentanaGestionEmpleados();
    }else if(e.getSource().equals(vas.btnGReclusos)){
             try {
                 crearVentanaGestionReclusos();
             } catch (IOException ex) {
                 Logger.getLogger(ControladorAlguacil.class.getName()).log(Level.SEVERE, null, ex);
             }
    }
    }
   
    public void crearVentanaLogin () {
        vas.frmAlguacil.dispose();  //Cierra la ventana de inicio
        ViewLogin vl = new ViewLogin(); //crea nueva ventana
        Main mc = new Main (vl);    //crea nuevo controlador de ventana
        vl.addController(mc);   //asigna el controlador a la ventana creada
        vl.crearVentanaLogin();
    }
    public void crearVentanaGestionEmpleados(){
        vas.frmAlguacil.dispose();
        VwAlguacilEmpleados ve = new VwAlguacilEmpleados();
        CtrlAlguacilEmpleados cae = new CtrlAlguacilEmpleados(ve);
        ve.addController(cae); 
        ve.crearVentana(usuario);
    }
    public void crearVentanaGestionReclusos() throws IOException{
        vas.frmAlguacil.dispose();
        VwAlguacilGReclusos var = new VwAlguacilGReclusos();
        CtrlAlguacilGestionReclusos car = new CtrlAlguacilGestionReclusos();
        var.addController(car);
        var.crearVentana(usuario);
    }
}