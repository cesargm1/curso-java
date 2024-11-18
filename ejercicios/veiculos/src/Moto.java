public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int year, int cilindrada) {
        super(marca, modelo, year);
        this.cilindrada = cilindrada;

    }

    @Override

    public void mostrarInfo() {
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(cilindrada);
    }

    // getter

    public int getCilindrada() {
        return this.cilindrada;
    }

    // setter

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

}
