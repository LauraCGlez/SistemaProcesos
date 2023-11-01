package pinpon;

public class PinThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("PIN");
            try {
                Thread.sleep(1000); // Espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




