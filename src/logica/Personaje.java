package logica;

import javax.swing.*;
import java.awt.*;

public class Personaje {
    private int x, y;
    private final int ancho = 60;
    private final int alto = 70;
    private final Image imagen;

    public Personaje(int x, int y) {
        this.x = x;
        this.y = y;
        // Escalar la imagen al nuevo tamaño
        ImageIcon icono = new ImageIcon("src/recursos/imagenes/personaje.png");
        imagen = icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
    }

    public void mover(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void dibujar(Graphics g) {
        g.drawImage(imagen, x, y, null);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, ancho, alto);
    }
}

