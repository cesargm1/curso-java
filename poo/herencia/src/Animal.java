public class Animal {
    String nombre;
    int patas;
    int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String hacerSonido() {
        return "sonido por defecto";
    }
}