package utilidades;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class ReproductorSonido {
    private Clip clip;

    public void reproducir(String rutaSonido, boolean enBucle) {
        try {
            File archivo = new File(rutaSonido);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(archivo);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            if (enBucle) {
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } else {
                clip.start();
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.err.println("Error al reproducir sonido: " + e.getMessage());
        }
    }

    public void detener() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }
}