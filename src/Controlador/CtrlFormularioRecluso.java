/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VwFormularioRecluso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class CtrlFormularioRecluso implements ActionListener {
    public VwFormularioRecluso vfr;
    
    public CtrlFormularioRecluso(VwFormularioRecluso vfr){
        this.vfr = vfr;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
