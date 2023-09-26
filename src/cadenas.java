import java.util.Random;
import java.util.Scanner;

public class cadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de cadenas a generar: ");
        int cantidadCadenas = scanner.nextInt();
        scanner.close();

        Random random = new Random();
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < cantidadCadenas; i++) {
            int longitud = random.nextInt(21); // Longitud aleatoria entre 0 y 20
            StringBuilder cadena = new StringBuilder();

            for (int j = 0; j < longitud; j++) {
                char caracter = alfabeto.charAt(random.nextInt(alfabeto.length()));
                cadena.append(caracter);
            }

            System.out.println(cadena.toString());
        }
    }
}