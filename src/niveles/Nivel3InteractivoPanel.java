package niveles;

import logica.Personaje;
import logica.GestorPreguntas;
import logica.Pregunta;
import utilidades.ReproductorSonido;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Nivel3InteractivoPanel extends JPanel {
    private final Personaje personaje;
    private final Rectangle cofre;
    private final Image fondo;
    private ReproductorSonido musica;

    public Nivel3InteractivoPanel() {
        setFocusable(true);
        requestFocusInWindow();

        personaje = new Personaje(50, 300);
        cofre = new Rectangle(100, 100, 60, 100); // Ahora más a la izquierda, justo en la puerta del fondo

        fondo = new ImageIcon("src/recursos/imagenes/nivel3_fondo.png").getImage();
        musica = new ReproductorSonido();
musica.reproducir("src/recursos/sonidos/musica_nivel3.wav", true); // En bucle

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
        if (personaje.getBounds().intersects(cofre)) {
            Pregunta pregunta = GestorPreguntas.obtenerPregunta(3);
            String respuesta = JOptionPane.showInputDialog(this, pregunta.getPregunta());

            if (respuesta != null && pregunta.verificarRespuesta(respuesta)) {
                new ReproductorSonido().reproducir("src/recursos/sonidos/respuesta_correcta.wav", false);
                JOptionPane.showMessageDialog(this, "¡Tesoro encontrado! Has escapado con éxito.");
                 musica.detener();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                new FinJuegoFrame().setVisible(true);
            } else {
                new ReproductorSonido().reproducir("src/recursos/sonidos/respuesta_incorrecta.wav", false);
                JOptionPane.showMessageDialog(this, "Respuesta incorrecta. Intenta otra vez.");
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
        personaje.dibujar(g);

        // Zona de prueba para el cofre (opcional)
        // g.setColor(Color.RED);
        // g.drawRect(cofre.x, cofre.y, cofre.width, cofre.height);
    }
}

