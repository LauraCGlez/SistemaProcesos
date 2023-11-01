package pinpon;

public class Main {
    public static void main(String[] args) {
        PinThread pinThread = new PinThread();
        PonThread ponThread = new PonThread();

        pinThread.start();
        ponThread.start();
    }
}