// Gato hereda comportamientos  de la clase Animal
public class Gato extends Animal {

    public Gato(String nombre, int edad) {

        // con la palabra super asignamos la informacion heredada de
        // animal a gato estas propiedades nombre y edad son unicas de la clase animal y
        // no de gato para que el gato herede las propiedades u
        // samos extends y luego super para añadir la informacion heredada
        super(nombre, edad);
    }

    // @Override sobrescribe la funcion ahora hacerSonido hace miau
    @Override
    public String hacerSonido() {
        return "Miau";
    }
}
