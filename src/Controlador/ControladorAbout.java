/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ViewAbout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class ControladorAbout implements ActionListener{
	
		public ViewAbout viewAbout;
		
		//Función controladora de la ventana de About
		public ControladorAbout(ViewAbout win){
			viewAbout = win;
		}

		//Función que indica las acciones que realizan los distintos objetos de la ventana
                @Override
		public void actionPerformed(ActionEvent e){
			if(e.getSource().equals(viewAbout.btnAboutAceptar)){	//analiaza la acción en la ventana
				viewAbout.setVisible(false);	//deja de hacerse visible la ventana cuando se pulsa el botón
			}
		}
}
