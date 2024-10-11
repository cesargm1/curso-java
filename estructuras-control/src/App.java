public class App {
    public static void main(String[] args) throws Exception {
        int edad = 15;

        if (edad >= 18 && edad <= 60) {
            System.out.println("puedes comprar alcol");

        } else if (edad > 60) {
            System.out.println("Eres demasiado mayor para beber");
        } else {
            System.out.println("no puedes beber te quedan " + (18 - edad) + " años");
        }
    }
}
