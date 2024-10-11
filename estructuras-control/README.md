## Estructuras control

## if

En el ejemplo que veremos abajo decimos que si la edad es mayor o igual a 18 puede beber y si no nos indicara los años que le quedan a la persona
para beber en el caso de que supere los 60 años no se le permitira beber

dentro del bloque if hara lo que digamos si se cumple la condicion es este caso imprimira por consola puedes comprar alcol

si no se cumple la condicion pasara al bloque else if y imprimira por consola que es demasiado mayor para beber

```md
> [!NOTE]

> Podemos poner tantos else if como queramos
```

si es menor de edad llegara al ultimo bloque else imprimira que no puede beber y tambien nos dira cuantos años le quedan para empezar a beber

el bloque else siempre se pone al final seria la ultima condicion

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
