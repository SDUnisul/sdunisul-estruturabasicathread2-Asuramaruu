public class ImprimeLetras implements Runnable {

    @Override
    public void run() {
        try {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Letra: " + c);
                Thread.sleep(500); // Pausa para simular processamento
            }
        } catch (InterruptedException e) {
            System.out.println("A thread de letras foi interrompida.");
        }
    }
}