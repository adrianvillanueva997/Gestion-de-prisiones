/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
 
import Controlador.CtrlFormularioRecluso;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
 
/**
 *
 * @author Adrián Villanueva Martínez
 */
public class VwFormularioRecluso extends JFrame {
    CtrlFormularioRecluso controlador;
    public JTextField txtNombre;
    public JTextField txtApellido;
    public JTextField txtDelito;
    public JTextField txtCelda;
    public JTextField txtAla;
    public JTextField txtID;
    public JButton btnAceptar;
    public JButton btnCancelar;
   
   
        public void addController(CtrlFormularioRecluso mc) {
        controlador = mc;
     
    }
    public void crearVentanaFormularioRecluso(String usuario){
        this.getContentPane().setBackground(Color.WHITE); //Establece el fondo en blanco
        this.setTitle("Gestión de Cárcel - Añadir recluso"); //Establece el fondo del programa en blanco
        this.setResizable(false); // Impide que la ventana se pueda redimensionar
        this.setMinimumSize(new Dimension(200, 200));
        this.setBounds(0,0,660,500); // Establece el ancho y alto de la pantalla
        this.getContentPane().setLayout(null); //Obtiene el contenido del JFrame
        this.setVisible(true);
       
       
        //Crea el campo de texto
        txtNombre = new JTextField("Nombre");
        txtNombre.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        txtNombre.setText("");
                }
            });
       
        txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 21));  //Establece el tamaño y tipo de letra con el que se escribirá
        txtNombre.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));//Establece el tipo de linea y el color
        txtNombre.setBounds(100, 90, 200 , 50);//Establece el tamaño
        this.getContentPane().add(txtNombre);//Se añade el elemento al JFrame
        txtNombre.setColumns(10);
       
       
         //Crea el campo de texto
        txtApellido = new JTextField("Apellido");
        txtApellido.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        txtApellido.setText("");
                }
            });
       
        txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 21));    //Establece el tamaño y tipo de letra con el que se escribirá
        txtApellido.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));//Establece el tipo de linea y el color
        txtApellido.setBounds(350, 90, 200 , 50);//Establece el tamaño
        this.getContentPane().add(txtApellido);//Se añade el elemento al JFrame
        txtApellido.setColumns(10);
       
         //Crea el campo de texto
        txtDelito = new JTextField("Delito");
        txtDelito.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        txtDelito.setText("");
                }
            });
       
        txtDelito.setFont(new Font("Tahoma", Font.PLAIN, 21));  //Establece el tamaño y tipo de letra con el que se escribirá
        txtDelito.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));//Establece el tipo de linea y el color
        txtDelito.setBounds(100, 170, 200 , 50);//Establece el tamaño
        this.getContentPane().add(txtDelito);//Se añade el elemento al JFrame
        txtDelito.setColumns(10);
       
         //Crea el campo de texto
        txtCelda = new JTextField("Celda");
        txtCelda.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        txtCelda.setText("");
                }
            });
       
        txtCelda.setFont(new Font("Tahoma", Font.PLAIN, 21));   //Establece el tamaño y tipo de letra con el que se escribirá
        txtCelda.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));//Establece el tipo de linea y el color
        txtCelda.setBounds(350, 170, 200 , 50);//Establece el tamaño
        this.getContentPane().add(txtCelda);//Se añade el elemento al JFrame
        txtCelda.setColumns(10);
       
       
         //Crea el campo de texto
        txtAla = new JTextField("Ala");
        txtAla.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        txtAla.setText("");
                }
            });
       
        txtAla.setFont(new Font("Tahoma", Font.PLAIN, 21)); //Establece el tamaño y tipo de letra con el que se escribirá
        txtAla.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));//Establece el tipo de linea y el color
        txtAla.setBounds(350, 250, 200 , 50);//Establece el tamaño
        this.getContentPane().add(txtAla);//Se añade el elemento al JFrame
        txtAla.setColumns(10);
       
       
         //Crea el campo de texto
        txtID = new JTextField("ID");
        txtID.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        txtID.setText("");
                }
            });
       
        txtID.setFont(new Font("Tahoma", Font.PLAIN, 21));  //Establece el tamaño y tipo de letra con el que se escribirá
        txtID.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));//Establece el tipo de linea y el color
        txtID.setBounds(100, 250, 200 , 50);//Establece el tamaño
        this.getContentPane().add(txtID);//Se añade el elemento al JFrame
        txtID.setColumns(10);
       
       
        btnAceptar = new JButton("Añadir");    //Indica qué está escrito
        btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 21));  //Establece el tamaño y el tipo de letra que tendrá el botón
        btnAceptar.setBackground(new Color(0, 0, 0));   //Establece el color del botón
        btnAceptar.setForeground(Color.WHITE);  //Establece el color de la fuente
        btnAceptar.setBounds(100, 330, 300, 53);    //Establece el tamaño del botón
        this.getContentPane().add(btnAceptar);  //Se añade el elemento al JFrame
        btnAceptar.addActionListener(controlador);  //Añade el botón al ActionListener para después asignarle su función
       
        btnCancelar = new JButton("Cancelar");  //Indica qué está escrito
        btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 21)); //Establece el tamaño y el tipo de letra que tendrá el botón
        btnCancelar.setBackground(new Color(100, 0, 0));    //Establece el color del botón
        btnCancelar.setForeground(Color.WHITE); //Establece el color de la fuente
        btnCancelar.setBounds(410, 330, 140, 53);   //Establece el tamaño del botón
        this.getContentPane().add(btnCancelar); //Se añade el elemento al JFrame
        btnCancelar.addActionListener(controlador); //Añade el botón al ActionListener para después asignarle su función
        setIcon();
        this.setVisible(true);
         
    }
   
     private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_carcel.png")));  
    }
}