/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * @author Adrián Villanueva Martínez
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fichero {
	
	BufferedWriter escritor;
	BufferedReader lector;//crea un lector de fichero
	BufferedReader lector1;//crea un lector de fichero
	File ficheroUsuario = new File("FicheroUsuarios.txt");
	File ficheroPacientes= new File("FicheroPrisioneros.txt");
	File ficheroMedico = new File("FicheroMedico.txt");
	File ficheroMedicoPaciente = new File("FicheroMedicoPaciente.txt");
	String p = ";";

	
	//Función para comprobar si el usuario pertenece al fichero abierto
	public String[] comprobarUsuario(String usuario, String Password) throws IOException{	
		Boolean busqueda=false;
		lector=new BufferedReader(new FileReader(ficheroUsuario));	//establezco fichero de solo lectura
		String linea;	
		String tipo[]=new String[2];	//crea array de Strings de 2 elementos
		tipo[0]="false";	//establece primer parámetro como falso
		tipo[1]="null";		//establece segundo parámetro como valor nulo
		while((linea=lector.readLine())!=null &&(!busqueda)){	//inicia búsqueda del usuario
			String[] lineatxt=linea.split(";");	//establece como salto de parámetro el ;
			if(lineatxt[0].equals(usuario)){
				if(lineatxt[1].equals(Password)){
					busqueda=true;	//iguala la búsqueda a verdadero
					tipo[0]="true";	//establece el primer parámetro como verdadero
					tipo[1]=lineatxt[2];	//indica q el tercer elemento del array lineatxt es el valor del segundo elemento del array tipo
				}
			}
		}
		
		return tipo;	//devuelve el array completo
	}
	
	public void guardarUsuario(String historial, String contrasena){
		try {
			escritor= new BufferedWriter(new FileWriter(ficheroUsuario,true));  
			escritor.newLine();

			escritor.write(historial+";"+contrasena+";paciente");
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void guardarPaciente(String historial, String Nombre, String Apellidos, String Dni, String Direccion, String CP, String Localidad, String Provincia, 
			String Telefono, String Email, String Sexo, double Altura, double Peso, double Imc, int diaNacimiento, int mesNacimiento, int anoNacimiento, int diaInicio, int mesInicio, int anoInicio, String Foto){
		try {
			escritor= new BufferedWriter(new FileWriter(ficheroPacientes,true)); //el parametro true en FileWtiter hace el que el fichero 
			escritor.newLine();
			escritor.write(historial+p+Nombre+p+Apellidos+p+Dni+p+Direccion+p+CP+p+Localidad+p+Provincia+p+Telefono+p+Email+p+Sexo+p+Altura+p+Peso+p+Imc+p+diaNacimiento+p+mesNacimiento+p+anoNacimiento+p+diaInicio+p+mesInicio+p+anoInicio+p+Foto);
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void guardarMedicoPaciente(String historialPaciente, String historialMedico, String nombre) {
		try {
			escritor= new BufferedWriter(new FileWriter(ficheroMedicoPaciente,true));  
			escritor.newLine();
			escritor.write(historialPaciente+p+historialMedico+p+nombre);
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public String nuevoNumHistorial() throws IOException{
		Scanner scan = new Scanner (new File("ficheroPacientes.txt"));
		String usuario = null;
		String lineatxt[] = null;
		lineatxt = scan.nextLine().split(";");
		int usuarioMax = Integer.valueOf(lineatxt[0]);

		while(scan.hasNextLine()) {
			lineatxt=scan.nextLine().split(";");
			if (Integer.valueOf(lineatxt[0])>usuarioMax) {
				usuarioMax = Integer.valueOf(lineatxt[0]);
			}

		}
		usuarioMax = usuarioMax + 1;
		usuario = Integer.toString(usuarioMax);
		return usuario;
	}
	
	
	public String[][] comprobarPacientes(String numHistorialMed) throws IOException{
		lector=new BufferedReader(new FileReader(ficheroMedicoPaciente));
		lector1=new BufferedReader(new FileReader(ficheroMedicoPaciente));//establezco fichero de solo lectura
		String linea;
		int contador=0;
		while((linea=lector.readLine())!=null){	//inicia búsqueda del usuario
			String[] lineatxt=linea.split(";");	//establece como salto de parámetro el ;
			if(lineatxt[1].equals(numHistorialMed)) {	
				contador++;	
			}
		}
		String tipo[][]=new String[contador][3];	//crea array de Strings de 2 elementos
		int contador1=0;
		while((linea=lector1.readLine())!=null){	//inicia búsqueda del usuario
			String[] lineatxt=linea.split(";");	//establece como salto de parámetro el ;
			if(lineatxt[1].equals(numHistorialMed)){	//
					tipo[contador1][0]=lineatxt[0];	//establece el primer parámetro como verdadero
					tipo[contador1][1]=lineatxt[1];
					tipo[contador1][2]=lineatxt[2];
					contador1++;
			}
		}
		return tipo;	//devuelve el array completo
	}
	

	public String[] comprobarMedico(String historial) throws IOException{
		Boolean busqueda=false;
		lector = new BufferedReader(new FileReader(ficheroMedico));	//establezco fichero de solo lectura
		String linea;	
		String tipo[]=new String[3];	//crea array de Strings de 2 elementos
		while((linea=lector.readLine())!=null &&(!busqueda)){	//inicia búsqueda del usuario
			String[] lineatxt=linea.split(";");	//establece como salto de parámetro el ;
			if(lineatxt[0].equals(historial)){	//
				busqueda=true;	//iguala la búsqueda a verdadero
				tipo=lineatxt;
				}
			}
		return tipo;	
	}
	
	public String[][] encontrarPacientes(String numHistorialMed) throws IOException{
		String[][] listadoFichero = this.comprobarPacientes(numHistorialMed);
		String[][] listadoPacientes = new String[listadoFichero.length][3];
		Scanner scan = new Scanner (new File("ficheroPacientes.txt"));
		String[] lineatxt;
		
		//ListadoPacientes --> 0 = historial, 1 = nombre , 2 = apellidos 
		for (int i = 0; i < listadoFichero.length ; i++) {
			listadoPacientes[i][0] =  listadoFichero[i][0];
			listadoPacientes[i][1] =  listadoFichero[i][2];
			boolean busqueda = false;	
			while(scan.hasNextLine() && (!busqueda)) {
				lineatxt=scan.nextLine().split(";");
				if(lineatxt[0].equals(listadoFichero[i][0])){	
					busqueda=true;	
					listadoPacientes[i][2] = lineatxt[2];
				} else {
					busqueda=false;	
					listadoPacientes[i][2] = "--";
				}
			}
		}
		return listadoPacientes;
	}
	
	public String[][] informacionPaciente (String numHistorialMed, String usuarioPaciente) throws IOException{
		String[][] listadoFichero = this.comprobarPacientes(numHistorialMed);
		String[][] infoPaciente = new String[listadoFichero.length][22];
		Scanner scan = new Scanner (new File("ficheroPacientes.txt"));
		String[] lineatxt = new String[18];
		
		//ListadoPacientes --> 0 = historial, 1 = nombre , 2 = apellidos 
		for (int i = 0; i < infoPaciente.length ; i++) {
			boolean busqueda = false;	
			while(scan.hasNextLine() && (!busqueda)) {
				lineatxt=scan.nextLine().split(";");
				if(lineatxt[0].equals(listadoFichero[i][0])){	
					busqueda=true;	
					for (int j = 0; j < infoPaciente.length; j++){
						infoPaciente[i][j] = lineatxt[j];
					}
				}
			}
		}
		return infoPaciente;
	}
	
	public String[] leeDatosPrisionero(String usuario) throws IOException {
		Boolean busqueda=false;
		lector = new BufferedReader(new FileReader(ficheroPacientes));	//establezco fichero de solo lectura
		String linea;	
		String tipo[]=new String[22];	//crea array de Strings de 2 elementos
		while((linea=lector.readLine())!=null &&(!busqueda)){	//inicia búsqueda del usuario
			String[] lineatxt=linea.split(";");	//establece como salto de parámetro el ;
			if(lineatxt[0].equals(usuario)){	//
				busqueda=true;	//iguala la búsqueda a verdadero
				tipo=lineatxt;
			}
		}
		return tipo;
	}
		
	public String[] obtenerDatosPaciente(String numHistorial) throws IOException {
		String[] datos = new String[3];
		lector = new BufferedReader(new FileReader(ficheroPacientes));
		String linea;	
		Boolean busqueda=false;
		
		while((linea=lector.readLine())!=null &&(!busqueda)){	//inicia búsqueda del usuario
			String[] lineatxt=linea.split(";");	//establece como salto de parámetro el ;
			if(lineatxt[0].equals(numHistorial)){	//
				busqueda=true;
				datos[0] = lineatxt[0];
				datos[1] = lineatxt[1];
				datos[2] = lineatxt[2];
			}
		}
		return datos;
	}
}