/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorSeguridad;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class ViewSeguridad extends JFrame {
        ControladorSeguridad controlador;
        public JButton btnDesconectar;
    

    //Constructor por defecto
    public ViewSeguridad(){
        
    }
    
    public void addController(ControladorSeguridad mc) {
        controlador = mc;
    }
    public void crearVentana(String usuario){
        
        //crea la ventana
        this.getContentPane().setBackground(Color.WHITE); //Establece el fondo en blanco
        this.setTitle("Gestión de Cárcel - Empleado de Seguridad"); //Establece el fondo del programa en blanco
        this.setResizable(false); // Impide que la ventana se pueda redimensionar
        this.setMinimumSize(new Dimension(200, 200));
        this.setBounds(0,0,800,600); // Establece el ancho y alto de la pantalla
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //Maximiza la pantalla
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Acaba el programa cuando se cierra la ventana
        this.getContentPane().setLayout(null); //Obtiene el contenido del JFrame
        
        btnDesconectar= new JButton("Desconectar"); //Indica qué está escrito
        btnDesconectar.setFont(new Font("Tahoma", Font.BOLD, 21)); //Establece el tamaño y el tipo de letra que tendrá el botón
        btnDesconectar.setBackground(new Color(20, 0, 60)); //Establece el color del botón
        btnDesconectar.setForeground(Color.WHITE); //Establece el color de la fuente
        btnDesconectar.setBounds(10, 500, 200, 60); //Establece el tamaño del botón
        this.getContentPane().add(btnDesconectar); //Se añade el elemento al JFrame
        btnDesconectar.addActionListener(controlador); //Añade el botón al ActionListener para después asignarle su función
        
        this.setVisible(true);
    }

}
