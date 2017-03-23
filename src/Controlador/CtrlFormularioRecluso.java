/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Fichero;
import Vista.VwFormularioRecluso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Vista.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class CtrlFormularioRecluso implements ActionListener {
    public VwFormularioRecluso vfr;
    public JFrame frmDialogo;
    Fichero fichero;
    
    
    public CtrlFormularioRecluso(VwFormularioRecluso vfr){
        this.vfr = vfr;
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource().equals(vfr.btnCancelar)){
      int respuesta = JOptionPane.showConfirmDialog( frmDialogo, "¿Desea cancelar?", "cancelar", JOptionPane.YES_NO_OPTION);
      if(respuesta == JOptionPane.YES_OPTION){
        vfr.dispose();
      }
    }else if (e.getSource().equals(vfr.btnAceptar)){
          try {
              aceptarFormulario();
              vfr.dispose();
          } catch (IOException ex) {
             System.out.println(ex);
          }
      }
      
    }
    public void aceptarFormulario() throws IOException{
        String nombre; 
        nombre = vfr.txtNombre.getText().toLowerCase();
        String ala;
        ala=vfr.txtAla.getText().toLowerCase();
        String ID;
        ID=vfr.txtID.getText().toLowerCase();
        String apellido;
        apellido=vfr.txtApellido.getText().toLowerCase();
        String bloque;
        bloque =vfr.txtBloque.getText().toLowerCase();
        String celda;
        celda=vfr.txtCelda.getText().toLowerCase();
        String delito;
        delito=vfr.txtDelito.getText().toLowerCase();
        String[] nuevoRecluso;
        nuevoRecluso = new String [7];
        nuevoRecluso[0]=ID;
        nuevoRecluso[1]=nombre;
        nuevoRecluso[2]=apellido;
        nuevoRecluso[3]=ala;
        nuevoRecluso[4]=bloque;
        nuevoRecluso[5]=celda;
        nuevoRecluso[6]=delito;
        fichero = new Fichero();
        fichero.guardarnuevorecluso(nuevoRecluso);
  
    }


}
