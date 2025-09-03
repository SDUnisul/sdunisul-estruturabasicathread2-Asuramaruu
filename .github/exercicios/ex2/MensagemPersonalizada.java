public class MensagemPersonalizada implements Runnable {
    
    private String mensagem;

    // Construtor que recebe a mensagem
    public MensagemPersonalizada(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(this.mensagem + " - Repetição " + i);
                Thread.sleep(700); // Pausa de 700 milissegundos
            }
        } catch (InterruptedException e) {
            System.out.println("A thread foi interrompida.");
        }
    }
}