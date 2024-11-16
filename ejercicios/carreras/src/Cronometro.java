public class Cronometro {
    private long tiempoInicio;

    public void iniciar() {
        this.tiempoInicio = System.currentTimeMillis();
    }

    public double detener() {
        long tiempoFin = System.currentTimeMillis();
        return (tiempoFin - tiempoInicio) / 1000.0;
    }
}