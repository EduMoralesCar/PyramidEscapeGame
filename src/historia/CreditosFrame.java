package historia;

import javax.swing.*;
import java.awt.*;

public class CreditosFrame extends JFrame {
    public CreditosFrame() {
        setTitle("Créditos del Juego");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {    
        };
        panel.setLayout(null);
        setContentPane(panel);

        JLabel titulo = new JLabel("Escape Room: Pirámide", SwingConstants.CENTER);
        titulo.setFont(new Font("Serif", Font.BOLD, 26));
        titulo.setForeground(new Color(80, 50, 20));
        titulo.setBounds(100, 60, 500, 40);
        panel.add(titulo);

        JLabel subtitulo = new JLabel("Desarrollado por:", SwingConstants.CENTER);
        subtitulo.setFont(new Font("Serif", Font.PLAIN, 18));
        subtitulo.setBounds(100, 130, 500, 30);
        panel.add(subtitulo);

        JLabel fabio = new JLabel("Fabio Cruz", SwingConstants.CENTER);
        fabio.setFont(new Font("Serif", Font.PLAIN, 20));
        fabio.setBounds(100, 170, 500, 30);
        panel.add(fabio);

        JLabel edu = new JLabel("Edu Morales", SwingConstants.CENTER);
        edu.setFont(new Font("Serif", Font.PLAIN, 20));
        edu.setBounds(100, 200, 500, 30);
        panel.add(edu);

        JButton salir = new JButton("Salir");
        salir.setBounds(280, 350, 140, 40);
        salir.setBackground(new Color(139, 69, 19));
        salir.setForeground(Color.WHITE);
        salir.setFont(new Font("Serif", Font.BOLD, 14));
        salir.addActionListener(e -> System.exit(0));
        panel.add(salir);
    }
}
