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

## Bucle For

Esta es la estructura del for esta es su sintaxis.

```java

for(inicializacion;condicion;incremento variable){
    aqui va el codigo que se ejecutara
}
```

### Ejemplo

```java
 for (int i = 0; i <= 50; i++) {
            System.out.println("numero: " + i);
        }
```

## For anidado

> ![IMPORTANT]
> En el for anidado entra al bucle exterior hace una iteracion luego pasa al bucle interior y hace todas las iteraciones esto sucerera hasta que se acaben las iteraciones del buble exterior

```java
   int i;
   int j;

        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                System.out.print("i: ");
                System.out.print(i);
                System.out.print("j: ");
                System.out.println(j);
            }
        }
```

### Salida por consola

```console
i: 1j: 1
i: 1j: 2
i: 1j: 3
i: 1j: 4
i: 2j: 1
i: 2j: 2
i: 2j: 3
i: 2j: 4
i: 3j: 1
i: 3j: 2
i: 3j: 3
i: 3j: 4
i: 4j: 1
i: 4j: 2
i: 4j: 3
i: 4j: 4
```

## Bucle while

Es muy similar al bucle for

Esta es su sintaxis

```java

 int contador = 0; // incializa la variable


    while (contador <= 20)  { //condicion

            System.out.println(contador); // dentro de las llaves el codigo que ejecutara

            contador++; // incremento

        }

```

> [!CAUTION]
> Cuidado con no declarar el incremento en el while si no lo hacemos se producira un bucle infinito esto significa que la variable no se actualizara y siempre tendra el mismo valor dando como resultado un bucle infinito esto tambien se aplica al do while.

Aqui dejo un ejemplo mal hecho de un while infinito ya que nunca sale del bucle.

```java

  int contador = 0;

        while (contador <= 20) {

            System.out.println(contador);
        }

```

Aun falta documentar
