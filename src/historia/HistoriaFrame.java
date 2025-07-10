package historia;

import niveles.Nivel1Frame;

import javax.swing.*;
import java.awt.*;

public class HistoriaFrame extends JFrame {
    private JTextArea textoHistoria;
    private String historiaCompleta;
    private int indiceTexto = 0;
    private Timer timer;

    public HistoriaFrame() {
        setTitle("Escape Room: Pirámide");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Panel con imagen de fondo personalizada
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

        // Caja de texto para la historia
        textoHistoria = new JTextArea();
        textoHistoria.setBounds(90, 70, 600, 250);
        textoHistoria.setWrapStyleWord(true);
        textoHistoria.setLineWrap(true);
        textoHistoria.setEditable(false);
        textoHistoria.setOpaque(false); // Fondo transparente para mostrar imagen
        textoHistoria.setFont(new Font("Serif", Font.PLAIN, 16));
        textoHistoria.setForeground(new Color(60, 40, 20)); // Marrón oscuro
        panelFondo.add(textoHistoria);

        // Historia con estilo elegante y misterioso
        historiaCompleta = """
Te adentras en el corazón del desierto egipcio.  
Tras años de investigación, finalmente encuentras la entrada de una pirámide olvidada
,oculta bajo siglos de arena y silencio.
Eres un investigador solitario, guiado por el deseo de revelar secretos que el tiempo
quiso enterrar.  
Pero apenas cruzas el umbral, un estruendo sella la entrada tras de ti.  
Has quedado atrapado.
El aire es espeso. Las paredes, cubiertas de símbolos antiguos, parecen observarte.  
Y en medio del silencio, una voz resuena desde lo profundo de la piedra:
“Quien perturbe el descanso de los antiguos…  
deberá probar su sabiduría, o ser condenado a la eternidad.”
Ahora no hay vuelta atrás.  
Solo resolviendo los acertijos del pasado podrás avanzar.  
Cada respuesta correcta es una llave.  
Cada error... un paso más hacia la perdición.
""";


        // Botón para comenzar la aventura
        JButton empezar = new JButton("Comenzar Aventura");
        empezar.setBounds(260, 365, 180, 40);
        empezar.setBackground(new Color(139, 69, 19));
        empezar.setForeground(Color.WHITE);
        empezar.setFocusPainted(false);
        empezar.setFont(new Font("Serif", Font.BOLD, 14));
        empezar.addActionListener(e -> {
            timer.stop(); // Detener animación si sigue escribiendo
            dispose();
            new Nivel1Frame().setVisible(true);
        });
        panelFondo.add(empezar);

        // Iniciar efecto de escritura
        iniciarEscrituraAnimada();
    }

    private void iniciarEscrituraAnimada() {
        StringBuilder textoMostrado = new StringBuilder();
        timer = new Timer(25, e -> {
            if (indiceTexto < historiaCompleta.length()) {
                textoMostrado.append(historiaCompleta.charAt(indiceTexto));
                textoHistoria.setText(textoMostrado.toString());
                indiceTexto++;
            } else {
                ((Timer) e.getSource()).stop();
            }
        });
        timer.start();
    }
}

