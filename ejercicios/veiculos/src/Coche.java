public class Coche extends Veiculo {
    private int nPuertas;

    public Coche(String marca, String modelo, int year, int nPuertas) {
        super(marca, modelo, year);
        this.nPuertas = nPuertas;

    }

    // getter

    public int getnPuertas() {
        return this.nPuertas;
    }

    // setter

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(nPuertas);
    }
}
