/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
 
import Controlador.CtrlFormularioEmpleado;
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
public class VwFormularioEmpleado extends JFrame {
    CtrlFormularioEmpleado controlador;
    public JTextField txtNombre;
    public JTextField txtApellido;
    public JTextField txtPuesto;
    public JTextField txtID;
    public JButton btnAceptar;
    public JButton btnCancelar;

    public void addController(CtrlFormularioEmpleado mce) {
        controlador = mce;
     
    }
    public void crearVentanaFormularioEmpleado(String usuario){
        this.getContentPane().setBackground(Color.WHITE); //Establece el fondo en blanco
        this.setTitle("Gestión de Cárcel - Añadir recluso"); //Establece el fondo del programa en blanco
        this.setResizable(false); // Impide que la ventana se pueda redimensionar
        this.setMinimumSize(new Dimension(200, 200));
        this.setBounds(0,0,650,400); // Establece el ancho y alto de la pantalla
        this.getContentPane().setLayout(null); //Obtiene el contenido del JFrame
       
       
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
        txtNombre.setBounds(100, 100, 200 , 50);//Establece el tamaño
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
        txtApellido.setBounds(350, 100, 200 , 50);//Establece el tamaño
        this.getContentPane().add(txtApellido);//Se añade el elemento al JFrame
        txtApellido.setColumns(10);
       
         //Crea el campo de texto
        txtPuesto = new JTextField("Puesto");
        txtPuesto.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        txtPuesto.setText("");
                }
            });
       
        txtPuesto.setFont(new Font("Tahoma", Font.PLAIN, 21));  //Establece el tamaño y tipo de letra con el que se escribirá
        txtPuesto.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));//Establece el tipo de linea y el color
        txtPuesto.setBounds(100, 170, 200 , 50);//Establece el tamaño
        this.getContentPane().add(txtPuesto);//Se añade el elemento al JFrame
        txtPuesto.setColumns(10);
 
        
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
        txtID.setBounds(350, 170, 200 , 50);//Establece el tamaño
        this.getContentPane().add(txtID);//Se añade el elemento al JFrame
        txtID.setColumns(10);
       
       
        btnAceptar = new JButton("Añadir");    //Indica qué está escrito
        btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 21));  //Establece el tamaño y el tipo de letra que tendrá el botón
        btnAceptar.setBackground(new Color(0, 0, 0));   //Establece el color del botón
        btnAceptar.setForeground(Color.WHITE);  //Establece el color de la fuente
        btnAceptar.setBounds(100, 250, 300, 53);    //Establece el tamaño del botón
        this.getContentPane().add(btnAceptar);  //Se añade el elemento al JFrame
        btnAceptar.addActionListener(controlador);  //Añade el botón al ActionListener para después asignarle su función
       
        btnCancelar = new JButton("Cancelar");  //Indica qué está escrito
        btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 21)); //Establece el tamaño y el tipo de letra que tendrá el botón
        btnCancelar.setBackground(new Color(100, 0, 0));    //Establece el color del botón
        btnCancelar.setForeground(Color.WHITE); //Establece el color de la fuente
        btnCancelar.setBounds(410, 250, 140, 53);   //Establece el tamaño del botón
        this.getContentPane().add(btnCancelar); //Se añade el elemento al JFrame
        btnCancelar.addActionListener(controlador); //Añade el botón al ActionListener para después asignarle su función
        setIcon();
        this.setVisible(true);
         
    }
   
     private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_carcel.png")));  
    }
     
 
}