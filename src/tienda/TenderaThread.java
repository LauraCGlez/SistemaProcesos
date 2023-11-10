package tienda;

public class TenderaThread extends Thread{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TenderaThread(String nombre) {
        this.nombre = nombre;
    }

    public void procesarCompra(Cliente cliente, long timeStamp) {
        System.out.println("La Tendera " + this.nombre + " COMIENZA A COBRAR LA COMPRA DEL CLIENTE " +
                cliente.getNombre() + " EN: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Cobrando el producto " + (i + 1) + " ->en: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

        }
        System.out.println("La Tendera " + this.nombre + " HA TERMINADO DE COBRAR " +
                cliente.getNombre() + " EN: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
    }
    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000L);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void run() {

    }
}
