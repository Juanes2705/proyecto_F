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
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import vista.MenuPrincipal;

public final class Titulo extends JPanel {
    private JLabel titleLabel;
    public MenuPrincipal MP;

    public Titulo(int fontSize, String text, MenuPrincipal MP) {
        this.MP = MP;

        setLayout(null);
        setBounds(0, 0, 700, 100);

        // Configura el color de fondo en negro
        setBackground(Color.WHITE);

        titleLabel = new JLabel(text);
        titleLabel.setFont(new Font("Arial", Font.BOLD, fontSize));
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBounds(0, 0, 700, 80);

        // Agrega un borde alrededor del panel
        setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));

        // Agrega el título al panel
        add(titleLabel);

        
        setOpaque(true);
    }
}