# Encapsulamiento getter setter

hasta ahora trabajamos con clases y objetos publicos ahora haremos uso de los getter y setter para pasarlo de publico a privado de esta manera nuestros objetos no se podran medificar desde fuera

Para que no nos modifiquen las propiedades de la clase pondremos private delante

veamos como queda antes y despues

**Antes**

```java
public class Persona {

     String nombre;
     String apellido;
     int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // metodos accienes
    public String NombreCompleto() {
        return nombre + " " + apellido;
    }

    public String saludar(String saludado) {
        if (edad > 40) {
            return "buenos dias" + saludado;
        }
        return "hola que tal" + saludado;
    }
}
```

**Despues**

```java
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // metodos accienes
    public String NombreCompleto() {
        return nombre + " " + apellido;
    }

    public String saludar(String saludado) {
        if (edad > 40) {
            return "buenos dias" + saludado;
        }
        return "hola que tal" + saludado;
    }
}
```

Ahora vamos al main

```java
public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("pedro", "garcia", 10);
        System.out.println("mi nombre es " + persona1.NombreCompleto() + " y tengo " + persona1.edad + " de edad");
    }
}

```

Nos saldra un error de que no se puede ver la propiedad

> [!CAUTION]
> The field persona is not visible

Para solicianorlo usamos los getter aqui un ejemplo de getter

> [Note]
> sintaxis

```java
public tipoDato funcionGetter() {
    return // valor de retorno
}
```

```java
 public String getNombre() {
        return this.nombre;
    }
```

Con el getter lo unico que hacemos es obtener el valor de la propiedad de la clase

Ahora veamos como llamamos a getNombre en el main

```java
public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("pedro", "garcia", 10);
        System.out.println("mi nombre es " + persona1.getNombre() + " y tengo " + persona1.edad + " de edad");
    }
}
```

Para cambiar el valor usamos el setter

Ejemplo

```java
 public void setNombre(String nombre) {
        this.nombre = nombre;
    }
```

this.nombre es de la clase y nombre es lo que nos pasan por parametro en la funcion Tenemos que pasarle el tipo de dato
para que se pueda diferenciar el atributo de la clase y el parametro del getter si no hacemos esto se piensa que son iguales

> [!IMPORTANT]
> Los getter obtener en ingles siempre devuelven un tipo en cambio los setter modificar en ingles devuelen vacio

## Ejemplo completo

### Clase Main

```java
public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("pedro", "garcia", 10);
        // cambiamos el nombre con los setter
        persona1.setNombre("sara");
        persona1.setEdad(34);
        // obtenemos la edad con getEdad
        System.out.println("mi nombre es " + persona1.NombreCompleto() + " y tengo " + persona1.getEdad() + " de edad");
    }
}

```

### Clase Persona

```java
package poo.encapsulamiento_getter_setter;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // metodos accienes
    public String NombreCompleto() {
        return getNombre() + " " + getApellido();
    }

    public String saludar(String saludado) {
        if (edad > 40) {
            return "buenos dias" + saludado;
        }
        return "hola que tal" + saludado;
    }

    // Getter

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getApellido() {
        return this.apellido;
    }

    // Setter

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellido) {
        this.apellido = apellido;
    }
}

```
