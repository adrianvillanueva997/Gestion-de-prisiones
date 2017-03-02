/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocarceles;
import Vista.ViewLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author adria
 */
public class Main implements ActionListener {
    ViewLogin vistaLogin;
    
    //Constructor por defecto
    public Main(ViewLogin w){
        super();
        vistaLogin = w;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    public static void main(String[] args) {
        
       		ViewLogin mainframe=new ViewLogin();
		Main mc=new Main(mainframe);
		//mainframe.addController(mc);
		mainframe.crearVentana();
    }


    
}
