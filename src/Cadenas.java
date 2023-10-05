import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de cadenas a generar: ");
        int cantidadCadenas = scanner.nextInt();
        Random random = new Random();
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";

        try {
            FileWriter fileWriter = new FileWriter("resultados.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int i = 0; i < cantidadCadenas; i++) {
                int longitud = random.nextInt(21); // de 0 a 20
                StringBuilder cadena = new StringBuilder();

                for (int j = 0; j < longitud; j++) {
                    char caracter = alfabeto.charAt(random.nextInt(alfabeto.length()));
                    cadena.append(caracter);
                }

                System.out.println(cadena.toString());

                // Llamar a la aplicación "frecuencia" y guardar el resultado en el archivo
                String resultadoFrecuencia = Frecuencia.contarFrecuenciaVocales(cadena.toString());
                printWriter.println("Cadena: " + cadena.toString());
                printWriter.println("Frecuencia de vocales: " + resultadoFrecuencia);
            }

            printWriter.close();
            fileWriter.close();
            System.out.println("Resultados guardados en 'resultados.txt'");

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
