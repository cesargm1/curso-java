import java.util.Scanner;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        // creamos el objeto sccanner
        Scanner scanner = new Scanner(System.in);

        // creamos las opciones
        System.out.println("menu");
        System.out.println("-----");
        System.out.println("1. crear nuevo coche");
        System.out.println("2 crear nueva moto");
        System.out.println("3. Mostrar info");
        System.out.println("4. salir");

        // mientras la opcion sea verdarera entrara en el bucle

        while (true) {
            // mostramos un dialogo para intrucucir una opcion
            String option = JOptionPane.showInputDialog("introduce una opcion");
            // transformamos ese string a int para poder trabajar con el en el if
            Integer optionNum = Integer.parseInt(option);
            // guardara lo que escriba el usuario con la clase Scanner.nextLine

            // Scanner.nextLine guarda texto
            scanner.nextLine();

            if (optionNum == 1) {
                // si la opcion es 1 crea un nuevo objeto coche de la clase Moto
                Coche coche = new Coche(option, option, 0, 0);
                System.out.println("Ingrese la marca del veiculo");
                coche.setMarca(scanner.nextLine());
                System.out.println("Ingrese el modelo del veiculo");
                coche.setModelo(scanner.nextLine());
                System.out.println("Ingrese cuantos años tiene tu veiculo");
                coche.setYear(scanner.nextInt());
                System.out.println("Cuantas puertas tiene tu veiculo");
                coche.setnPuertas(scanner.nextInt());
            }

            if (optionNum == 2) {
                // si la opcion es 2 crea un nuevo objeto moto de la clase Moto
                Moto moto = new Moto(option, option, 0, 0);
                System.out.println("Ingrese la marca del veiculo");
                moto.setMarca(scanner.nextLine());
                System.out.println("Ingrese el modelo del veiculo");
                moto.setModelo(scanner.nextLine());
                System.out.println("Ingrese cuantos años tiene tu veiculo");
                moto.setYear(scanner.nextInt());
                System.out.println("Introduce tu cilindrada");
                moto.setCilindrada(scanner.nextInt());
            }

            // opcion 3 mostrar veiculos

            if (optionNum == 3) {

            }

            if (optionNum == 4) {
                // cerramos el scanner para que no consuma memoria
                System.out.println("Saliendo del programa");
                return;
            }

            scanner.close();

        }
    }

}
