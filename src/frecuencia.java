import java.util.Scanner;

public class frecuencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un texto: ");
        String texto = scanner.nextLine().toLowerCase(); // Convertimos el texto a minúsculas para ser insensible a mayúsculas
        scanner.close();

        int[] frecuenciaVocales = new int[5]; // Array para almacenar la frecuencia de las 5 vocales (a, e, i, o, u)

        for (int i = 0; i < texto.length(); i++) {
            char vocal = texto.charAt(i);
            if (vocal == 'a') {
                frecuenciaVocales[0]++;
            } else if (vocal == 'e') {
                frecuenciaVocales[1]++;
            } else if (vocal == 'i') {
                frecuenciaVocales[2]++;
            } else if (vocal == 'o') {
                frecuenciaVocales[3]++;
            } else if (vocal == 'u') {
                frecuenciaVocales[4]++;
            }
        }

        for (int i = 0; i < frecuenciaVocales.length; i++) {
            System.out.print(frecuenciaVocales[i] + " ");
        }
    }
}
