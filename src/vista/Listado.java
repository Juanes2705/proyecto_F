/*
Version 1.0

Autores:Juan esteban Guerrero Rivera – 2257726
        Juan Carlos Salgado Velásquez – 2257857
        Juan Pablo Calderón Gallego – 2257594
        José Lindsay Bohada Linares - 2257840


Ultima Modificacion: 2/10/2023
*/
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import datos.DatosCombinados;
import javax.swing.JScrollPane;
import java.util.ArrayList;


public class Listado extends JFrame {
    
    tabla mt;
    JTable tabla;
    MenuPrincipal mp;
    
    public Listado(MenuPrincipal mp){
        super("Listado de datos");
        this.mp = mp;
        setSize(500, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        
        crearGUI();
        llenarTabla();
        
        setVisible(true);
    }
        
        private void crearGUI(){
        JLabel jl = new JLabel("DATOS");
        jl.setBounds(0, 0, 500, 50);
        jl.setBorder(new EtchedBorder());
        jl.setOpaque(true);
        jl.setBackground(new Color(0x191919));
        jl.setForeground(Color.WHITE);
        jl.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(jl);
        
        String encabezados[] = {"Habitaciones", "Nombre", "hospetados", "Mesa", "desayuno"};
        String datos[][] = {{"", "", ""}};
        
        mt = new tabla(datos, encabezados);
        tabla = new JTable(mt);
        
        tabla.setSelectionBackground(Color.lightGray);
        tabla.setSelectionForeground(Color.RED);
       
        JScrollPane js = new JScrollPane(tabla);
        js.setBounds(20, 60, 450, 150);
        
        add(js);
        
        }
        public void llenarTabla() {
            // Limpia los datos existentes en la tabla
            mt.setRowCount(0);

            // Obtén la lista de datos combinados
            ArrayList<DatosCombinados> datosCombinados = mp.obtenerDatosCombinados();

            for (DatosCombinados p : datosCombinados) {
                Object datos[] = new Object[5];

                datos[0] = p.getHabitacionesH();
                datos[1] = p.getNombreH();
                datos[2] = p.getHuespedesH();
                datos[3] = p.getMesasR();
                datos[4] = p.getMenusR();

                mt.addRow(datos);
            }

            repaint();
        }
        
}

