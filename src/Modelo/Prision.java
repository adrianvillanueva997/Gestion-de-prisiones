/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Vector;

/**
 *
 * @author Adrián Villanueva Martínez
 */
public class Prision {
    private String nombre;
    private String localizacion;
    private Vector<Prisionero> listaPrisioneros = new Vector<Prisionero>();
    private Vector <Empleado> listaEmpleados = new Vector<Empleado>();
    private Vector <Bloque> listaBloques = new Vector<Bloque>();
    
    /**
     *
     * @param nombre
     * @param localizacion
     * @param listaPrisioneros
     * @param listaEmpleados
     * @param listaBloques
     */
    public Prision(String nombre, String localizacion, Vector<Prisionero> listaPrisioneros,Vector<Empleado> listaEmpleados,Vector <Bloque> listaBloques){
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.listaPrisioneros = listaPrisioneros;
        this.listaEmpleados = listaEmpleados;
        this.listaBloques = listaBloques;
    }

    /**
     *
     * @return
     */
    public String getNombre(){
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre){
        nombre = this.nombre;
    }

    /**
     *
     * @return
     */
    public String getLocalizacion(){
        return localizacion;
    }

    /**
     *
     * @param localizacion
     */
    public void setLocalizacion(String localizacion){
        localizacion = this.localizacion;
    }
    public Vector<Prisionero> getListaprisioneros(){
        return listaPrisioneros;
    }

    /**
     *
     * @param listaPrisioneros
     */
    public void setListaprisioneros(Vector<Prisionero> listaPrisioneros){
        listaPrisioneros = this.listaPrisioneros;
    }
    public Vector<Bloque> getlistabloques(){
        return listaBloques;
    }

    /**
     *
     * @param listaBloques
     */
    public void setLlistabloques(Vector<Bloque> listaBloques){
        listaBloques = this.listaBloques;
    }

    /**
     *
     * @return
     */
    public Vector<Empleado> getListaempleados(){
        return listaEmpleados;
    }

    /**
     *
     * @param listaEmpleados
     */
    public void setListaEmpleados(Vector<Empleado> listaEmpleados){
        listaEmpleados = this.listaEmpleados;
    }
}
