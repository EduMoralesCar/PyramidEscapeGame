package niveles;

import javax.swing.*;

public class Nivel3Frame extends JFrame {
    public Nivel3Frame() {
        setTitle("Nivel 3 - Cámara del Tesoro");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        Nivel3InteractivoPanel panel = new Nivel3InteractivoPanel();
        setContentPane(panel);
        setVisible(true);
    }
}

