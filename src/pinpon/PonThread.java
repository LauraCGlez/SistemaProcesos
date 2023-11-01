package pinpon;

public class PonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("PON");
            try {
                Thread.sleep(1000); // Espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}