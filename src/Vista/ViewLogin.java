/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;


/**
 *
 * @author Adrián Villanueva Martínez
 */
public class ViewLogin extends JFrame {
    public JFrame frameInicio;
    public JTextField txtUsuario;
    public JPasswordField txtPass;
    public JButton btnAceptar;
    public JButton btnAbout;
    Main controlador;
    
    public void addController(Main mc) {
        mc = controlador;
    }
    //Constructor por defecto
    public ViewLogin(){
        super();
    }
    
    public void crearVentana(){
        frameInicio = new JFrame();
        frameInicio.getContentPane().setBackground(Color.WHITE); //Establece el fondo en blanco
        frameInicio.setTitle("Gestión de Cárcel"); //Establece el fondo del programa en blanco
        frameInicio.setResizable(false); // Impide que la ventana se pueda redimensionar
        frameInicio.setMinimumSize(new Dimension(200, 200));
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = (int) screen.getWidth(); //convierte getwitdth de double a int
        int alto = (int) screen.getHeight(); // idem
        frameInicio.setBounds(0, 0,ancho ,alto); // Establece el ancho y alto de la pantalla
        frameInicio.setExtendedState(JFrame.MAXIMIZED_BOTH); //Maximiza la pantalla
        frameInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Acaba el programa cuando se cierra la ventana
        
        frameInicio.setMinimumSize(new Dimension(200, 200));
        frameInicio.getContentPane().setLayout(null); //Obtiene el contenido del JFrame
        
        frameInicio.addComponentListener(new ComponentAdapter() {public void componentResized(ComponentEvent evt) {
        Dimension size = frameInicio.getSize();
        Dimension min = frameInicio.getMinimumSize();
        if (size.getWidth() < min.getWidth()) {
          frameInicio.setSize((int) min.getWidth(), (int) size.getHeight());
        }
        if (size.getHeight() < min.getHeight()) {
          frameInicio.setSize((int) size.getWidth(), (int) min.getHeight());
        }
      }});
        
        
        
        //Crea el campo de texto
	txtUsuario = new JTextField();
	txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 21));	//Establece el tamaño y tipo de letra con el que se escribirá
	txtUsuario.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));//Establece el tipo de linea y el color
	txtUsuario.setBounds(300, 514, 455, 53);//Establece el tamaño
	frameInicio.getContentPane().add(txtUsuario);//Se añade el elemento al JFrame
	txtUsuario.setColumns(10);
        //Crea el campo de contraseña
        txtPass = new JPasswordField();
        txtPass.setFont(new Font("Tahoma", Font.PLAIN, 21));	//Establece el tamaño y tipo de letra con el que se escribirá
        txtPass.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));	//Establece el tipo de linea y el color
        txtPass.setBounds(300, 597, 455, 53);	//Establece el tamaño
        frameInicio.getContentPane().add(txtPass);	//Se añade el elemento al JFrame
        //Crea el botón
	btnAceptar = new JButton("Aceptar");	//Indica qué está escrito
	btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 21));	//Establece el tamaño y el tipo de letra que tendrá el botón
	btnAceptar.setBackground(new Color(0, 0, 0));	//Establece el color del botón
	btnAceptar.setForeground(Color.WHITE);	//Establece el color de la fuente
	btnAceptar.setBounds(300, 684, 455, 53);	//Establece el tamaño del botón
	frameInicio.getContentPane().add(btnAceptar);	//Se añade el elemento al JFrame
	btnAceptar.addActionListener(controlador);	//Añade el botón al ActionListener para después asignarle su función
        //Crea el botón
	btnAbout = new JButton("About");	//Indica qué está escrito
	btnAbout.setForeground(Color.WHITE);	//Establece el color de la fuente
	btnAbout.setFont(new Font("Tahoma", Font.BOLD, 20));	//Establece el tamaño y el tipo de letra que tendrá el botón
	btnAbout.setBackground(new Color(0, 0, 0));	//Establece el color del botón
	btnAbout.setBounds(400, 84, 125, 38);	//Establece el tamaño del botón
	frameInicio.getContentPane().add(btnAbout);	//Se añade el elemento al JFrame
	btnAbout.addActionListener(controlador);	//Añade el botón al ActionListener para después asignarle su función
        
        frameInicio.setVisible(true);
    }


}
