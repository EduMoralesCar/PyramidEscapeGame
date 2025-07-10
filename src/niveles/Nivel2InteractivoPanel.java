package niveles;

import logica.Personaje;
import logica.GestorPreguntas;
import logica.Pregunta;
import utilidades.ReproductorSonido;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Nivel2InteractivoPanel extends JPanel {
    private final Personaje personaje;
    private final Rectangle puertaInterna;
    private final Image fondo;
    private ReproductorSonido musica;

    public Nivel2InteractivoPanel() {
        setFocusable(true);
        requestFocusInWindow();

        personaje = new Personaje(50, 300); // Posición inicial del personaje
        // Coordenadas ajustadas a la puerta oscura del fondo en tu imagen
        puertaInterna = new Rectangle(250, 110, 100, 130); 

        fondo = new ImageIcon("src/recursos/imagenes/nivel2_fondo.png").getImage(); // Fondo con la cámara interna real
        musica = new ReproductorSonido();
musica.reproducir("src/recursos/sonidos/musica_nivel2.wav", true); // En bucle

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int dx = 0, dy = 0;
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_W -> dy = -10;
                    case KeyEvent.VK_S -> dy = 10;
                    case KeyEvent.VK_A -> dx = -10;
                    case KeyEvent.VK_D -> dx = 10;
                }
                personaje.mover(dx, dy);
                verificarColision();
                repaint();
            }
        });
    }

    private void verificarColision() {
        if (personaje.getBounds().intersects(puertaInterna)) {
            Pregunta pregunta = GestorPreguntas.obtenerPregunta(2); // "¿En qué ciudad se encuentran las pirámides de Giza?"
            String respuesta = JOptionPane.showInputDialog(this, pregunta.getPregunta());

            if (respuesta != null && pregunta.verificarRespuesta(respuesta)) {
                new ReproductorSonido().reproducir("src/recursos/sonidos/respuesta_correcta.wav", false);
                JOptionPane.showMessageDialog(this, "¡Correcto! Ahora entras a la cámara del tesoro...");
                musica.detener();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                new Nivel3Frame().setVisible(true);
            } else {
                new ReproductorSonido().reproducir("src/recursos/sonidos/respuesta_incorrecta.wav", false);
                JOptionPane.showMessageDialog(this, "Respuesta incorrecta. Intenta de nuevo.");
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
        personaje.dibujar(g);

        // Para visualizar la zona de colisión (puedes borrar estas 2 líneas si ya está alineado)
        // g.setColor(Color.RED);
        // g.drawRect(puertaInterna.x, puertaInterna.y, puertaInterna.width, puertaInterna.height);
    }
}

    