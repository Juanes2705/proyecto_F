package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jpanell extends JPanel {

    public Jpanell() {
        setLayout(null);
        // Border borde = BorderFactory.createLineBorder(Color.BLACK, 2);
        // setBorder(borde);
        setBounds(400, 0, 500, 700);
        setBackground(Color.BLUE);

        // Crea un JLabel para el título
        JLabel titleLabel = new JLabel("Hotel el Faro");
        titleLabel.setBounds(40, 350, 200, 30); // Ajusta las coordenadas y el tamaño del título
        titleLabel.setForeground(Color.WHITE); // Cambia el color del texto del título
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(titleLabel); // Agrega el título al JPanel
    }

}
