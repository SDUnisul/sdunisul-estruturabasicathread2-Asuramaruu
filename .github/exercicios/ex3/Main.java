public class Main {
    public static void main(String[] args) {
        
        // 1. Cria as instâncias de Corredor
        Corredor corredor1 = new Corredor("Bolt");
        Corredor corredor2 = new Corredor("Flash");
        Corredor corredor3 = new Corredor("Sonic");
        
        // 2. Cria as threads com os corredores
        Thread thread1 = new Thread(corredor1);
        Thread thread2 = new Thread(corredor2);
        Thread thread3 = new Thread(corredor3);
        
        // 3. Inicia a corrida (inicia a execução das threads)
        thread1.start();
        thread2.start();
        thread3.start();
        
        // 4. Aguarda a conclusão de todas as threads
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("A thread principal foi interrompida.");
        }
        
        // 5. Imprime a mensagem final
        System.out.println("Corrida finalizada!");
    }
}