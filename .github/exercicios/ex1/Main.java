public class Main {
    public static void main(String[] args) {
        
        // Cria duas instâncias do nosso "trabalho" (Runnable)
        Contador contador1 = new Contador("1");
        Contador contador2 = new Contador("2");

        // Cria e inicia as duas threads
        Thread thread1 = new Thread(contador1);
        Thread thread2 = new Thread(contador2);

        thread1.start();
        thread2.start();
    }
}