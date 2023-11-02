/*
Version 1.0

Autores:Juan esteban Guerrero Rivera – 2257726
        Juan Carlos Salgado Velásquez – 2257857
        Juan Pablo Calderón Gallego – 2257594
        José Lindsay Bohada Linares - 2257840


Ultima Modificacion: 2/10/2023
*/
package Controlador;

import datos.datosH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.Acerca;



public class Acercacontrolador implements ActionListener {

    Acerca A;
        
    public Acercacontrolador(Acerca A){
        this.A=A;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(A.jbVolver)) {
            volver();
        
        
            }else{
                volver();
            }
       
        
    }
    private void volver() {
        A.setVisible(false);
        A.dispose();
        A.MP.setVisible(true);
    }
    
}
