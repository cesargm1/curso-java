public class App {
    public static void main(String[] args) throws Exception {
        // int edad = 15;

        // if else

        // if (edad >= 18 && edad <= 60) {
        // System.out.println("puedes comprar alcol");

        // } else if (edad > 60) {
        // System.out.println("Eres demasiado mayor para beber");
        // } else {
        // System.out.println("no puedes beber te quedan " + (18 - edad) + " años");
        // }

        // String superheroe = "pedro";

        // switch (superheroe) {
        // case "batman":
        // System.out.println("eres batman ve a la batcueva");
        // break;

        // case "capitan america":
        // System.out.println("capitan usa tu escudo");
        // break;

        // case "thor":
        // System.out.println("thor levanta tu martillo");
        // break;

        // default:
        // System.out.println("no eres un superheroe");

        // break;
        // }

        // for

        // int i;
        // int j;

        // for (i = 1; i <= 4; i++) {
        // for (j = 1; j <= 4; j++) {
        // System.out.print("i: ");
        // System.out.print(i);
        // System.out.print("j: ");
        // System.out.println(j);
        // }
        // }

        // while

        // int contador = 0;

        // while (contador <= 20) {

        // System.out.println(contador);

        // contador++;

        // }

        // do While

        // int contador = 0; // Inicialización de la variable

        // do {
        // System.out.println("Esto pasa antes que la condición");
        // System.out.println(contador);

        // // Actualización de la variable

        // contador++;
        // } while (contador <= 20); // Condición del bucle

        // Break return continue

        int contador = 0;

        for (int i = 0; contador <= 10; i++) {
            System.out.println(i);

            if (i == 5) {
                // break; // sirve para cortar el bucle y salir
                // continue; // se saltara las iteracies del escope que sean iguales a 5
                return; // lo mismo que el break pero con el return podemos devolver valores como
                        // funciones
            }

            System.out.println(i);
        }

    }
}
