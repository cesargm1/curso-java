import java.util.Scanner;

public class SelectProducts {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String[] productos = new String[5];
        double[] precio = new double[5];

        int counter = 0;

        System.out.println("1. Añadir producto");
        System.out.println("2. Buscar producto");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Mostrar inventario completo");
        System.out.println("5. Mostrar producto mas caro");
        System.out.println("6. salir");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            if (counter < productos.length && counter < precio.length) {

                System.out.println(" introduce el nombre del producto: ");
                String nombreProducto = scanner.next();
                System.out.println(" Introduce el precio del producto");
                double precioProducto = scanner.nextDouble();
                productos[counter] = nombreProducto;
                precio[counter] = precioProducto;
                counter++;

            } else {
                System.out.println("inventario lleno");
            }

        }

        if (opcion == 3) {

        }

        if (opcion == 4) {
            if (counter < productos.length && counter < precio.length) {
                int index = counter;
                for (String producto : productos) {
                    System.out.println(producto + " " + index);
                    index++;
                }
            }
        }

        if (opcion == 6) {
            System.out.println("salida del inventario");
            scanner.close();
        }
    }

}
