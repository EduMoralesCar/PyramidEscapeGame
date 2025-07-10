package niveles;

import historia.CreditosFrame;

import javax.swing.*;
import java.awt.*;

public class FinJuegoFrame extends JFrame {
    private JTextArea textoFinal;
    private String mensajeFinal;
    private int indiceTexto = 0;
    private Timer timer;

    public FinJuegoFrame() {
        setTitle("Escape Room: Fin del Juego");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Panel con fondo de imagen antigua
        JPanel panelFondo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image fondo = new ImageIcon("src/recursos/imagenes/fondo_historia.png").getImage();
                g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panelFondo.setLayout(null);
        setContentPane(panelFondo);

        // Área de texto final
        textoFinal = new JTextArea();
        textoFinal.setBounds(90, 70, 600, 250);
        textoFinal.setWrapStyleWord(true);
        textoFinal.setLineWrap(true);
        textoFinal.setEditable(false);
        textoFinal.setOpaque(false);
        textoFinal.setFont(new Font("Serif", Font.PLAIN, 16));
        textoFinal.setForeground(new Color(60, 40, 20));
        panelFondo.add(textoFinal);

        // Texto narrativo del final
        mensajeFinal = """
Has logrado descifrar los secretos milenarios de la pirámide…

Las puertas se abren y la luz del desierto vuelve a abrazarte.

No solo has escapado, has conquistado el legado de los antiguos.

Ahora eres parte de su historia, guardián de un conocimiento olvidado.

Gracias por jugar.
""";

        // Botón para créditos
        JButton creditos = new JButton("Ver Créditos");
        creditos.setBounds(260, 350, 180, 35);
        creditos.setBackground(new Color(139, 69, 19));
        creditos.setForeground(Color.WHITE);
        creditos.setFocusPainted(false);
        creditos.setFont(new Font("Serif", Font.BOLD, 14));
        creditos.addActionListener(e -> {
            dispose();
            new CreditosFrame().setVisible(true);
        });
        panelFondo.add(creditos);

        iniciarEscrituraAnimada();
    }

    private void iniciarEscrituraAnimada() {
        StringBuilder textoMostrado = new StringBuilder();
        timer = new Timer(25, e -> {
            if (indiceTexto < mensajeFinal.length()) {
                textoMostrado.append(mensajeFinal.charAt(indiceTexto));
                textoFinal.setText(textoMostrado.toString());
                indiceTexto++;
            } else {
                ((Timer) e.getSource()).stop();
            }
        });
        timer.start();
    }
}


