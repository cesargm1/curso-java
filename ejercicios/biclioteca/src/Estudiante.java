import javax.swing.JOptionPane;

public class Estudiante {
    String nombre;
    int edad;
    double notaFinal;

    public void mostrarInformacion() {
        System.out.println("El nombre del alumno es " + this.nombre);
        System.out.println("la edad del alumno es " + this.edad);
        System.out.println("la nota final es " + this.notaFinal);
    }

    public void obtenerDato() {
        this.nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del alumno"));
        this.notaFinal = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota final"));
    }
}
