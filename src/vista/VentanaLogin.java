package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import Controlador.ControladorLogin;
import javax.swing.JPanel;
import vista.LineTextField;



public class VentanaLogin extends JFrame{

    public LineTextField jtLogin;
    public LinePasswordField jpPassw;
    public JToggleButton jtVer; // para ver u ocultar el password
    public BotonRedondeado jbCancelar, jbIngresar;
    public ImageIcon ver, no_ver;
    
   public VentanaLogin() {
        super("Ingreso al sistema");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        // Establece el color de fondo del JFrame en blanco
        getContentPane().setBackground(Color.WHITE);

        Jpanell panel = new Jpanell();
        add(panel);
        crearGUI();

        setVisible(true);
    }

    
    public void crearGUI(){
        ControladorLogin CLL =new ControladorLogin(this);
        ImageIcon im = new ImageIcon(getClass().getResource(
                "imagenes/icons8-registro-50.png"));
        JLabel jlTitulo = new JLabel("Ingreso al sistema", im, JLabel.CENTER);
        jlTitulo.setBounds(0, 0, 400, 75);
        jlTitulo.setOpaque(true);
        jlTitulo.setBackground(Color.WHITE);
        jlTitulo.setHorizontalAlignment(JLabel.CENTER);
        jlTitulo.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(jlTitulo);
        
        
        JLabel jlLogin = new JLabel("Usuario*");
        jlLogin.setBounds(0, 90, 100, 30);
        jlLogin.setHorizontalAlignment(JLabel.RIGHT);
        add(jlLogin);
        
        jtLogin = new LineTextField("Usuario");
        jtLogin.setBounds(50, 120, 150, 30);
        add(jtLogin);
        
        JLabel jlPass = new JLabel("Contraseña*");
        jlPass.setBounds(18, 180, 100, 30);
        jlPass.setHorizontalAlignment(JLabel.RIGHT);
        add(jlPass);
        
        jpPassw = new LinePasswordField("Contraseña");
        jpPassw.setBounds(50, 210, 150, 30);
        jpPassw.setEchoChar('*');
        
        add(jpPassw);
                
        ver = new ImageIcon(getClass().getResource("imagenes/icons8-ver-48.png"));
        no_ver = new ImageIcon(getClass().getResource("imagenes/no_ver.png"));
        jtVer = new JToggleButton(no_ver); 
        jtVer.setBounds(275, 210, 50, 30);
        jtVer.setBorderPainted(false); 
        jtVer.setContentAreaFilled(false); 
        jtVer.setFocusPainted(false); 
        jtVer.addActionListener(CLL);
        add(jtVer); 
        
        jbCancelar = new BotonRedondeado("Cancelar");
        jbCancelar.setBounds(45, 350, 150, 35);
        jbCancelar.addActionListener(CLL);
        jbCancelar.setBackground(Color.BLUE);
        jbCancelar.setForeground(Color.WHITE);
        add(jbCancelar);
        
        jbIngresar = new BotonRedondeado("Ingresar");
        jbIngresar.setBounds(205, 350, 150, 35);
        jbIngresar.addActionListener(CLL);
        jbIngresar.setBackground(Color.BLUE);
        jbIngresar.setForeground(Color.WHITE);
        add(jbIngresar);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaLogin frame = new VentanaLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
}
