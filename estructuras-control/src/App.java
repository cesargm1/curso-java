public class App {
    public static void main(String[] args) throws Exception {
        // int edad = 15;

        // if else

        // if (edad >= 18 && edad <= 60) {
        // System.out.println("puedes comprar alcol");

        // } else if (edad > 60) {
        // System.out.println("Eres demasiado mayor para beber");
        // } else {
        // System.out.println("no puedes beber te quedan " + (18 - edad) + " años");
        // }

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

    }

}
