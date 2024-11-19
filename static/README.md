## Static

Con esta palabra reservada podemos hacer una propiedad estática, lo que significa que estará disponible en toda la aplicación sin necesidad de utilizar la palabra reservada new. Llamaremos a las propiedades estáticas a través de la clase. Esto se llama método o atributo de clase.

## Ejemplo

Si no usamos static, como en el siguiente caso, contadorAnimales no será un atributo de la clase, por lo que no se podrá acceder a esta propiedad en otras partes de la aplicación.

```java
public class Animal {
    String nombre;
    int patas;
    int edad;
    int contadorAnimales = 0;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String hacerSonido() {
        return "sonido por defecto";
    }
}

```

Para hacer una propiedad estática, simplemente ponemos static delante. Ahora contadorAnimales pasa a ser un atributo de la clase que, gracias a static, se puede acceder desde toda la aplicación.

```java
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

    // con la funcion de getCantidadAnimales ponemos estatic para que sea un metodo  de la clase y podamos haceder en cualquer parte de la aplicacion a este metodo
    public static int getCantidadAnimales() {
        return contadorAnimales;
    }
}

```

## Explicacion sencilla

Imagina que tienes varios estudiantes, y cada uno tiene su propio cuaderno para notas (como las propiedades normales de una instancia). Pero también hay un pizarrón que todos los estudiantes comparten. Ese pizarrón es como una propiedad o método estático.

Propiedad estática: Es como escribir algo en el pizarrón. Todos pueden ver y usar esa información. Por ejemplo, podrías escribir: "Número de estudiantes: 30". Esto no pertenece a un estudiante específico, sino a todos.

Método estático: Es como una regla que se escribe en el pizarrón, y cualquiera puede usarla. Por ejemplo: "Para sumar dos números, usa X + Y = Z".

## Llamada al metodo estatico

Para llamar a una propiedad o método estático, usamos la clase directamente, sin crear un objeto.

## sintaxis

```java
 Clase.metodoPropiedadEstatica()
```

## Ejemplo de llamada a una funcion estatica

```java
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

```
