public class App {

    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Alvarez";
        persona1.edad = 28;

        Persona persona2 = new Persona();

        persona2.nombre = "Sara";
        persona2.apellido = "Gomez";
        persona2.edad = 24;

        System.out.println(
                "hola soy " + persona1.NombreCompleto() + " y tengo " + persona1.edad + " años");

        System.out.println(
                "hola soy " + persona2.NombreCompleto() + " y tengo " + persona2.edad + " años");
        System.out.println(persona2.saludar(" cristo"));

    }
}
