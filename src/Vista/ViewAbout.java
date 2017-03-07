/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorAbout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author adria
 */
public class ViewAbout extends JFrame {
	ControladorAbout controlador;
	public JLabel lbl_About_Logo;
	public JLabel lbl_About;
	public JButton btnAboutAceptar;
    
    public void addController(ControladorAbout mc) {
        controlador = mc;
    }
    public void crearVentana(){
		//Crea la ventana
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		this.getContentPane().setBackground(Color.WHITE);	//Se establece como color de la ventana el blanco
		this.setTitle("About");	//Titulo de la ventana
		this.setBounds(100, 100, 450, 550);	//Se establece el tamaño
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	//Se establece su funcion por defecto al cerrar con la "X"
		this.getContentPane().setLayout(null);	//Obtiene el del contenido del JFrame y no establece ningún tipo de Diseño(Layout)
                //Crea la etiqueta
                JLabel lbl_About = new JLabel("<html>Programa realizado por:<br>Adrián Villanueva Martínez"
                        + "<br>Miguel Chacón Carrasco<br>Germán García García"
                        + "<br>Zhang Hon Chen</html>");
		//Se introduce el texto que va a salir por pantalla
		lbl_About.setBounds(22, 195, 381, 224);	//Se establece el tamaño
		lbl_About.setFont(new Font("Tahoma", Font.PLAIN, 20));	//Establece el tamaño y tipo de letra
		this.getContentPane().add(lbl_About);	//Se añade el elemento al JFrame
                //Crea la etiqueta para la imagen
                lbl_About_Logo = new JLabel("");
		Image logo = new ImageIcon(this.getClass().getResource("/apus_logo.jpg")).getImage();	//Crea el objeto imagen y lo vincula a la imagen apus_logo.jpg guardada en la carpeta img del proyecto
		lbl_About_Logo.setIcon(new ImageIcon(logo));	//Coloca la imagen en la etiqueta
		lbl_About_Logo.setBounds(132, 13, 183, 152);	//Establece el tamaño de la ventana
		this.getContentPane().add(lbl_About_Logo);	//Se añade el elemento al JFrame
		
                //Crea el botón
                btnAboutAceptar = new JButton("About");	//Indica qué está escrito
                btnAboutAceptar.setForeground(Color.WHITE);	//Establece el color de la fuente
                btnAboutAceptar.setFont(new Font("Tahoma", Font.BOLD, 20));	//Establece el tamaño y el tipo de letra que tendrá el botón
                btnAboutAceptar.setBackground(new Color(0, 0, 0));	//Establece el color del botón
                btnAboutAceptar.setBounds(10, 515, 125, 38);	//Establece el tamaño del botón
                this.getContentPane().add(btnAboutAceptar);	//Se añade el elemento al JFrame
                btnAboutAceptar.addActionListener(controlador);	//Añade el botón al ActionListener para después asignarle su función
		
		this.setVisible(true);	//Se hace visible la ventana
    }
    
}
