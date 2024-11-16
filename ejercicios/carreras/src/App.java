import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Gestion de atletas para la carrera");

        boolean exit = false;

        while (!exit) {

            String option = JOptionPane.showInputDialog("Intruduce una de las opciones\n" +
                    "1. Agregar atleta\n" +
                    "2. Iniciar carrera para atleta\n" +
                    "3. Detener carrera y registrar tiempo \n" +
                    "4. Mostrar tiempos de todos los atletas \n" +
                    "5. Mostrar ganador \n" +
                    "6. Salir \n");

            int optionInt = Integer.parseInt(option);

            switch (optionInt) {
                case 1:
                    Atleta atleta = new Atleta();
                    String name = JOptionPane.showInputDialog("Intrucude el nombre del corredor");
                    System.out.println(atleta.getNombre());
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Wednesday");
                    break;

                case 5:
                    System.out.println("Wednesday");
                    break;

                case 6:
                    System.out.println("Saliendo del programa");
                    System.exit(optionInt);
                    break;

            }

        }
    }

}
