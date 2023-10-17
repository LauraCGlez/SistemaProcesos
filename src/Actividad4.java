public class Actividad4 {
    public static void main(String[] args) {
        try {
            // AQUI HE SUSTITUITO NOTAS.EXE POR GEDIT DADO QUE MI SISTEMA OPERATIVO ES LINUX, SI
            // SE VA A UTILIZAR EN WINDOWS NO ES NECESARIO HACER EL CAMBIO
            Process notepadProcess = Runtime.getRuntime().exec("gedit");

            // Verificar si el proceso está en ejecución
            if (notepadProcess.isAlive()) {
                System.out.println("Bloc de notas está en ejecución.");
            } else {
                System.out.println("Bloc de notas no está en ejecución.");
            }

            Thread.sleep(5000);

            // Verificar nuevamente si el proceso está en ejecución después de la pausa
            if (notepadProcess.isAlive()) {
                System.out.println("Bloc de notas todavía está en ejecución.");
            } else {
                System.out.println("Bloc de notas no está en ejecución después de la pausa.");
            }

            notepadProcess.destroy();

            // Verificar nuevamente si el proceso está en ejecución después de cerrarlo
            if (notepadProcess.isAlive()) {
                System.out.println("Bloc de notas todavía está en ejecución después de cerrarlo.");
            } else {
                System.out.println("Bloc de notas se ha cerrado correctamente.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
