/*
Version 1.0

Autores:Juan esteban Guerrero Rivera – 2257726
        Juan Carlos Salgado Velásquez – 2257857
        Juan Pablo Calderón Gallego – 2257594
        José Lindsay Bohada Linares - 2257840


Ultima Modificacion: 2/10/2023
*/
package vista;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import Controlador.restaurantecontrol;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Restaurante extends JFrame{
    
    public JButton jbVolver, jbGuardar, jbLimpiar;
    public MenuPrincipal MP;
    public JComboBox<String>jmesa,jmenu;
    
    
    
    public Restaurante(MenuPrincipal MP){
        super("Restaurante");
        this.MP = MP;
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        crearGUI();
        
        setVisible(true);
    }
    private void crearGUI(){
        restaurantecontrol rc = new restaurantecontrol(this);
        
        
        JLabel jmenus = new JLabel("desayunos:");
        jmenus.setBounds(40, 80, 120, 30);
        jmenus.setForeground(Color.BLACK);
        add(jmenus);
        
        JLabel jmesas = new JLabel("Mesas:");
        jmesas.setBounds(40, 200, 120, 30);
        jmesas.setForeground(Color.BLACK);
        add(jmesas);
        
        jmenu = new JComboBox<>();
        jmenu.addItem("huevos");
        jmenu.addItem("huevos pericos");
        jmenu.addItem("huevos rancheros");
        jmenu.addItem("frutas");
        jmenu.setBounds(120, 80, 150, 30);
        add(jmenu);
        
        jmesa = new JComboBox<>();
        for (int i = 1; i <= 15; i++) jmesa.addItem(i + "");
        jmesa.setBounds(120, 200, 50, 30);
        add(jmesa);
        
        jbLimpiar = new JButton("Limpiar");
        jbLimpiar.setBounds(220, 420, 150, 30);
        jbLimpiar.setMnemonic('L');
        jbLimpiar.addActionListener(rc);
        jbLimpiar.setBackground(Color.BLACK);
        jbLimpiar.setForeground(Color.WHITE);
        add(jbLimpiar);
        
        jbGuardar = new JButton("Guardar");
        jbGuardar.setBounds(60, 420, 150, 30);
        jbGuardar.setMnemonic('G');
        jbGuardar.addActionListener(rc);
        jbGuardar.setBackground(Color.BLACK);
        jbGuardar.setForeground(Color.WHITE);
        add(jbGuardar);
        
        jbVolver = new JButton("Volver al menu");
        jbVolver.setBounds(400, 420, 200, 30);
        jbVolver.setMnemonic('V');
        jbVolver.addActionListener(rc);
        jbVolver.setBackground(Color.BLACK);
        jbVolver.setForeground(Color.WHITE);
        add(jbVolver);
        
    }
    
    
}
