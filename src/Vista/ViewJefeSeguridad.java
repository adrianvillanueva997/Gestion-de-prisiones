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
 * @author Adrián Villanueva Martínez
 */
public class ViewJefeSeguridad extends JFrame {
    
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

        this.getContentPane().setBackground(Color.WHITE); //Establece el fondo en blanco
        this.setTitle("Gestión de Cárcel - Jefe de Seguridad"); //Establece el fondo del programa en blanco
        this.setResizable(false); // Impide que la ventana se pueda redimensionar
        this.setMinimumSize(new Dimension(200, 200));
        this.setBounds(0,0,800,600); // Establece el ancho y alto de la pantalla
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //Maximiza la pantalla
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Acaba el programa cuando se cierra la ventana
        this.getContentPane().setLayout(null); //Obtiene el contenido del JFrame
        
        this.setVisible(true);
    }
}
