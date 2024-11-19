public class Animal {
    String nombre;
    int patas;
    int edad;
    static int contadorAnimales = 0;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorAnimales++;
    }

    public String hacerSonido() {
        return "sonido por defecto";
    }

    public static int getCantidadAnimales() {
        return contadorAnimales;
    }
}
