public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("dragon", 1000);
        Gato gato = new Gato("iris", 3);
        Perro perro = new Perro("ufus", 4);

        System.out.println("El animal llamado " + animal.nombre + "hace " + animal.hacerSonido());
        System.out.println("El animal llamado " + animal.nombre + "hace " + gato.hacerSonido());
        System.out.println("El animal llamado " + animal.nombre + "hace " + perro.hacerSonido());
        System.out.println("El contador de animales es de " + Animal.getCantidadAnimales());

    }
}
