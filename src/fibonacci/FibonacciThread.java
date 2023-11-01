package fibonacci;
public class FibonacciThread extends Thread {
    private final int n;

    public FibonacciThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int a = 1, b = 1;
        System.out.println(a); // Imprime el primer número de la secuencia
        for (int i = 2; i < n; i++) {
            System.out.println(b); // Imprime el número actual de la secuencia
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        int N = 10; // Cambia N al valor deseado
        Thread fibThread = new FibonacciThread(N);
        fibThread.start();
    }
}