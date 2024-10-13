# Arrays

## Que son?

Los arrays son estructuras que tienen valores del mismo tipo por ejemplo un String y tienen un nombre asociado gracias a los arrays podemos guardar muchos valores del mismo tipo.

> [!IMPORTANT]
> Podemos acceder a los elementos de un array gracias a los indices estos valores se almacenan en la memoria secuencialmente es decir uno detras de otro hay que aclarar que los indices enpiezan por 0 y no por 1. Los indices no los usan solo los arrays si no tambien se utilizan en todas las variables objetos ect para saber la posicion de un elemnto.

### Declarar arrays

Vamos a crear un array de numeros sencillo para ver la sintaxis de creacion del array.

```java
int[] numeros = new int[5];
```

**pasos**

1. tipo de dato int
2. indicamos que es un array con []
3. creamos un array de enteros con **new int**
4. [5] indica el numero de elementos del array

```java
// esto da un error de posicion lo explicamos abajo
int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[5] = 4;
        System.out.println(numeros);
```

> [!CAUTION]
> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5 at App.main(App.java:9)

Este error nos dice que no podemos acceder al indice 5 pero si nuestro array es de 5 elementos porque pasa esto?

Esto pasa debido a que los arrays como mencionamos antes empiezan desde el 0 si es un array de 5 elemntos el alcance del array sera del 0 al 4 dando como resultado que no podamos asignar valores a este array del 5 para alante.

```java
  int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[4] = 4;
        System.out.println(numeros);
```

> ![CAUTION]
> Cuidado si lo ejecutamos nos dira la posicion de memoria de el array.

```console
[I@d716361
esta es la posicion de memoria donde se almacena el array
```

**Entonces como puedo acceder a los elementos del array ?**

Para acceder a los elementos del array debemos acceder a cada uno de sus indices individualmente de esta manera vermos una forma mas eficiente de acceder a cada elemento mediante un bucle for mas tarde.

```java
int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[4] = 4;

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);

```

**Salida por consola**

```console
1
2
3
0
4
```

> ![IMPORTANT]
> como podemos observar en la salida por consola si dejamos una posicion vacia en el array son devolvera 0

Podemos saber cuantos elementos hay en un array gracias al metodo length()

### Ejemplo

```java
int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[4] = 4;

        System.out.println(numeros.length);
```

Recordemos que accediamos a cada posicion del array de esta manera

```java
int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[4] = 4;

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
```

Pero hacerlo esta forma escribimos mucho codigo podemos automatizarlo con un bucle for y el metodo length() para que recorra todo el array.

Veamos un ejemplo explicandolo paso por paso.

```java
  int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[4] = 4;

        for (int index = 0; index < numeros.length; index++) {
            System.out.println(numeros[index]);
        }
```

**Pasos**

1. Declaramos un array de enteros llamado numeros de 5 elementos.

2. indicaremos a cada posicion del array su valor numeros[0] = 1 numeros[1] = 2 recordemos que cada una de sus posiciones.es un indice.

3. creamos un bucle for con una variable int llamada index almacenara el indice de cada numero en el array de numeros.

4. Utilizamos el metodo length y el bucle se preguntara index es mayor a la longitud del array.

5. Como no lo es se incrementara en 1 gracias a index++ esto sucedera hasta que no haya mas posiciones en el array.

6. Por ultimo imprimimos la variable numeros que es el array completo y hacedemos a todas sus posiciones gracias a la variable index que almacenaba cada posicion en el array con un numero asociado.

> [WARNING]
> Primero accedemos a la variable que almacena el array y luego a su indice de esta manera si no hacemos esto no funcionara

```java
 System.out.println(numeros[index]);
```

Tambien podemos recorrer arrays sin usar la palabra New ni los indices

```java
   int[] numeros = { 10, 20, 30, 40, 50 };

        numeros[2] = 70; // ahora la posicion 2 del array sera 70 en vez de 30

        for (int index = 0; index < numeros.length; index++) {
            System.out.println(numeros[index]);
        }
```

> ![Note]
> Los indices de este array seran
> indice 0 valor 10
> indice 1 valor 20
> indice 2 valor 70
> indice 3 valor 40
> indice 4 valor 50

**Obtenderemos el siguente resultado por consola.**

```console
10
20
70
40
50
```

## Foreach

Tambien podemos recorrer un array con foreach que es muy bueno para recorrer estructuras como arrays.

la palanra reservada Foreach no existe en java asi que seguimos usando la palabra reservada for pero es un foreach ya que recorre cada uno de los elementos del array de forma diferente.

### Sintaxis

```java
 for (int numero : numeros) {
      System.out.println(numero)
 };
```

Lo que hara el foreach sera

1. declaramos el foreach nos inventamos una variable int con el nombre que queremos en este caso numero sera la variable a recorrer que cogera cada uno de los numeros del array.

2. : Cogemos todo el array con la variable numeros

3. por ultimo imprimimos cada uno de los numeros con la variable numero que al final del bucle habra pasado por cada uno de los numeros del array.

Lo malo del foreach es que no tiene un indice para saber la posicion de cada elemento pero podemos agregarlo de esta manera.

```java

int[] numeros = { 10, 20, 30, 40, 50 };

numeros[2] = 70;

 int index = 0;

        for (int numero : numeros) {
            System.out.println(numero + " indice " + index);
            index++;
        }

```

Lo unico que hemos hecho es definir una variable index que contendra cada una de las posiciones del array hacemos un system para que se vea bonito y incrementomos el valor
de index con index++ para que vaya acorde con el mumero.

Ya sabemos como manipular arrays es muy importante si tenemos muchos tipos de datos iguales y queremos recorrerlos ya sea con for o forEach
