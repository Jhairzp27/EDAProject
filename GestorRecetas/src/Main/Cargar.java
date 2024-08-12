package Main;

import javax.swing.JProgressBar;

public class Cargar extends Thread {
    private JProgressBar progressBar;

    public Cargar(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(50); // Simula la carga (ajusta el tiempo según sea necesario)
                progressBar.setValue(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
