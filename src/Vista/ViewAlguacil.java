/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorAlguacil;
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
public class ViewAlguacil extends JFrame {
    ControladorAlguacil controlador;
    public JFrame frmAlguacil;
    public JButton btnGEmpleados;
    public JButton btnGReclusos;
    public JButton btnDesconectar;
    public JLabel labelAlguacilImagen;
    public JLabel labelRecuadroImagen;
    public JLabel labelNombre;
    public JLabel recuadroNombre;
    public JLabel labelID;
    public JLabel labelPuesto;
    
    
    public void addController(ControladorAlguacil mc) {
      controlador = mc;
      
    }
    //Constructor por defecto
    public ViewAlguacil(){
        
    }
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_carcel.png")));   
    }
    
    public void crearVentana(String usuario){
        
        //CREA LA VENTANA
        frmAlguacil = new JFrame();
        frmAlguacil.getContentPane().setBackground(Color.WHITE); //Establece el fondo en blanco
        frmAlguacil.setTitle("Gestión de Cárcel - Alguacil"); //Establece el fondo del programa en blanco
        frmAlguacil.setResizable(false); // Impide que la ventana se pueda redimensionar
        frmAlguacil.setMinimumSize(new Dimension(200, 200));
        frmAlguacil.setBounds(0,0,800,600); // Establece el ancho y alto de la pantalla
        frmAlguacil.setExtendedState(JFrame.MAXIMIZED_BOTH); //Maximiza la pantalla
        frmAlguacil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Acaba el programa cuando se cierra la ventana
        frmAlguacil.getContentPane().setLayout(null); //Obtiene el contenido del JFrame
        
        //BOTON GESTION RECLUSOS
        btnGReclusos= new JButton("Gestión reclusos");	//Indica qué está escrito
	btnGReclusos.setFont(new Font("Tahoma", Font.BOLD, 21));	//Establece el tamaño y el tipo de letra que tendrá el botón
	btnGReclusos.setBackground(new Color(20, 0, 60));	//Establece el color del botón
	btnGReclusos.setForeground(Color.WHITE);	//Establece el color de la fuente
	btnGReclusos.setBounds(30, 100, 350, 60);	//Establece el tamaño del botón
	frmAlguacil.getContentPane().add(btnGReclusos);	//Se añade el elemento al JFrame
	btnGReclusos.addActionListener(controlador);	//Añade el botón al ActionListener para después asignarle su función
        
        //BOTON DESCONECTAR
        btnDesconectar= new JButton("Desconectar"); //Indica qué está escrito
        btnDesconectar.setFont(new Font("Tahoma", Font.BOLD, 21)); //Establece el tamaño y el tipo de letra que tendrá el botón
        btnDesconectar.setBackground(new Color(20, 0, 60)); //Establece el color del botón
        btnDesconectar.setForeground(Color.WHITE); //Establece el color de la fuente
        btnDesconectar.setBounds(10, 500, 200, 60); //Establece el tamaño del botón
        frmAlguacil.getContentPane().add(btnDesconectar); //Se añade el elemento al JFrame
        btnDesconectar.addActionListener(controlador); //Añade el botón al ActionListener para después asignarle su función
        
        //BOTON GESTION EMPLEADOS
        btnGEmpleados= new JButton("Gestión Empleados");	//Indica qué está escrito
	btnGEmpleados.setFont(new Font("Tahoma", Font.BOLD, 21));	//Establece el tamaño y el tipo de letra que tendrá el botón
	btnGEmpleados.setBackground(new Color(20, 0, 60));	//Establece el color del botón
	btnGEmpleados.setForeground(Color.WHITE);	//Establece el color de la fuente
	btnGEmpleados.setBounds(30, 200, 350, 60);	//Establece el tamaño del botón
	frmAlguacil.getContentPane().add(btnGEmpleados);	//Se añade el elemento al JFrame
	btnGEmpleados.addActionListener(controlador);	//Añade el botón al ActionListener para después asignarle su función
        
        //LABEL IMAGEN
        labelAlguacilImagen = new JLabel("");
	Image logo = new ImageIcon(this.getClass().getResource("/img/elmo.png")).getImage();
	labelAlguacilImagen.setIcon(new ImageIcon(logo));//Coloca la imagen en la etiqueta
	labelAlguacilImagen.setBounds(500, 95, 300, 300);	//Establece el tamaño de la ventana
        frmAlguacil.getContentPane().add(labelAlguacilImagen);	//Se añade el elemento al JFrame
        
        
        //LABEL RECUADRO SUPERIOR
	labelRecuadroImagen = new JLabel("");
	labelRecuadroImagen.setForeground(new Color(0, 0, 0));
	labelRecuadroImagen.setBackground(new Color(0, 0, 0));
	labelRecuadroImagen.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	labelRecuadroImagen.setBounds(490, 100, 315, 300);
	frmAlguacil.getContentPane().add(labelRecuadroImagen);
        
        //LABEL NOMBRE
	labelNombre = new JLabel("Nombre: Elmo");
	labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 22));
	labelNombre.setBounds(490, 400, 415, 23);
        labelNombre.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	frmAlguacil.getContentPane().add(labelNombre);
        setIcon();
        frmAlguacil.setVisible(true);
        
        //LABEL ID
	labelID = new JLabel("ID: 27");
	labelID.setFont(new Font("Tahoma", Font.PLAIN, 22));
	labelID.setBounds(490, 420, 415, 23);
        labelID.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	frmAlguacil.getContentPane().add(labelID);
        setIcon();
        frmAlguacil.setVisible(true);
        
        //LABEL PUESTO
	labelPuesto = new JLabel("Puesto: Alguacil");
	labelPuesto.setFont(new Font("Tahoma", Font.PLAIN, 22));
	labelPuesto.setBounds(490, 440, 415, 23);
        labelPuesto.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	frmAlguacil.getContentPane().add(labelPuesto);
        setIcon();
        frmAlguacil.setVisible(true);
    }    
}
