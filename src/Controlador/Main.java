/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Fichero;
import Vista.*;
import java.awt.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class Main implements ActionListener {
    ViewLogin vistaLogin;
    
    //Constructor por defecto
    public Main(ViewLogin w){
        vistaLogin = w;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
                /**
		 * Acciones que se llevarán a cabo en la ventana.
		 */
                System.out.println("aaaa");
		if(e.getSource().equals(vistaLogin.btnAceptar)){	//analiza la acción que se hace en la ventana y la iguala al btn_Aceptar
			String usuario = vistaLogin.txtUsuario.getText().toLowerCase();	//recoge el contenido del JTextField
			char caracteres[] = vistaLogin.txtPass.getPassword();	//array de caracteres que coge los elementos que se encuentran en el JPasswordField
			String Password = String.valueOf(caracteres);	//Convierte los elementos del array en un String
			Fichero comprobar = new Fichero();	//crea un nuevo gestor de ficheros
			try {
				String resultado[]=comprobar.comprobarUsuario(usuario, Password);	//comprueba los datos introducidos
				if(resultado[0]=="true"){
					//Abre ventana según el tercer parámetro del txt
					switch(resultado[1]){
						case "alguacil":
							//Abre ventana Alguacil
							abrirVentanaAlguacil(usuario);
							break;
						case "jefeseguridad":
							//Abre ventana Jefe Seguridad
							abrirVentanaJefeSeguridad(usuario);
							break;
                                                case "seguridad":
                                                        abrirVentanaSeguridad(usuario);
                                                        break;
						default:
							//En el caso de que no sea ninguno de los dos usuarios.
							Object frame = null;	//crea un objeto ventana
							JOptionPane.showMessageDialog((Component) frame, "Tipo de usuario desconocido.", "Error", JOptionPane.ERROR_MESSAGE);	//sale una ventana de diálogo para alertar de un error
					}
				} else{	//si el resultado de la comparación es falso
					Object frame = null;	//crea un objeto ventana
					JOptionPane.showMessageDialog((Component) frame, "El usuario o la contraseña es incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);	//sale una ventana de diálogo para alertar de un error
				}
			} catch (IOException e1) {
				e1.printStackTrace();	//imprime el registro de la pila donde se dio la excepción
			}
		} else if(e.getSource().equals(vistaLogin.btnAbout)){	//analiza la acción que se hace en la ventana y la iguala al btn_About
			abrirVentanaAbout();	//abre la ventana de About
		}
    }
	public void abrirVentanaAlguacil(String usuario) throws IOException{
		/**
		 * Creación de la ventana Paciente
		 */
		vistaLogin.setVisible(false);	//Cierra la ventana de inicio
		ViewAlguacil vp = new ViewAlguacil();	//crea nueva ventana
		ControladorAlguacil cp = new ControladorAlguacil(vp,usuario);	//crea nuevo controlador de ventana
		vp.addController(cp);	//asigna el controlador a la ventana creada
		vp.crearVentana(usuario);	//crea los elementos de la ventana
	}
	
	public void abrirVentanaJefeSeguridad(String usuario) throws IOException{
		/**
		 * Creación de la ventana Médico
		 */
		vistaLogin.setVisible(false);	//Cierra la ventana de inicio
		ViewJefeSeguridad vm = new ViewJefeSeguridad();	//crea nueva ventana
		ControladorJefeSeguridad cjs = new ControladorJefeSeguridad(vm,usuario);	//crea nuevo controlador de ventana
		vm.addController(cjs);	//asigna el controlador a la ventana creada
		vm.crearVentana(usuario);	//crea los elementos de la ventana
	}
	
	public void abrirVentanaAbout(){
		/**
		 * Creación de la ventana About
		 */
		ViewAbout va = new ViewAbout();	//crea nueva ventana
		ControladorAbout ca = new ControladorAbout(va);	//crea nuevo controlador de ventana
		va.addController(ca);	//asigna el controlador a la ventana creada
		va.crearVentana();	//crea los elementos de la ventana
	}
	public void abrirVentanaSeguridad(String usuario) throws IOException{
		/**
		 * Creación de la ventana Médico
		 */
		vistaLogin.setVisible(false);	//Cierra la ventana de inicio
		ViewSeguridad vs = new ViewSeguridad();	//crea nueva ventana
		ControladorSeguridad cs = new ControladorSeguridad(vs,usuario);	//crea nuevo controlador de ventana
		vs.addController(cs);	//asigna el controlador a la ventana creada
		vs.crearVentana(usuario);	//crea los elementos de la ventana
	}
    public static void main(String[] args) {
        
       		ViewLogin frameLogin = new ViewLogin();
		Main mc = new Main(frameLogin);
		frameLogin.addController(mc);
		frameLogin.crearVentanaLogin();
    }


    
}
