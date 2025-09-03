public class Main {
    public static void main(String[] args) {
        
        // Cria duas instâncias do nosso "trabalho" com mensagens diferentes
        MensagemPersonalizada runnable1 = new MensagemPersonalizada("Olá do Runnable 1");
        MensagemPersonalizada runnable2 = new MensagemPersonalizada("Olá do Runnable 2");
        
        // Cria e inicia as duas threads
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        
        thread1.start();
        thread2.start();
    }
}