public class Main {
    public static void main(String[] args) {

        // 1. Cria as instâncias dos nossos "trabalhos" (Runnables)
        ImprimeNumeros numeros = new ImprimeNumeros();
        ImprimeLetras letras = new ImprimeLetras();

        // 2. Cria as threads
        Thread threadNumeros = new Thread(numeros);
        Thread threadLetras = new Thread(letras);

        // 3. Inicia a execução das threads
        threadNumeros.start();
        threadLetras.start();

        // 4. Aguarda a conclusão de ambas as threads
        try {
            threadNumeros.join();
            threadLetras.join();
        } catch (InterruptedException e) {
            System.out.println("A thread principal foi interrompida.");
        }

        // 5. Imprime a mensagem final após o término de todas as threads
        System.out.println("Ambas as threads terminaram. Programa finalizado.");
    }
}