public class Corredor implements Runnable {
    private String nome;

    public Corredor(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            for (int i = 10; i <= 100; i += 10) {
                System.out.println("Corredor " + nome + ": " + i + " metros");
                Thread.sleep(400); // Pausa para simular o tempo de corrida
            }
            System.out.println("Corredor " + nome + " chegou ao fim!");
        } catch (InterruptedException e) {
            System.out.println("A corrida do " + nome + " foi interrompida.");
        }
    }
}