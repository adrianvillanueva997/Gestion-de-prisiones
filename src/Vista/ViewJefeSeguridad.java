/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorJefeSeguridad;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class ViewJefeSeguridad extends JFrame {
    
    ControladorJefeSeguridad controlador;
    public JFrame frmJefeSeguridad;
    public JButton btnVEmpleados;
    public JButton btnVReclusos;
    public JButton btnDesconectar;
    public JLabel labelImagenSeguridad;
    public JLabel labelRecuadroImagen;
    public JLabel labelNombre;
    public JLabel labelID;
    public JLabel labelPuesto;
    
    public void addController(ControladorJefeSeguridad mc) {
        controlador = mc;
    }
    //Constructor por defecto
    public ViewJefeSeguridad(){
        
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
        
        btnVEmpleados= new JButton("Vision de Empleados"); 
        btnVEmpleados.setFont(new Font("Tahoma", Font.BOLD, 21));  
        btnVEmpleados.setBackground(new Color(20, 0, 60)); 
        btnVEmpleados.setForeground(Color.WHITE);
        btnVEmpleados.setBounds(30, 200, 350, 60); 
        this.getContentPane().add(btnVEmpleados);  
        btnVEmpleados.addActionListener(controlador);
        
        btnDesconectar= new JButton("Desconectar"); //Indica qué está escrito
        btnDesconectar.setFont(new Font("Tahoma", Font.BOLD, 21));  //Establece el tamaño y el tipo de letra que tendrá el botón
        btnDesconectar.setBackground(new Color(20, 0, 60)); //Establece el color del botón
        btnDesconectar.setForeground(Color.WHITE);  //Establece el color de la fuente
        btnDesconectar.setBounds(10, 500, 200, 60); //Establece el tamaño del botón
        this.getContentPane().add(btnDesconectar);  //Se añade el elemento al JFrame
        btnDesconectar.addActionListener(controlador);  //Añade el botón al ActionListener para después asignarle su función
        
        btnVReclusos= new JButton("Vision de reclusos");   
        btnVReclusos.setFont(new Font("Tahoma", Font.BOLD, 21));   
        btnVReclusos.setBackground(new Color(20, 0, 60));
        btnVReclusos.setForeground(Color.WHITE);   
        btnVReclusos.setBounds(30, 100, 350, 60);  
        this.getContentPane().add(btnVReclusos);   
        btnVReclusos.addActionListener(controlador);
        
        //LABEL IMAGEN
        labelImagenSeguridad = new JLabel("");
	Image logo = new ImageIcon(this.getClass().getResource("/img/jefe_seguridad.png")).getImage();
	labelImagenSeguridad.setIcon(new ImageIcon(logo));//Coloca la imagen en la etiqueta
	labelImagenSeguridad.setBounds(500, 95, 300, 300);	//Establece el tamaño de la ventana
        this.getContentPane().add(labelImagenSeguridad);	//Se añade el elemento al JFrame
        
        
        //LABEL RECUADRO SUPERIOR
	labelRecuadroImagen = new JLabel("");
	labelRecuadroImagen.setForeground(new Color(0, 0, 0));
	labelRecuadroImagen.setBackground(new Color(0, 0, 0));
	labelRecuadroImagen.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	labelRecuadroImagen.setBounds(490, 100, 315, 300);
	this.getContentPane().add(labelRecuadroImagen);
        
        //LABEL NOMBRE
	labelNombre = new JLabel("Nombre: Jefe Wiggum");
	labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 22));
	labelNombre.setBounds(490, 400, 415, 23);
        labelNombre.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	this.getContentPane().add(labelNombre);

        
        //LABEL ID
	labelID = new JLabel("ID: 35");
	labelID.setFont(new Font("Tahoma", Font.PLAIN, 22));
	labelID.setBounds(490, 420, 415, 23);
        labelID.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	this.getContentPane().add(labelID);
        
        //LABEL PUESTO
	labelPuesto = new JLabel("Puesto: Jefe de Seguridad");
	labelPuesto.setFont(new Font("Tahoma", Font.PLAIN, 22));
	labelPuesto.setBounds(490, 440, 415, 23);
        labelPuesto.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	this.getContentPane().add(labelPuesto);
        
        
        setIcon();
        this.setVisible(true);
    }
          private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_carcel.png")));   
    }
}
