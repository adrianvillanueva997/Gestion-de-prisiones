/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
 
import Vista.ViewAlguacil;
import Vista.VwAlguacilEmpleados;
import Vista.VwFormularioEmpleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
/**
 *
 * @author Adrián Villanueva Martínez
 */
public class CtrlAlguacilEmpleados implements ActionListener {
    public VwAlguacilEmpleados vage;
    public String usuario;
    public ViewAlguacil va;
    public VwFormularioEmpleado vfe;
   
    public CtrlAlguacilEmpleados(VwAlguacilEmpleados vage){
        this.vage = vage;
    }
    @Override
    public void actionPerformed(ActionEvent e){
       if(e.getSource().equals(vage.btnAtras)){
            volver();
        }else if(e.getSource().equals(vage.btnAnadirEmpleado)){
            formulario();
        }
    }
    public void volver(){
        vage.dispose();
        ViewAlguacil var = new ViewAlguacil();
        ControladorAlguacil car = new ControladorAlguacil(var,usuario);
        var.addController(car);
        var.crearVentana(usuario);
    }
   
    public void formulario(){
        vfe = new VwFormularioEmpleado();
        CtrlFormularioEmpleado cfe = new CtrlFormularioEmpleado(vfe);
        vfe.addController(cfe);
        vfe.crearVentanaFormularioEmpleado(usuario);
       
    }
}
