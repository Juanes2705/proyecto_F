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
import datos.datosH;
import vista.recepcion;


public class recepcioncontrolador implements ActionListener {

    recepcion H;
    
    public recepcioncontrolador(recepcion H){
        this.H = H;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        if (e.getSource().equals(H.jbVolver)) {
            volver();
        }
        if (e.getSource().equals(H.jbLimpiar)) {
            limpiar();
        }
        if (e.getSource().equals(H.jbGuardar)) {
            String nom = H.jNom.getText();
            String hab = (String) H.jhabi.getSelectedItem();
            String hos = (String) H.jhuespedes.getSelectedItem();
            datosH h = new datosH(hab, hos, nom);
            H.MP.Datosh.add(h);
            int resp = JOptionPane.showConfirmDialog(
                    H, 
                    "Se guardaron los datos de la recepciom.\nDesea ingresar otros datos?", 
                    "Confirmación", 
                    JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                limpiar();
            }else{
                volver();
            }
        }
        
    }
    private void limpiar() {

        H.jNom.setText("");
        H.jhabi.setSelectedItem("1");
        H.jhuespedes.setSelectedItem("1");
    }

    private void volver() {
        H.setVisible(false);
        H.dispose();
        H.MP.setVisible(true);
    }
    
}
