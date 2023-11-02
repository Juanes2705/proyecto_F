
package vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class LineTextField extends JTextField {
    private String placeholder;

    public LineTextField(String placeholder) {
        this.placeholder = placeholder;

        // Desactivar el borde predeterminado
        setBorder(BorderFactory.createEmptyBorder());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar una línea debajo del campo de texto
        g.setColor(Color.BLACK); // Puedes ajustar el color de la línea
        g.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);

        // Mostrar el texto de la sugerencia si el campo de texto está vacío
        if (getText().isEmpty()) {
            g.setColor(Color.BLUE); // Puedes ajustar el color de la sugerencia
            g.drawString(placeholder, 2, getHeight() - 10);
        }
    }
}


