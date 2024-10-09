# Strings

La clase String nos permite generar texto este texto va entre comillas"" como es una clase tiene sus propios métodos con estos podemos modificar el String original por ejemplo lo podemos transformar en mayúscula las clases siempre empiezan por mayúscula los métodos son funciones hechas por otras personas que podemos usar

## Definir una variable String en Java

```java
    String texto = "texto de ejemplo";
```

Podemos imprimir esta variable de este modo

```java
   System.out.println(texto);
```

### Métodos

> [!IMPORTANT]

> para acceder a los metodos en java usamos un .

### Método length()

Tenemos un método en los String para sacar la longitud del mismo que se llama length

En el código de abajo se muestra cómo imprimir el string por consola y sacar su longitud gracias al método length

```java
 String texto = "texto de ejemplo";

 System.out.println(texto);
int longitud = texto.length();

 System.out.println(longitud);
```

## Metodos para tranformar un string a minisculas y mayusculas

```java

// trasforma el texto a mayuscula

        String uperCase = texto.toUpperCase();
        System.out.println(uperCase);

        // transforma el texto a miniscula

        String lowerCase = texto.toLowerCase();
        System.out.println(lowerCase);
```

### Método char()

Selecciona un único carácter a partir de un índice

> [!IMPORTANT]

> Los indices empiezan desde la posicion 0 todo en java tiene un indice

```java
    String texto = "texto de ejemplo";
    char character = texto.charAt(0);
    System.out.println(character);
```

En este ejemplo nos imprime la primera letra

Por ejemplo, la posición 2 de esta cadena será la letra x, ya que los índices empiezan a contar desde 0

### Método substring()

Si queremos partir una cadena y quedarnos con una parte, usaremos el método substring()

#### Sintaxis

```java
    String subString = texto.substring(inicio, fin);
```

**Longitud:** hasta donde cortamos

**Character** con qué parte del String nos quedamos

#### Ejemplo

```java
  String texto = "texto de ejemplo";
  String subString = texto.substring(9, 16);
  System.out.println(subString);
```

este ejemplo cortará la cadena y nos devolverá el texto ejemplo

### Método replace()

```java
  String texto = "texto de ejemplo";
  String remplazo = texto.replace("texto", "titulo");
     System.out.println(remplazo);
```

> [!IMPORTANT]

> para concatenar una variable o un texto usamos el perador +

Ahora veremos un ejemplo con el siguiente método

### Método contains()

Comprueba si un String contiene o no una palabra, un párrafo o una letra que le indiquemos, devuelve un booleano false si no coincide y true si coincide

```java

   Boolean contain = texto.contains("ejemplo");
   Boolean noContain = texto.contains("nombre");
  System.out.println("tiene esa palabra? " + contain);
  System.out.println("tiene esta palabra " + noContain);

```

Como podemos ver con un signo + podemos juntar cadenas, números, variables, cuando lo junta, lo transforma en un string

#### Método trim()

Con este método podemos quitar los espacios de una cadena de texto

```java
    // Texto con espacios

        String textoEspacios = "    Este es un texto con muchos espacios   ";
        System.out.println(textoEspacios);
        String sinEspacios = textoEspacios.trim();
        // texto sin espacios

        System.out.println(sinEspacios);
```

> [!IMPORTANT]

> Un string es de tipo inmutable significa que no se puede cambiar una vez que esta definido cuando usamos un metodo por ejemplo el método toUpperCase() se crea un nuevo objeto de tipo String evitando que el String original se modifique de esta menera se crea una copia sin afectar al original.

### conclusión

con los String podemos usar métodos, ya que el String es una clase y dentro de una clase podemos acceder a los métodos con un . estos métodos nos sirven para modificar el String original. Además, un string siempre va entre comillas dobles""
Además, un string inmutable significa que se crean copias a aprtir del objeto original sin afectar al original

Existen muchos metodos mas pero hemos visto los mas usados.
