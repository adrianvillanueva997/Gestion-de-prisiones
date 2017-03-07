/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorJefeSeguridad;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author adria
 */
public class ViewJefeSeguridad {
    
    ControladorJefeSeguridad controlador;
    public JFrame frmJefeSeguridad;
    
    public void addController(ControladorJefeSeguridad mc) {
        controlador = mc;
    }
    //Constructor por defecto
    public ViewJefeSeguridad(){
        super();
    }
    public void crearVentana(String usuario){
        
        //crea la ventana
        frmJefeSeguridad = new JFrame();
        frmJefeSeguridad.getContentPane().setBackground(Color.WHITE); //Establece el fondo en blanco
        frmJefeSeguridad.setTitle("Gestión de Cárcel - Alguacil"); //Establece el fondo del programa en blanco
        frmJefeSeguridad.setResizable(false); // Impide que la ventana se pueda redimensionar
        frmJefeSeguridad.setMinimumSize(new Dimension(200, 200));
        frmJefeSeguridad.setBounds(0,0,800,600); // Establece el ancho y alto de la pantalla
        frmJefeSeguridad.setExtendedState(JFrame.MAXIMIZED_BOTH); //Maximiza la pantalla
        frmJefeSeguridad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Acaba el programa cuando se cierra la ventana
        frmJefeSeguridad.getContentPane().setLayout(null); //Obtiene el contenido del JFrame
    }
}
