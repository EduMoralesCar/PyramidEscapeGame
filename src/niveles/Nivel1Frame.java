// Nivel1Frame.java (reemplazado)
package niveles;

import javax.swing.*;

public class Nivel1Frame extends JFrame {
    public Nivel1Frame() {
        setTitle("Nivel 1 - Entrada a la Pirámide");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        Nivel1InteractivoPanel panel = new Nivel1InteractivoPanel();
        setContentPane(panel);
        setVisible(true);
    }
}


