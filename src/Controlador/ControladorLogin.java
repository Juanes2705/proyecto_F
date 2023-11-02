package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.MenuPrincipal;
import vista.VentanaLogin;

public class ControladorLogin implements ActionListener {

    VentanaLogin VL;

    public ControladorLogin(VentanaLogin VL) {
        this.VL = VL;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(VL.jtLogin) || e.getSource().equals(VL.jpPassw) || e.getSource().equals(VL.jbIngresar)){
            evento_validar();
        }
        if (e.getSource().equals(VL.jtVer)){
            evento_jtVer();
        }
        if (e.getSource().equals(VL.jbCancelar)) {
            System.exit(0);
        }
    }
    public void evento_jtVer() {
        if (VL.jtVer.isSelected()) {
            VL.jtVer.setIcon(VL.ver);
            VL.jpPassw.setEchoChar((char) 0);
        } else {
            VL.jtVer.setIcon(VL.no_ver);
            VL.jpPassw.setEchoChar('*');
        }
        VL.jpPassw.requestFocus();
    }


    public void evento_validar() {
        String login = VL.jtLogin.getText();
        char[] caracteres = VL.jpPassw.getPassword();
        String passw = String.valueOf(caracteres);

        System.out.println(login + " " + passw);

        if (login.equals("") || passw.equals("")) {
            JOptionPane.showMessageDialog(VL, "Login y/o password no pueden ser vacíos");
        } else {
            if (login.equals("root") && passw.equals("123456")) {
                JOptionPane.showMessageDialog(VL, "Ingreso correcto");

                MenuPrincipal menuPrincipal = new MenuPrincipal();
                menuPrincipal.setVisible(true);

                VL.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(VL,
                        "Ingreso incorrecto. Login y/o password incorrecto",
                        "Error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
