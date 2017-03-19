/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VwFormularioEmpleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class CtrlFormularioEmpleado implements ActionListener {
    public VwFormularioEmpleado vfe;
    public JFrame frmDialogo;
   
    public CtrlFormularioEmpleado(VwFormularioEmpleado vfe){
        this.vfe = vfe;
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vfe.btnAceptar)){
        }else if(e.getSource().equals(vfe.btnCancelar)){
            int respuesta = JOptionPane.showConfirmDialog( frmDialogo, "¿Desea cancelar?", "cancelar", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.YES_OPTION){
            vfe.dispose();
      }
        }
    }
   
}
