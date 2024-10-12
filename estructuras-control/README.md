## Estructuras control

## if

En el ejemplo que veremos abajo decimos que si la edad es mayor o igual a 18 puede beber y si no nos indicara los años que le quedan a la persona
para beber en el caso de que supere los 60 años no se le permitira beber

dentro del bloque if hara lo que digamos si se cumple la condicion es este caso imprimira por consola puedes comprar alcol

si no se cumple la condicion pasara al bloque else if y imprimira por consola que es demasiado mayor para beber

> [!NOTE]
> Podemos poner tantos if else como queramos

si es menor de edad llegara al ultimo bloque else imprimira que no puede beber y tambien nos dira cuantos años le quedan para empezar a beber

el bloque else siempre se pone al final seria la ultima condicion

### Aqui esta el codigo completo

```java

  int edad = 15;

        if (edad >= 18 && edad <= 60) {
            System.out.println("puedes comprar alcol");

        } else if (edad > 60) {
            System.out.println("Eres demasiado mayor para beber");
        } else {
            System.out.println("no puedes beber te quedan " + (18 - edad) + " años");
        }

```

> [!NOTE]
> en el else que escribimos Los () indican que la operacion tiene prioridad es decir que primero se realiza la operacion de 18 - edad luego se concatenara el texto

### Ejemplo

```java
 else {
     System.out.println("no puedes beber te quedan " + (18 - edad) + " años");
        }
```

## Switch

Si tenemos muchos if else en nuestro codigo lo ideal es hacer un switch para mejorar la legibilidad del codigo. Existen métodos más avanzados para manejar múltiples condiciones, pero los veremos más adelante".

```java
  String superheroe = "pedro";

        switch (superheroe) {
            case "batman":
                System.out.println("eres batman ve a la batcueva");
                break;

            case "capitan america":
                System.out.println("capitan usa tu escudo");
                break;

            case "thor":
                System.out.println("thor levanta tu martillo");
                break;

            default:
                System.out.println("no eres un superheroe");

                break;
        }
```

> [!NOTE]
> Cuando entras en la estructura switch evaluas si un caso es igual a la variable si es igual sale gracias al break si por el contrario no coindice seguira recorriendo cada caso hasta llegar al default que es el valor por defecto si no encuentra una coincidencia.

Por ejemplo si ponemos batman entrara al primer caso y luego saldra gracias al break y no se seguira ejecutando el codigo y si pongo sara llegara a la condición por defecto default y ejecutara no eres un superheroe.

> [!WARNING]
> Cuidado al quitar los break ya que se hacemos esto el switch no se detendra.
