import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al cine");
        System.out.println("Elije una pelicula que quieras ver: ");
        System.out.println("1 - Batman");
        System.out.println("2 - jumanji");
        System.out.println("3 - IT ");
        System.out.println("4 - toy story 4");

        int opcion = scanner.nextInt(); // se almacena el valor que introduce el usuario nextInt pide un numero

        switch (opcion) { // tenemos que comparar con numeros ya que la variable opcion es un int
            case 1:
                System.out.println("ve la pelicula del murcielago");
                break;

            case 2:
                System.out.println("vete a ver jumanji");
                break;

            case 3:
                System.out.println("pasalo de miedo");
                break;

            case 4:
                System.out.println("diviertete con tus jugetes");
                break;

            default:
                System.out.println("no esta en el catalogo");

                break;
        }

        if (opcion > 4) {
            System.out.println("te quedaste sin palomitas :(");
        } else {
            System.out.println("acuerdate de pedir palomitas");
        }

        scanner.close(); // cierra la escucha del usuario

    }
}
