public class App {
    public static void main(String[] args) throws Exception {
        int number = 12;
        int resto = number % 2; // % para saber si un numero es par o inpar este operador se llama resto
        System.out.println(resto); // imprime por consola

        // Asignacion

        // opeador para asignar un valor a una variable =

        int a = 10;
        int b = a + 10;

        int c = 10;

        // queda el ultimo valor asignado a la variable aqui asignamos un nuevo valor a
        // la variable

        c = 20;

        // abreviatura de c = 20 + 15; c += 15;

        // operadores de asignacion que toman el valor de la variable y hacen resten
        // multipliquen dividen y sumen

        c += 15; // int c = 20 + 15;

        c -= 5; // int c = 35 - 5;

        c *= 3; // int c = 30 * 3;

        c /= 10; // int c = 90 / 10;

        c++; // int c = 9 + 1;
        c--; // int c = 10 - 1;

        // resultado 20

        // System.out.println(b);

        // resultado 9

        // System.out.println(c);

        // operadores de Comparacion
        int d = 3;
        int e = 4;

        boolean esMayor = d > e;

        boolean esMenor = d < 4;

        // opperador para saber si una variable es igual a otra ==

        // comprueba si son iguales

        boolean compare = d == e;

        // System.out.println(esMayor);
        // System.out.println(esMenor);
        // System.out.println(compare);

        // operadores de condicion

        boolean condicion1 = true;
        boolean condicion2 = false;

        boolean opeadorAnd = condicion1 && condicion2; // los 2 deben de ser verdaderos para que sea true en cualquier
                                                       // otro caso sera false

        boolean opeadorNot = !condicion1; // invierte el resultado asignado a la variable en este caso seria false

        boolean opeadorOr = condicion1 || condicion2; // al menos uno de los 2 debe de ser verdadero para que salga true

        System.out.println(opeadorAnd);
        System.out.println(opeadorNot);
        System.out.println(opeadorOr);

    }
}
