package contadorVocales;

public class ContadorDeVocales {

    private static final String texto = "Este es un ejemplo de texto que contiene vocales";

    private static int contadorVocalA = 0;
    private static int contadorVocalE = 0;
    private static int contadorVocalI = 0;
    private static int contadorVocalO = 0;
    private static int contadorVocalU = 0;

    public static void main(String[] args) {
        Thread hiloA = new Thread(() -> contarVocal('A'));
        Thread hiloE = new Thread(() -> contarVocal('E'));
        Thread hiloI = new Thread(() -> contarVocal('I'));
        Thread hiloO = new Thread(() -> contarVocal('O'));
        Thread hiloU = new Thread(() -> contarVocal('U'));

        hiloA.start();
        hiloE.start();
        hiloI.start();
        hiloO.start();
        hiloU.start();

        try {
            hiloA.join();
            hiloE.join();
            hiloI.join();
            hiloO.join();
            hiloU.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int cuentaTotalDeVocales = contadorVocalA + contadorVocalE + contadorVocalI + contadorVocalO + contadorVocalU;

        System.out.println("Contador de vocal 'A': " + contadorVocalA);
        System.out.println("Contador de vocal 'E': " + contadorVocalE);
        System.out.println("Contador de vocal 'I': " + contadorVocalI);
        System.out.println("Contador de vocal 'O': " + contadorVocalO);
        System.out.println("Contador de vocal 'U': " + contadorVocalU);
        System.out.println("Cuenta total de vocales: " + cuentaTotalDeVocales);
    }

    private static void contarVocal(char vocal) {
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.toUpperCase(c) == vocal) {
                switch (vocal) {
                    case 'A':
                        contadorVocalA++;
                        break;
                    case 'E':
                        contadorVocalE++;
                        break;
                    case 'I':
                        contadorVocalI++;
                        break;
                    case 'O':
                        contadorVocalO++;
                        break;
                    case 'U':
                        contadorVocalU++;
                        break;
                }
            }
        }
    }
}
