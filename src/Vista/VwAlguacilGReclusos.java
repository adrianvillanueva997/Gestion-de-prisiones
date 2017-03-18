/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtrlAlguacilGestionReclusos;
import Modelo.Fichero;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class VwAlguacilGReclusos extends JFrame {
    public Fichero fichero;
    public JTable tablaVReclusos;
    public JButton btnanadir;
    public CtrlAlguacilGestionReclusos controlador;
    public JButton btnAtras;
    public VwAlguacilGReclusos(){
    
    }
    public void addController(CtrlAlguacilGestionReclusos mc) {
        controlador = mc;
    }
        public void crearVentana(String usuario) throws IOException{
        
        //crea la ventana
        this.getContentPane().setBackground(Color.WHITE); //Establece el fondo en blanco
        this.setTitle("Gestión de Cárcel - Gestión de Reclusos"); //Establece el fondo del programa en blanco
        this.setResizable(false); // Impide que la ventana se pueda redimensionar
        this.setMinimumSize(new Dimension(200, 200));
        this.setBounds(0,0,800,600); // Establece el ancho y alto de la pantalla
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //Maximiza la pantalla
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Acaba el programa cuando se cierra la ventana
        this.getContentPane().setLayout(null); //Obtiene el contenido del JFrame
        
        btnAtras= new JButton("Volver"); //Indica qué está escrito
        btnAtras.setFont(new Font("Tahoma", Font.BOLD, 21)); //Establece el tamaño y el tipo de letra que tendrá el botón
        btnAtras.setBackground(new Color(20, 0, 60)); //Establece el color del botón
        btnAtras.setForeground(Color.WHITE); //Establece el color de la fuente
        btnAtras.setBounds(10, 500, 200, 60); //Establece el tamaño del botón
        this.getContentPane().add(btnAtras); //Se añade el elemento al JFrame
        btnAtras.addActionListener(controlador); //Añade el botón al ActionListener para después asignarle su función
        
        btnanadir = new JButton("Añadir"); //Indica qué está escrito
        btnanadir.setFont(new Font("Tahoma", Font.BOLD, 21)); //Establece el tamaño y el tipo de letra que tendrá el botón
        btnanadir.setBackground(new Color(20, 0, 60)); //Establece el color del botón
        btnanadir.setForeground(Color.WHITE); //Establece el color de la fuente
        btnanadir.setBounds(450, 500, 200, 60); //Establece el tamaño del botón
        this.getContentPane().add(btnanadir); //Se añade el elemento al JFrame
        btnanadir.addActionListener(controlador);
        
        fichero = new Fichero();//Instancio la lectura deñ fichero
        String titulos[] = { "ID" , "Nombre" , "Apellidos" , "Ala" , "Bloque" , "Celda" , "Delito" };//pongo los nombres de los titulos de las columnas, aunque no sale
        String informacion[][];// obtenemos la informacion del txt
        informacion= fichero.obtieneMarizrecluso();//lee la informacion del txt y lo guarda en un array bidimensional
        //DefaultTableModel dtm= new DefaultTableModel(informacion, titulos);
        tablaVReclusos = new JTable(informacion,titulos);//crea la tabla
        tablaVReclusos.setPreferredScrollableViewportSize(new Dimension(500, 80));
        tablaVReclusos.setBounds(100, 100, 500, 500);//tamaño y ubicacion de la tabla
        JScrollPane scrollPane = new JScrollPane(tablaVReclusos);//esta linea y las siguientes son mierdas que no sale, no se por que
        this.getContentPane().add(tablaVReclusos);
        this.getContentPane().add(scrollPane, BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
	@Override
        public void windowClosing(WindowEvent e) {
        System.exit(0);
        }
        });
        
        tablaVReclusos.setEnabled(false);
        tablaVReclusos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablaVReclusos.setVisible(true);//hace visible la tabla
        setIcon();
        this.setVisible(true);

        
        setIcon();
        this.setVisible(true);
    }
              private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_carcel.png")));   
    }
    
}