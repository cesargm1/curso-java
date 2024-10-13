public class App {
    public static void main(String[] args) throws Exception {

        int[] numeros = { 10, 20, 30, 40, 50 };

        numeros[2] = 70; // ahora la posicion 2 del array sera 70 en vez de 30

        // for

        // for (int index = 0; index < numeros.length; index++) {
        // System.out.println(numeros[index]);
        // }

        // forEach

        int index = 0;

        for (int numero : numeros) {
            System.out.println(numero + " indice " + index);
            index++;
        }

    }
}
