import java.util.Scanner;

public class Aorcado {
    public static void main(String[] args) throws Exception {

        // definimos la clase escaner para que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        String plalabraSecreta = "sabio";

        int intentosMaximos = 5;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // almacena la cantidad de letras de la palabra adivinada

        char[] letrasAdivinadas = new char[plalabraSecreta.length()];

        // los guiones que tendra la variable de palabra secreta i es cada una de las
        // letras

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // seguir intentando hasta que adivine la palabra

        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println(
                    "Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + plalabraSecreta.length()
                            + " letras)");
            System.out.println("Introduce una letra");

            // usamos el escaner para pedir una letra al usuario cuando el usuario escriba
            // esperamos solo una letra esto
            // se consigue con .charAt(0);

            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < plalabraSecreta.length(); i++) {

                // estructura condicional

                if (plalabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            // numero de intentos

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto te quedan:" + (intentosMaximos - intentos) + " " + "intentos");
            }

            // comprueba si la letras adivinadas son igual a la palabra secreta

            if (String.valueOf(letrasAdivinadas).equals(plalabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades adivinaste la palabra: " + plalabraSecreta);
            }
        }

        if (!palabraAdivinada) {
            System.out.println("Te quedaste sin intentos");
        }

        // para que deje de escuchar al teclado

        scanner.close();

    }
}
