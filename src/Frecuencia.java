import java.util.Scanner;

public class Frecuencia {
    public static String contarFrecuenciaVocales(String texto) {
        int[] frecuenciaVocales = new int[5];

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

        // Formatear el resultado como una cadena
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frecuenciaVocales.length; i++) {
            resultado.append(frecuenciaVocales[i]);
            if (i < frecuenciaVocales.length - 1) {
                resultado.append(" ");
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un texto: ");
        String texto = scanner.nextLine().toLowerCase();

        String frecuenciaVocales = contarFrecuenciaVocales(texto);

        System.out.println("Frecuencia de vocales: " + frecuenciaVocales);
    }
}

