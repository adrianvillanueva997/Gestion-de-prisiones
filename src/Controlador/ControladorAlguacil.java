/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ViewAlguacil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class ControladorAlguacil implements ActionListener {
    public String usuario;
    ViewAlguacil va;

    /**
     *
     * @param va
     * @param usuario
     */
    public ControladorAlguacil(ViewAlguacil va,String usuario){
        super();
        this.va = va;
        this.usuario = usuario;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
