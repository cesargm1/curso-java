public class Atleta {
    private String nombre;
    private int edad;
    private double tiempo;

    // getter obtener los datos de la clase

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getTiempo() {
        return this.tiempo;
    }

    // setter modificar datos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public void mostrarInfo(String nombre, int edad, double tiempo) {
        System.out.println("El nombre del atleta es " + nombre);
        System.out.println("Tiene " + edad + " años");
        System.out.println("El tiempo en la carrera es de " + tiempo);
    }
}
