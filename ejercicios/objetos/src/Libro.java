public class Libro {
    String titulo;
    String autor;
    String numeroPaginas;
    double precio;

    public void obtenerDatos() {
        titulo = this.titulo;
        autor = this.autor;
        numeroPaginas = this.numeroPaginas;
        precio = this.precio;
    }

    public double CalcularDescuento () {
        return (this.precio * 20) +  \ 100;
    }

}
