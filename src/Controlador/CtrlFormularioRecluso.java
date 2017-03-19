/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VwFormularioRecluso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class CtrlFormularioRecluso implements ActionListener {
    public VwFormularioRecluso vfr;
    public JFrame frmDialogo;
    
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
    }
      
    }
}
