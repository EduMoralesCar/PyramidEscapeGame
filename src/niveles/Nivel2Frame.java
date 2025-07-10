
package niveles;

import javax.swing.*;

public class Nivel2Frame extends JFrame {
    public Nivel2Frame() {
        setTitle("Nivel 2 - Cámara Interna");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        Nivel2InteractivoPanel panel = new Nivel2InteractivoPanel();
        setContentPane(panel);
        setVisible(true);
    }
}