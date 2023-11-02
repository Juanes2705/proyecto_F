/*
Version 1.0

Autores:Juan esteban Guerrero Rivera – 2257726
        Juan Carlos Salgado Velásquez – 2257857
        Juan Pablo Calderón Gallego – 2257594
        José Lindsay Bohada Linares - 2257840


Ultima Modificacion: 2/10/2023
*/
package datos;

import datos.datosH;
import datos.datosR;

public class DatosCombinados {
    public String habitacionesH,huespedesH,nombreH,mesasR,menusR;
    public datosR getDatosR;
    public datosH getDatosH;
    

    public DatosCombinados(String habitacionesH, String huespedesH, String nombreH, String mesasR, String menusR) {
        this.habitacionesH = habitacionesH;
        this.huespedesH = huespedesH;
        this.nombreH = nombreH;
        this.mesasR = mesasR;
        this.menusR = menusR;
    }

    public String getHabitacionesH() {
        return habitacionesH;
    }

    public String getHuespedesH() {
        return huespedesH;
    }

    public String getNombreH() {
        return nombreH;
    }

    public String getMesasR() {
        return mesasR;
    }

    public String getMenusR() {
        return menusR;
    }

    public datosH getDatosH() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
