public class Veiculo {
    String marca;
    String modelo;
    int year;

    public Veiculo(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    // getter

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getYear() {
        return this.year;
    }

    // setter

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void mostrarInfo() {
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
    }

}
