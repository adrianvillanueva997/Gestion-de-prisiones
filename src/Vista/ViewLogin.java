/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

//import Controlador.ControladorAbout;
import Controlador.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


/**
 *
 * @author Adrián Villanueva Martínez
 */
public class ViewLogin extends JFrame {
    public JTextField txtUsuario;
    public JPasswordField txtPass;
    public JButton btnAceptar;
    public JButton btnAbout;
    JLabel labelImagenLogin;
    Main controlador;
    
    public void addController(Main mc) {
        controlador = mc;
    }
    public void crearVentanaLogin(){
        this.getContentPane().setBackground(Color.WHITE); //Establece el fondo en blanco
        this.setTitle("Gestión de Cárcel"); //Establece el fondo del programa en blanco
        this.setResizable(false); // Impide que la ventana se pueda redimensionar
        this.setMinimumSize(new Dimension(200, 200));
        this.setBounds(0,0,800,600); // Establece el ancho y alto de la pantalla
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Acaba el programa cuando se cierra la ventana
        this.getContentPane().setLayout(null); //Obtiene el contenido del JFrame
        

        
        //Crea el campo de texto
        txtUsuario = new JTextField("Usuario");
        txtPass = new JPasswordField("Contraseña");
        txtUsuario.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        txtUsuario.setText("");
        txtPass.setText("");
    }
    });
	txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 21));	//Establece el tamaño y tipo de letra con el que se escribirá
	txtUsuario.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));//Establece el tipo de linea y el color
	txtUsuario.setBounds(170, 190, 455, 53);//Establece el tamaño
	this.getContentPane().add(txtUsuario);//Se añade el elemento al JFrame
	txtUsuario.setColumns(10);
        //Crea el campo de contraseña
        txtPass.setFont(new Font("Tahoma", Font.PLAIN, 21));	//Establece el tamaño y tipo de letra con el que se escribirá
        txtPass.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));	//Establece el tipo de linea y el color
        txtPass.setBounds(170, 260, 455, 53);	//Establece el tamaño
        this.getContentPane().add(txtPass);	//Se añade el elemento al JFrame
        //Crea el botón
	btnAceptar = new JButton("Aceptar");	//Indica qué está escrito
	btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 21));	//Establece el tamaño y el tipo de letra que tendrá el botón
	btnAceptar.setBackground(new Color(0, 0, 0));	//Establece el color del botón
	btnAceptar.setForeground(Color.WHITE);	//Establece el color de la fuente
	btnAceptar.setBounds(170, 340, 455, 53);	//Establece el tamaño del botón
	this.getContentPane().add(btnAceptar);	//Se añade el elemento al JFrame
	btnAceptar.addActionListener(controlador);	//Añade el botón al ActionListener para después asignarle su función
        //Crea la etiqueta para la imagen
        labelImagenLogin = new JLabel("");
	Image logo = new ImageIcon(this.getClass().getResource("/img/logo_empresa.jpg")).getImage();	//Crea el objeto imagen y lo vincula a la imagen apus_logo.jpg guardada en la carpeta img del proyecto
	labelImagenLogin.setIcon(new ImageIcon(logo));	//Coloca la imagen en la etiqueta
	labelImagenLogin.setBounds(300, 0, 200, 200);	//Establece el tamaño de la ventana
        this.getContentPane().add(labelImagenLogin);	//Se añade el elemento al JFrame
        //Crea el botón
	btnAbout = new JButton("About");//Indica qué está escrito
	btnAbout.setForeground(Color.WHITE);//Establece el color de la fuente
	btnAbout.setFont(new Font("Tahoma", Font.BOLD, 20));	//Establece el tamaño y el tipo de letra que tendrá el botón
	btnAbout.setBackground(new Color(0, 0, 0));//Establece el color del botón
	btnAbout.setBounds(10, 515, 125, 38);//Establece el tamaño del botón
	this.getContentPane().add(btnAbout);//Se añade el elemento al JFrame
	btnAbout.addActionListener(controlador);//Añade el botón al ActionListener para después asignarle su función
        setIcon();

        this.setVisible(true);
    }
      private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_carcel.png")));   
    }


}
