/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtrlJefeSVisionadoEmpleados;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author adria
 */
public class VwJefeSVisionadoEmpleados extends JFrame {
    CtrlJefeSVisionadoEmpleados controlador;
    JButton btnAtras;
    public VwJefeSVisionadoEmpleados(){
    
    }
    public void addController(CtrlJefeSVisionadoEmpleados mc) {
        controlador = mc;
    }
        public void crearVentana(String usuario){
        
        //crea la ventana
        this.getContentPane().setBackground(Color.WHITE); //Establece el fondo en blanco
        this.setTitle("Gestión de Cárcel - Visionado de Empleados"); //Establece el fondo del programa en blanco
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
        setIcon();
        this.setVisible(true);
    }
              private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_carcel.png")));   
    }
    
}
