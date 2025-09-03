public class ImprimeNumeros implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Número: " + i);
                Thread.sleep(500); // Pausa para simular processamento
            }
        } catch (InterruptedException e) {
            System.out.println("A thread de números foi interrompida.");
        }
    }
}