/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;


/**
 *
 * @author Adrián Villanueva Martínez
 */
public class ViewLogin extends JFrame {
    public JFrame frameInicio;
    //Constructor por defecto
    public ViewLogin(){
        super();
    }
    public void crearVentana(){
        frameInicio = new JFrame();
        frameInicio.getContentPane().setBackground(Color.WHITE); //Establece el fondo en blanco
        frameInicio.setTitle("Gestión de Cárcel"); //Establece el fondo del programa en blanco
        frameInicio.setResizable(false); // Impide que la ventana se pueda redimensionar
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize(); 
        int ancho = (int) screen.getWidth(); //convierte getwitdth de double a int
        int alto = (int) screen.getHeight(); // idem
        frameInicio.setBounds(0, 0,ancho ,alto); // Establece el ancho y alto de la pantalla
        frameInicio.setExtendedState(JFrame.MAXIMIZED_BOTH); //Maximiza la pantalla
        frameInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Acaba el programa cuando se cierra la ventana
        frameInicio.setVisible(true);
        frameInicio.getContentPane().setLayout(null); //Obtiene el contenido del JFrame
        
        //Crea el campo de texto
	JTextField txtLoginUser = new JTextField();
        txtLoginUser.setFont(new Font("Tahoma",Font.PLAIN,21));
        txtLoginUser.setBorder(new LineBorder(new Color(0,0,0),5,true));
        txtLoginUser.setBounds(300,300,300,50);
        frameInicio.getContentPane().add(txtLoginUser);
        
    }
}
