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
	public JLabel labelAboutLogo;
	public JLabel labelAbout;
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

		
                //Crea el botón
                btnAboutAceptar = new JButton("Aceptar");	//Indica qué está escrito
                btnAboutAceptar.setForeground(Color.WHITE);	//Establece el color de la fuente
                btnAboutAceptar.setFont(new Font("Tahoma", Font.BOLD, 20));	//Establece el tamaño y el tipo de letra que tendrá el botón
                btnAboutAceptar.setBackground(new Color(0, 0, 0));	//Establece el color del botón
                btnAboutAceptar.setBounds(150, 400, 125, 38);	//Establece el tamaño del botón
                this.getContentPane().add(btnAboutAceptar);	//Se añade el elemento al JFrame
                btnAboutAceptar.addActionListener(controlador);	//Añade el botón al ActionListener para después asignarle su función
		//Crea la etiqueta
		labelAbout = new JLabel("<html>Programa realizado por:<br>Adrián Villanueva Martínez<br>Germán García García<br>Miguel Chacón Carrasco</html>");
		//Se introduce el texto que va a salir por pantalla
		labelAbout.setBounds(50, 50, 381, 224);	//Se establece el tamaño
		labelAbout.setFont(new Font("Tahoma", Font.PLAIN, 20));	//Establece el tamaño y tipo de letra
		this.getContentPane().add(labelAbout);	//Se añade el elemento al JFrame
                //Crea la etiqueta para la imagen
		labelAboutLogo = new JLabel("");
		//Image logo = new ImageIcon(this.getClass().getResource("/logo_carcel.png")).getImage();	//Crea el objeto imagen y lo vincula a la imagen apus_logo.jpg guardada en la carpeta img del proyecto
		//labelAboutLogo.setIcon(new ImageIcon(logo));	//Coloca la imagen en la etiqueta
		labelAboutLogo.setBounds(132, 13, 183, 152);	//Establece el tamaño de la ventana
		this.getContentPane().add(labelAboutLogo);	//Se añade el elemento al JFrame

                this.setVisible(true);
    }           
    
    
                
    
}
