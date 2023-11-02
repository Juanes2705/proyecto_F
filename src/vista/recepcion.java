/*
Version 1.0

Autores:Juan esteban Guerrero Rivera – 2257726
        Juan Carlos Salgado Velásquez – 2257857
        Juan Pablo Calderón Gallego – 2257594
        José Lindsay Bohada Linares - 2257840


Ultima Modificacion: 2/10/2023
*/
package vista;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import Controlador.recepcioncontrolador;
import java.awt.Color;
import javax.swing.JLabel;

public class recepcion extends JFrame{
    
    
    public JButton jbVolver, jbGuardar, jbLimpiar;
    public MenuPrincipal MP;
    public JTextField jNom;
    public JComboBox<String> jhabi,jhuespedes;
    
    public recepcion(MenuPrincipal MP){
        super("Recepcion");
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
        recepcioncontrolador rpc= new recepcioncontrolador(this);
        
        JLabel jlhabi = new JLabel("Habitaciones:");
        jlhabi.setBounds(40, 100, 120, 30);
        jlhabi.setForeground(Color.BLACK);
        add(jlhabi);
        
        jhabi = new JComboBox<>();
        for (int i = 1; i <= 50; i++) jhabi.addItem(i + "");
        jhabi.setBounds(160, 100, 50, 30);
        add(jhabi);
        
        JLabel jlNom = new JLabel("Nombre:");
        jlNom.setBounds(40, 180, 120, 30);
        jlNom.setForeground(Color.BLACK);
        add(jlNom);
        
        
        jNom = new JTextField();
        jNom.setBounds(160, 180, 200, 30);
        add(jNom);
        
        JLabel jlhues = new JLabel("Huespedes:");
        jlhues.setBounds(40, 260, 120, 30);
        jlhues.setForeground(Color.BLACK);
        add(jlhues);
        
        jhuespedes = new JComboBox<>();
        for (int i = 1; i <= 5; i++) jhuespedes.addItem(i + "");
        jhuespedes.setBounds(160, 260, 50, 30);
        add(jhuespedes);
        
        jbLimpiar = new JButton("Limpiar");
        jbLimpiar.setBounds(220, 420, 150, 30);
        jbLimpiar.setMnemonic('L');
        jbLimpiar.addActionListener(rpc);
        jbLimpiar.setBackground(Color.BLACK);
        jbLimpiar.setForeground(Color.WHITE);
        add(jbLimpiar);
        
        jbGuardar = new JButton("Guardar");
        jbGuardar.setBounds(60, 420, 150, 30);
        jbGuardar.setMnemonic('G');
        jbGuardar.addActionListener(rpc);
        jbGuardar.setBackground(Color.BLACK);
        jbGuardar.setForeground(Color.WHITE);
        add(jbGuardar);
        
        jbVolver = new JButton("Volver al menu");
        jbVolver.setBounds(400, 420, 200, 30);
        jbVolver.setMnemonic('V');
        jbVolver.addActionListener(rpc);
        jbVolver.setBackground(Color.BLACK);
        jbVolver.setForeground(Color.WHITE);
        add(jbVolver);
        
       
    }
    
}
