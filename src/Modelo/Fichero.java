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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Fichero {
	
    BufferedWriter escritor;
    BufferedReader lector;//crea un lector de fichero
    BufferedReader lector1;//crea un lector de fichero
    File ficheroUsuario = new File("FicheroUsuarios.txt");
    File ficheroPrisioneros= new File("FicheroPrisioneros.txt");
    File ficheroEmpleados= new File("FicheroEmpleados.txt");
    File ficheroHorarios= new File("FicheroHorarios.txt");
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
    public String[][] obtieneMariz(String nombreFichero, int columnas) throws FileNotFoundException, IOException {
        int numeroColumnas=columnas;
        String nombre=nombreFichero;
	FileReader fr = new FileReader(nombre+".txt");
	BufferedReader bf = new BufferedReader(fr);
	int lNumeroLineas = 0;
            String sCadena;
	while ((sCadena = bf.readLine())!=null) {
  		lNumeroLineas++;
	}
	Scanner scan = new Scanner (new File(nombre+".txt"));
        String[] lineatxt = scan.nextLine().split(";");
	String informacion[][] = new String[lNumeroLineas][numeroColumnas];
	for (int i=0 ; i<lNumeroLineas ; i++){
		for(int j=0; j<numeroColumnas ; j++) {
			informacion[i][j] = lineatxt[j];
                        System.out.println(informacion[i][j]);
		}
	}
	return informacion;
        }
        
    public String[][] obtieneMarizrecluso() throws FileNotFoundException, IOException {
	try{
        int numeroColumnas=7;
	FileReader fr = new FileReader(ficheroPrisioneros);
	BufferedReader bf = new BufferedReader(fr);
	int lNumeroLineas = 0;
        String sCadena;
	while ((sCadena = bf.readLine())!=null) {
  		lNumeroLineas++;
	}
        Scanner scan;
        scan = new Scanner (ficheroPrisioneros);
	String informacion[][] = new String[lNumeroLineas][numeroColumnas];
	for (int i=0 ; i<lNumeroLineas ; i++){
            String[] lineatxt = scan.nextLine().split(";");
		for(int j=0; j<numeroColumnas ; j++) {
			informacion[i][j] = lineatxt[j];
		}
	}
	return informacion;
         }catch(FileNotFoundException e){
             System.out.println(e);
             return null;
         }catch(IOException r ){
             System.out.println(r);
       return null;  
    }            
}
    public String[][] obtieneMarizEmpleados() throws FileNotFoundException, IOException {
	try{
        int numeroColumnas=7;
	FileReader fr = new FileReader(ficheroEmpleados);
	BufferedReader bf = new BufferedReader(fr);
	int lNumeroLineas = 0;
            String sCadena;
	while ((sCadena = bf.readLine())!=null) {
  		lNumeroLineas++;
	}
	Scanner scan;
        scan = new Scanner (ficheroPrisioneros);
	String informacion[][] = new String[lNumeroLineas][numeroColumnas];
	for (int i=0 ; i<lNumeroLineas ; i++){
            String[] lineatxt = scan.nextLine().split(";");
		for(int j=0; j<numeroColumnas ; j++) {
			informacion[i][j] = lineatxt[j];
		}
	}
	return informacion;
         }catch(FileNotFoundException e){
             System.out.println(e);
             return null;
         }catch(IOException r ){
             System.out.println(r);
       return null;  
        }            
    }
        public String[][] obtieneMarizHorarios() throws FileNotFoundException, IOException {
	try{
       int numeroColumnas = 4;
	FileReader fr = new FileReader(ficheroHorarios);
	BufferedReader bf = new BufferedReader(fr);
	int lNumeroLineas = 0;
            String sCadena;
	while ((sCadena = bf.readLine())!=null) {
  		lNumeroLineas++;
	}
	Scanner scan;
        scan = new Scanner (ficheroHorarios);
        //String[] lineatxt = scan.nextLine().split(";");
	String informacion[][] = new String[lNumeroLineas][numeroColumnas];
	for (int i=0 ; i<lNumeroLineas ; i++){
            String[] lineatxt = scan.nextLine().split(";");
		for(int j=0; j<numeroColumnas ; j++) {
			informacion[i][j] = lineatxt[j];
		}
	}
	return informacion;
         }catch(FileNotFoundException e){
             System.out.println(e);
             return null;
         }catch(IOException r ){
             System.out.println(r);
       return null;  
        } 
    }
    
        
        
}