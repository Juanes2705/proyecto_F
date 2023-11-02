/*
Version 1.0

Autores:Juan esteban Guerrero Rivera – 2257726
        Juan Carlos Salgado Velásquez – 2257857
        Juan Pablo Calderón Gallego – 2257594
        José Lindsay Bohada Linares - 2257840


Ultima Modificacion: 2/10/2023
*/
package datos;


public class datosH {

    String Habitaciones,Huespedes ,Nombre;
    
    
    public datosH(String Habitaciones,String Huespedes,String Nombre){
        this.Habitaciones=Habitaciones;
        this.Nombre=Nombre;
        this.Huespedes=Huespedes;
    }
    
    public String getHaBitaciones(){
        return Habitaciones;
    }
    public String getHuesPedes(){
        return Huespedes;
    }
    public String getNomBre(){
        return Nombre;
    }
}
