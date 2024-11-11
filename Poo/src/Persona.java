public class Persona {

    String nombre;
    String apellido;
    int edad;
    String[] lenguajes;
    boolean esEstudiante;
    public Carrera carrera;

    public String NombreCompleto() {
        return nombre + " " + apellido;
    }

    public String saludar(String saludado) {
        return "hola que tal" + saludado;
    }
}
