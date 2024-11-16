public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("pedro", "garcia", 12);
        System.out.println(persona1.NombreCompleto() + " y tiene" + persona1.edad + "edad");
    }
}
