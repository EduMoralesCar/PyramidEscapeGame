package niveles;

import logica.Personaje;

import utilidades.ReproductorSonido;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Nivel1InteractivoPanel extends JPanel {
    private final Personaje personaje;
    private final Rectangle puerta;
    private final Image fondo;
    private ReproductorSonido musica;
    

    public Nivel1InteractivoPanel() {
        setFocusable(true);
        requestFocusInWindow();

        // Personaje aparece al inicio del mapa
        personaje = new Personaje(50, 300);

        // Cargar imagen de fondo
        fondo = new ImageIcon("src/recursos/imagenes/nivel1_fondo.png").getImage();

        // Ajustar la ubicación de la puerta según el fondo
        puerta = new Rectangle(290, 260, 50, 70); // Ajusta según tu imagen real
        
        musica = new ReproductorSonido();
musica.reproducir("src/recursos/sonidos/musica_nivel1.wav", true); // En bucle


        // Movimiento con WASD
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
    if (personaje.getBounds().intersects(puerta)) {
        String respuesta = JOptionPane.showInputDialog(this,
                "¿Cuál es la pirámide más alta de Egipto?", "Pregunta", JOptionPane.QUESTION_MESSAGE);
        if (respuesta != null && respuesta.trim().equalsIgnoreCase("Keops")) {
            new ReproductorSonido().reproducir("src/recursos/sonidos/respuesta_correcta.wav", false);
            JOptionPane.showMessageDialog(this, "¡Correcto! Avanzas al siguiente nivel.");
            musica.detener();
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.dispose();
            new Nivel2Frame().setVisible(true);
        } else {
            new ReproductorSonido().reproducir("src/recursos/sonidos/respuesta_incorrecta.wav", false);
            JOptionPane.showMessageDialog(this, "Respuesta incorrecta. Intenta otra vez.");
        }
    }
}


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar fondo completo
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);

        // Dibujar personaje
        personaje.dibujar(g);

        // Para depurar la puerta, puedes mostrarla así (comenta esto para el juego final)
        // g.setColor(Color.RED);
        // g.drawRect(puerta.x, puerta.y, puerta.width, puerta.height);
    }
}
