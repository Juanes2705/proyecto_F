/*
Version 1.0

Autores:Juan esteban Guerrero Rivera – 2257726
        Juan Carlos Salgado Velásquez – 2257857
        Juan Pablo Calderón Gallego – 2257594
        José Lindsay Bohada Linares - 2257840


Ultima Modificacion: 2/10/2023
*/
package vista;

import javax.swing.table.DefaultTableModel;

public class tabla extends DefaultTableModel{
    
    public tabla(Object datos[][], Object encazados[]){
        super(datos, encazados);
    }
    
    public boolean isCellEditable(int row, int column){
        //return true;
        return false;
    }
}
