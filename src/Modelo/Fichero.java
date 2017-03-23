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
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Fichero {
	
    BufferedWriter escritor;
    BufferedReader lector;//crea un lector de fichero
    BufferedReader lector1;//crea un lector de fichero
    File ficheroUsuario = new File("FicheroUsuarios.txt");
    public File ficheroPrisioneros= new File("FicheroPrisioneros.txt");
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
        lector.close();
	return tipo;	//devuelve el array completo
    }
    /**
     * Obtiene una matriz bidimensional con los datos obtenidos de un fichero
     * @author Miguel Chacon Carrasco
     * @param nombreFichero es el nombre del fichero que se va a bolcar en la matriz
     * @param columnas numero de columnas de la matriz
     * @return Devuelve la matriz bidimensional
     * @throws FileNotFoundException
     * @throws IOException 
     */
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
        scan.close();
        bf.close();
        fr.close();
	return informacion;
        }
        /**
         * Esta funcion hace exactamente lo mismo que la de obtenerMatriz() solo que con el nombre del fichero y el numero de columnas fijado a reclusos
         * @author Miguel Chacon Carrasco
         * @return Devuelve la informacion de los reclusos guardados en el txt, en una matriz bidimensonal
         * @throws FileNotFoundException
         * @throws IOException 
         */
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
        scan.close();
        bf.close();
        fr.close();
	return informacion;
         }catch(FileNotFoundException e){
             System.out.println(e);
             return null;
         }catch(IOException r ){
             System.out.println(r);
       return null;  
    }            
}
    /**
     * Misma funcionalidad que obtenerMatrizRecluso() solo que enfocado a los empleados
     * @author Miguel Chacon carrasco
     * @return Empleados
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public String[][] obtieneMarizEmpleados() throws FileNotFoundException, IOException {
	try{
        int numeroColumnas=4;
	FileReader fr = new FileReader(ficheroEmpleados);
	BufferedReader bf = new BufferedReader(fr);
	int lNumeroLineas = 0;
            String sCadena;
	while ((sCadena = bf.readLine())!=null) {
  		lNumeroLineas++;
	}
	Scanner scan;
        scan = new Scanner (ficheroEmpleados);
	String informacion[][] = new String[lNumeroLineas][numeroColumnas];
	for (int i=0 ; i<lNumeroLineas ; i++){
            String[] lineatxt = scan.nextLine().split(";");
		for(int j=0; j<numeroColumnas ; j++) {
			informacion[i][j] = lineatxt[j];
		}
	}
        scan.close();
        bf.close();
        fr.close();
	return informacion;
         }catch(FileNotFoundException e){
             System.out.println(e);
             return null;
         }catch(IOException r ){
             System.out.println(r);
       return null;  
        }            
    }
    /**
     * @author Miguel Chacon Carrasco
     * @return
     * @throws FileNotFoundException
     * @throws IOException 
     */
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
        scan.close();
        fr.close();
        bf.close();
	return informacion;
         }catch(FileNotFoundException e){
             System.out.println(e);
             return null;
         }catch(IOException r ){
             System.out.println(r);
       return null;  
        } 
    }
        /**
         * Esta funcion es la que se encarga de aberiguar el numero de filas de un archivo
         * @author Miguel Chacon Carrasco
         * @return numeroFilas
         * @throws FileNotFoundException
         * @throws IOException 
         */
        public int numeroFilasReclusos() throws FileNotFoundException, IOException{
            int numeroFilas=0;
             String sCadena;
             FileReader fr = new FileReader(ficheroPrisioneros);
             BufferedReader bf = new BufferedReader(fr);
	while ((sCadena = bf.readLine())!=null) {
  		numeroFilas++;
	}
        fr.close();
        bf.close();
            return numeroFilas;
        }
        public int numeroFilasEmpleados() throws FileNotFoundException, IOException{
            int numeroFilas=0;
             String sCadena;
             FileReader fr = new FileReader(ficheroEmpleados);
             BufferedReader bf = new BufferedReader(fr);
	while ((sCadena = bf.readLine())!=null) {
  		numeroFilas++;
	}
        fr.close();
        bf.close();
            return numeroFilas;
        }
        /**
         * Funcion encargado del guardado de un recluso nuevo
         * @author Miguel Chacon Carrasco 
         * @param nuevorecluso
         * @throws IOException 
         */
        public void guardarnuevorecluso(String[] nuevorecluso) throws IOException{
       try{
        
          String[][] reclusosAntiguos= obtieneMarizrecluso();
            String[] nuevoRecluso;
            nuevoRecluso = new String[7];
            nuevoRecluso=nuevorecluso;
            int numeroFilas;
            numeroFilas=numeroFilasReclusos()+1;
            String[][] todosPrisioneros;
            todosPrisioneros=new String[numeroFilas][7];//Creacion de una nueva matriz, con una linea extra para guardar al nuevo recluso
            for (int i=0; i<numeroFilas-1;i++){//volcado de los viejos reclusos en la nueva matriz
                for (int j=0;j<7;j++){
                    todosPrisioneros[i][j]=reclusosAntiguos[i][j];
                }
            }
            for(int i = 0; i<7;i++){//Se añade al nuevo recluso
                todosPrisioneros[numeroFilas-1][i]=nuevoRecluso[i];
            }
            PrintWriter writer = new PrintWriter (new PrintStream (ficheroPrisioneros), true);
            for(int i=0;i<numeroFilas;i++){//Sobre escritura del txt, guardando asi los reclusos
            writer.println(todosPrisioneros[i][0]+ ";"+todosPrisioneros[i][1]+ ";"+todosPrisioneros[i][2]+ ";"+todosPrisioneros[i][3]+ ";"+todosPrisioneros[i][4]+ ";"+todosPrisioneros[i][5]+ ";"+todosPrisioneros[i][6]+ ";");
            }
            writer.close();
            }catch (IOException e){
                System.out.println(e);
            }catch(Exception p){
                System.out.println(p);
            }
    }
        /**
         * Funcion encargada del guardado de nuevos empleados
         * @author Miguel Chacon Carrasco
         * @param nuevoempleado
         * @throws IOException 
         */
    public void guardarnuevoempleado(String[] nuevoempleado) throws IOException{
       try{
        
          String[][] empleadosAntiguos= obtieneMarizEmpleados();
            String[] nuevoEmpleado;
            nuevoEmpleado = new String[4];
            nuevoEmpleado=nuevoempleado;
            int numeroFilas;
            numeroFilas=numeroFilasEmpleados()+1;
            String[][] todosEmpleados;
            todosEmpleados=new String[numeroFilas][4];
            for (int i=0; i<numeroFilas-1;i++){
                for (int j=0;j<4;j++){
                    todosEmpleados[i][j]=empleadosAntiguos[i][j];
                }
            }
            for(int i = 0; i<4;i++){
                todosEmpleados[numeroFilas-1][i]=nuevoEmpleado[i];
            }
            PrintWriter writer = new PrintWriter (new PrintStream (ficheroEmpleados), true);
            for(int i=0;i<numeroFilas;i++){
            writer.println(todosEmpleados[i][0]+ ";"+todosEmpleados[i][1]+ ";"+todosEmpleados[i][2]+ ";"+todosEmpleados[i][3]+ ";");
            }
            writer.close();
            }catch (IOException e){
                System.out.println(e);
            }catch(Exception p){
                System.out.println(p);
            }
    }    
  
        
}