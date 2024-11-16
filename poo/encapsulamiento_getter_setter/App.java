package poo.encapsulamiento_getter_setter;

public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("pedro", "garcia", 10);
        persona1.setNombre("sara");
        persona1.setEdad(34);
        System.out.println("mi nombre es " + persona1.NombreCompleto() + " y tengo " + persona1.getEdad() + " de edad");
    }
}
