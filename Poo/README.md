# poo

    main metodo principal donde se haran todas las acciones

## Crear clases

Tenemos que crear un fichero java por cada clase es decir que cada clase tendra su fichero unico separados los nombres de clase empiezan por mayuscula

esto es un ejemplo de una clase persona en nuestro fichero Persona.java

> ![IMPORTANT]
> La clase persona es una plantilla para crear nuevas personas.

```java
public class Persona {

    String nombre;
    String apellido;
    int edad;
    String[] lenguajes;
    boolean esEstudiante;
}
```

estos son atributos ya que definen el estado de la clase o objeto en este caso seria la clase persona ya que es una plantilla para crear nuevos objetos persona

## Llamando a la clase persona desde la clase principal App dentro del Main

Asi definimos a una persona

```java
public class App {

    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
    }
}
```

**pasos**

1. Llamamos a la clase Persona
2. Definimos a una unica persona con persona1 que sera un objeto de la clase Persona
3. creamos ese nuevo objeto persona con new Persona();

Pero esta persona esta vacia vamos a añadirle atributos por ejemplo su nombre edad ect

> ![NOTE]
> Los atributos son caracteristicas o estados de la clase obiamente tambien se aplica a objetos

```java
public class App {

    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Alvarez";
        persona1.edad = 28;

        System.out.println(
                "hola soy " + persona1.nombre + " " + persona1.apellido + " y tengo " + persona1.edad + " años");
    }
}
```

> ![NOTE]
> Como podemos ver acedemos a el objeto persona1 y luego a sus atributos o propiedades gracias al . veamos la sintaxis

## Sintaxis

objeto.propiedad

> ![IMPORTANT]
> Para crear una persona nueva siempre usaremos la palabra reservada **new nombreClase()**;

> [IMPORTANT]
> Las aciones que realiza la clase o el objeto se llaman metodos

Veamos un metodo de clase

```java
public class Persona {

    String nombre;
    String apellido;
    int edad;
    String[] lenguajes;
    boolean esEstudiante;

    public String NombreCompleto() {
        return nombre + " " + apellido;
    }

    public String saludar(String saludado) {
        return "hola que tal" + saludado;
    }
}

```

```java
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

```
