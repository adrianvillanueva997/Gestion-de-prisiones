/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorAlguacil;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author adria
 */
public class ViewAlguacil extends JFrame {
    ControladorAlguacil controlador;
    public JFrame frmAlguacil;
    
    public void addController(ControladorAlguacil mc) {
        mc = controlador;
    }
    //Constructor por defecto
    public ViewAlguacil(){
        super();
    }
    
    public void crearVentana(String usuario){
        
        //crea la ventana
        frmAlguacil = new JFrame();
        frmAlguacil.getContentPane().setBackground(Color.WHITE); //Establece el fondo en blanco
        frmAlguacil.setTitle("Gestión de Cárcel - Alguacil"); //Establece el fondo del programa en blanco
        frmAlguacil.setResizable(false); // Impide que la ventana se pueda redimensionar
        frmAlguacil.setMinimumSize(new Dimension(200, 200));
        frmAlguacil.setBounds(0,0,800,600); // Establece el ancho y alto de la pantalla
        frmAlguacil.setExtendedState(JFrame.MAXIMIZED_BOTH); //Maximiza la pantalla
        frmAlguacil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Acaba el programa cuando se cierra la ventana
        frmAlguacil.getContentPane().setLayout(null); //Obtiene el contenido del JFrame
        frmAlguacil.setVisible(true);
    }
    
    
}
