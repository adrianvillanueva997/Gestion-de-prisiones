/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorSeguridad;
import Modelo.Fichero;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class ViewSeguridad extends JFrame {
        ControladorSeguridad controlador;
        Fichero fichero;
        public JButton btnDesconectar;
        public JLabel labelImagenSeguridad;
        public JLabel labelRecuadroImagen;
        public JLabel labelNombre;
        public JLabel labelID;
        public JLabel labelPuesto;
    

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
        
        //LABEL IMAGEN
        labelImagenSeguridad = new JLabel("");
	Image logo = new ImageIcon(this.getClass().getResource("/img/empleado_seguridad.png")).getImage();
	labelImagenSeguridad.setIcon(new ImageIcon(logo));//Coloca la imagen en la etiqueta
	labelImagenSeguridad.setBounds(490, 130, 300, 300);	//Establece el tamaño de la ventana
        this.getContentPane().add(labelImagenSeguridad);	//Se añade el elemento al JFrame
        
        
        //LABEL RECUADRO SUPERIOR
	labelRecuadroImagen = new JLabel("");
	labelRecuadroImagen.setForeground(new Color(0, 0, 0));
	labelRecuadroImagen.setBackground(new Color(0, 0, 0));
	labelRecuadroImagen.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	labelRecuadroImagen.setBounds(490, 100, 315, 300);
	this.getContentPane().add(labelRecuadroImagen);
        
        //LABEL NOMBRE
	labelNombre = new JLabel("Nombre: Willie");
	labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 22));
	labelNombre.setBounds(490, 400, 415, 23);
        labelNombre.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	this.getContentPane().add(labelNombre);

        
        //LABEL ID
	labelID = new JLabel("ID: 27");
	labelID.setFont(new Font("Tahoma", Font.PLAIN, 22));
	labelID.setBounds(490, 420, 415, 23);
        labelID.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	this.getContentPane().add(labelID);
        
        //LABEL PUESTO
	labelPuesto = new JLabel("Puesto: Seguridad");
	labelPuesto.setFont(new Font("Tahoma", Font.PLAIN, 22));
	labelPuesto.setBounds(490, 440, 415, 23);
        labelPuesto.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	this.getContentPane().add(labelPuesto);
        
        //TABLA
        fichero = new Fichero(); //Instancio la lectura deñ fichero
        String titulos[] = { "ID" , "Ala" , "Bloque" , "horario" };//pongo los nombres de los titulos de las columnas, aunque no sale. Sospecho que es para gestion interna
        String informacion[][] = null;// obtenemos la informacion del txt
            try {
                informacion= fichero.obtieneMarizHorarios(); //lee la informacion del txt y lo guarda en un array bidimensional
            } catch (IOException ex) {
                Logger.getLogger(ViewSeguridad.class.getName()).log(Level.SEVERE, null, ex);
            }
        JTable tablaHorarios = new JTable(informacion,titulos); //crea la tabla
        tablaHorarios.setPreferredScrollableViewportSize(new Dimension(500, 80));
        tablaHorarios.setBounds(100, 100, 500, 500);//tamaño y ubicacion de la tabla
        JScrollPane scrollPane = new JScrollPane(tablaHorarios);//esta linea y las siguientes son mierdas que no sale, no se por que
        this.getContentPane().add(tablaHorarios);
        this.getContentPane().add(scrollPane, BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
        System.exit(0);
        }
        });
        tablaHorarios.setEnabled(false);
        tablaHorarios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablaHorarios.setVisible(true);//hace visible la tabla
        
        
        setIcon();
        this.setVisible(true);
    }
          private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_carcel.png")));   
    }

}
