public class Contador implements Runnable {

    private String nome;

    public Contador(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread " + nome + ": " + i);
                Thread.sleep(500); // Pausa de 500 milissegundos
            }
        } catch (InterruptedException e) {
            System.out.println("A thread " + nome + " foi interrompida.");
        }
    }
}