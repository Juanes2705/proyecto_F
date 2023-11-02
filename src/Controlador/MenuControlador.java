/*
Version 1.0

Autores:Juan esteban Guerrero Rivera – 2257726
        Juan Carlos Salgado Velásquez – 2257857
        Juan Pablo Calderón Gallego – 2257594
        José Lindsay Bohada Linares - 2257840


Ultima Modificacion: 2/10/2023
*/
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.MenuPrincipal;
import vista.Restaurante;
import vista.recepcion;
import vista.Listado;
import vista.Acerca;

public class MenuControlador implements ActionListener{

    MenuPrincipal MP; 
    
    public MenuControlador(MenuPrincipal MP){
        this.MP = MP;        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(MP.JRestaurante)) {
            //System.out.println("Clic en jbForm");
            Restaurante R = new Restaurante(MP);
            MP.setVisible(false);
        }
        if (e.getSource().equals(MP.JRecepcion)) {
            //System.out.println("Clic en jbGrafica");
            recepcion r = new recepcion(MP);
            MP.setVisible(false);
        }
        if (e.getSource().equals(MP.JListado)) {
            Listado L = new Listado(MP);
              
        }
        if (e.getSource().equals(MP.Jacerca)) {
            Acerca  L = new Acerca(MP);

        }
    
    }
    
}
