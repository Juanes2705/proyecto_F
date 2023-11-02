/*
Version 1.0

Autores:Juan esteban Guerrero Rivera – 2257726
        Juan Carlos Salgado Velásquez – 2257857
        Juan Pablo Calderón Gallego – 2257594
        José Lindsay Bohada Linares - 2257840


Ultima Modificacion: 2/10/2023
*/

package vista;


import Controlador.MenuControlador;
import javax.swing.*;
import java.util.ArrayList;
import datos.datosR;
import datos.datosH;
import vista.Titulo;
import datos.DatosCombinados;
import java.awt.Color;
import java.awt.EventQueue;


public final class MenuPrincipal extends JFrame {
    
    public BotonRedondeado JRestaurante, JRecepcion, JListado, Jacerca;
    public Titulo jt;
    public ArrayList<datosR> Datosr = new ArrayList<>();
    public ArrayList<datosH> Datosh = new ArrayList<>();
    public ArrayList<DatosCombinados> datosCombinados = new ArrayList<>();

    public ArrayList<DatosCombinados> obtenerDatosCombinados() {
        ArrayList<DatosCombinados> datosCombinados = new ArrayList<>();
        int maxSize = Math.min(Datosr.size(), Datosh.size());

        for (int i = 0; i < maxSize; i++) {
            datosR r = Datosr.get(i);
            datosH h = Datosh.get(i);

            String mesasR = r.getMeSas();
            String menusR = r.getMeNus();

            String habitacionesH = h.getHaBitaciones();
            String huespedesH = h.getHuesPedes();
            String nombreH = h.getNomBre();

            DatosCombinados combinados = new DatosCombinados(habitacionesH, huespedesH, nombreH, mesasR, menusR);
            datosCombinados.add(combinados);
        }
        return datosCombinados;
    }

    public MenuPrincipal() {
        super("Menu Principal");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        Guia();
        
        jt = new Titulo(60, "HOTEL EL FARO", this);
        add(jt);
        
        setVisible(true);
    }

    public void Guia() {
        MenuControlador mnc = new MenuControlador(this);

        JRestaurante = new BotonRedondeado("Restaurante");
        JRestaurante.setBounds(250, 120, 200, 40);
        JRestaurante.setMnemonic('I');
        JRestaurante.addActionListener(mnc);
        JRestaurante.setBackground(Color.BLUE);
        JRestaurante.setForeground(Color.WHITE);
        add(JRestaurante);

        JRecepcion = new BotonRedondeado("Recepcion");
        JRecepcion.setBounds(250, 220, 200, 40);
        JRecepcion.setMnemonic('p');
        JRecepcion.addActionListener(mnc);
        JRecepcion.setBackground(Color.BLUE);
        JRecepcion.setForeground(Color.WHITE);
        add(JRecepcion);

        JListado = new BotonRedondeado("Lista de datos");
        JListado.setBounds(250, 320, 200, 40);
        JListado.setMnemonic('l');
        JListado.addActionListener(mnc);
        JListado.setBackground(Color.BLUE);
        JListado.setForeground(Color.WHITE);
        add(JListado);
        
        Jacerca = new BotonRedondeado("Acerca");
        Jacerca.setBounds(250, 420, 200, 40);
        Jacerca.setMnemonic('l');
        Jacerca.addActionListener(mnc);
        Jacerca.setBackground(Color.BLUE);
        Jacerca.setForeground(Color.WHITE);
        add(Jacerca);
    }

    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuPrincipal frame = new MenuPrincipal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/
}

