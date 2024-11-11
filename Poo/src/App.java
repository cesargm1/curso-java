public class App {

    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Alvarez";
        persona1.edad = 28;

        Carrera carrera1 = new Carrera();
        carrera1.nombre = "ciencias";
        carrera1.duracion = 10;
        carrera1.estaCursando = false;

        persona1.carrera = carrera1;

        Persona persona2 = new Persona();

        persona2.nombre = "Sara";
        persona2.apellido = "Gomez";
        persona2.edad = 24;

        Carrera carrera2 = new Carrera();
        carrera2.nombre = "programacion";
        carrera2.duracion = 20;
        carrera2.estaCursando = true;

        persona2.carrera = carrera2;

        System.out.println(
                "hola soy " + persona1.NombreCompleto() + " y tengo " + persona1.edad + " años " + "estoy cursando "
                        + persona1.carrera.nombre);

        System.out.println(
                "hola soy " + persona2.NombreCompleto() + " y tengo " + persona2.edad + " años " + "estoy cursando "
                        + persona2.carrera.nombre);
        System.out.println(persona2.saludar(" cristo"));

    }
}
