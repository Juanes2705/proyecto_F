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
import javax.swing.JOptionPane;
import datos.datosR;
import vista.Restaurante;

public class restaurantecontrol implements ActionListener{
    
    Restaurante R;
    
    public restaurantecontrol(Restaurante R){
        this.R=R;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(R.jbVolver)) {
            volver();
        }
        if (e.getSource().equals(R.jbLimpiar)) {
            limpiar();
        }
        if (e.getSource().equals(R.jbGuardar)) {
            
            String men = (String) R.jmenu.getSelectedItem();
            String mes = (String) R.jmesa.getSelectedItem();
            
            datosR D = new datosR(mes,men);
            R.MP.Datosr.add(D);
            int resp = JOptionPane.showConfirmDialog(
                    R, 
                    "Se guardaron los datos del restaurante.\nDesea ingresar otros datos del restaurante?", 
                    "Confirmación", 
                    JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                limpiar();
            }else{
                volver();
            }
        }
    
    }

    private void volver() {
        R.setVisible(false);
        R.dispose();
        R.MP.setVisible(true);
    }

    private void limpiar() {
        R.jmenu.setSelectedItem("Huevos");
        R.jmesa.setSelectedItem("1");
    }
    
    
    
}
