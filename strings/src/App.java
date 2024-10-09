public class App {
    public static void main(String[] args) throws Exception {

        // metodo 1

        String texto = "texto de ejemplo";
        System.out.println(texto);
        int longitud = texto.length();
        System.out.println(longitud);

        // metodo 2

        char character = texto.charAt(0);
        System.out.println(character);

        // Metodo 3
        String subString = texto.substring(9, 16);
        System.out.println(subString);

        // metodo 4

        String uperCase = texto.toUpperCase();
        System.out.println(uperCase);

        // metodo 5

        String lowerCase = texto.toLowerCase();
        System.out.println(lowerCase);

        // metodo 6

        String remplazo = texto.replace("texto", "titulo");
        System.out.println(remplazo);

        // metodo 7

        Boolean contain = texto.contains("ejemplo");
        Boolean noContain = texto.contains("nombre");
        System.out.println("tiene esa palabra? " + contain);
        System.out.println("tiene esta palabra " + noContain);

        // metodo 8

        // Texto con espacios

        String textoEspacios = "    Este es un texto con muchos espacios   ";
        System.out.println(textoEspacios);
        String sinEspacios = textoEspacios.trim();
        // texto sin espacios

        System.out.println(sinEspacios);
    }

}
