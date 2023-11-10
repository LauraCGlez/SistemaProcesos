package tienda;

public class MainThread {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Pedro", new int[] { 1, 3, 5, 1, 1 });
        TenderaThread tenderaThread1 = new TenderaThread("Charo");
        TenderaThread tenderaThread2 = new TenderaThread("Patricia");
        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
        tenderaThread1.procesarCompra(cliente1, initialTime);
        tenderaThread2.procesarCompra(cliente2, initialTime);

    }
}
