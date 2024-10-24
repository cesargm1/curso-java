import javax.swing.JOptionPane;

public class Clase {
  Estudiante[] estudiantes;
  int numEstudiantes;
  double promedio;

  public void obtenerDatos() {
    String numEstudiantes = JOptionPane.showInputDialog("Introduce tus alumnos");
    this.numEstudiantes = Integer.parseInt(numEstudiantes);

    this.estudiantes = new Estudiante[this.numEstudiantes];

    for (int i = 0; i < this.numEstudiantes; i++) {
      Estudiante estudiante = new Estudiante();
      estudiante.obtenerDato();
      this.estudiantes[i] = estudiante;
    }
  }

  public void promedioNota() {
    double promedio = 0;

    for (Estudiante estudiante : this.estudiantes) {
      promedio += estudiante.notaFinal / this.numEstudiantes;
    }
    System.out.println("el promedio de la nota es " + promedio);
  }

  public void mostrarInformacion() {
    for (Estudiante estudiante : estudiantes) {
      estudiante.mostrarInformacion();
    }
  }
}
