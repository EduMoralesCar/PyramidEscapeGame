package escapeRoomPiramide;

import historia.HistoriaFrame;

import javax.swing.*;
import java.awt.*;

public class MenuInicioFrame extends JFrame {
    public MenuInicioFrame() {
        setTitle("Escape Room: Pirámide");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(249, 241, 228)); // Fondo tipo pergamino

        // Imagen del logo ajustada al tamaño de la ventana
        ImageIcon logoOriginal = new ImageIcon("src/recursos/imagenes/logo.png"); // Usa tu imagen
        Image imagenEscalada = logoOriginal.getImage().getScaledInstance(500, 350, Image.SCALE_SMOOTH);
        JLabel lblLogo = new JLabel(new ImageIcon(imagenEscalada));
        lblLogo.setBounds(100, 30, 500, 350); // Centrado horizontalmente
        add(lblLogo);

        // Botón "JUGAR"
        JButton btnJugar = new JButton("JUGAR");
        btnJugar.setBounds(270, 400, 160, 40);
        btnJugar.setFont(new Font("Serif", Font.BOLD, 18));
        btnJugar.setBackground(new Color(139, 69, 19));
        btnJugar.setForeground(Color.WHITE);
        btnJugar.setFocusPainted(false);
        btnJugar.addActionListener(e -> {
            dispose(); // Cerramos el menú
            new HistoriaFrame().setVisible(true); // Mostramos la historia
        });
        add(btnJugar);
    }
}

