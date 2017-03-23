/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Fichero;
import Vista.ViewAlguacil;
import Vista.VwFormularioEmpleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class CtrlFormularioEmpleado implements ActionListener {
    public VwFormularioEmpleado vfe;
    public JFrame frmDialogo;
    public ViewAlguacil alguacil;
   
    public CtrlFormularioEmpleado(VwFormularioEmpleado vfe){
        this.vfe = vfe;
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vfe.btnCancelar)){
      int respuesta = JOptionPane.showConfirmDialog( frmDialogo, "¿Desea cancelar?", "cancelar", JOptionPane.YES_NO_OPTION);
      if(respuesta == JOptionPane.YES_OPTION){
        vfe.dispose();
      }
    }else if (e.getSource().equals(vfe.btnAceptar)){//reaccion del btn aceptar, guardado de los nuevos datos y cerrado del formulario
          try {
              aceptarFormulario();
              vfe.dispose();
              
          } catch (IOException ex) {
             System.out.println(ex);
          }
      }
       } 
    /**
     * Esta funcion es la reaccion al boton de aceptar. Guarda los datos del nuevo empleado en un String de cuatro elementos 
     * @author Miguel Chacon Carrasco
     * @throws IOException 
     */
  public void aceptarFormulario() throws IOException{
        String nombre; 
        nombre = vfe.txtNombre.getText().toLowerCase();
        String ID;
        ID=vfe.txtID.getText().toLowerCase();
        String apellido;
        apellido=vfe.txtApellido.getText().toLowerCase();
        String puesto;
        puesto=vfe.txtPuesto.getText().toLowerCase();
        String[] nuevoEmpleado;
        nuevoEmpleado = new String [4];
        nuevoEmpleado[0]=ID;
        nuevoEmpleado[1]=nombre;
        nuevoEmpleado[2]=apellido;
        nuevoEmpleado[3]=puesto;
        Fichero fichero;
        fichero = new Fichero();
        fichero.guardarnuevoempleado(nuevoEmpleado);
  
    }  
}
