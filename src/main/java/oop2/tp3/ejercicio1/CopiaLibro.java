package oop2.tp3.ejercicio1;

public class CopiaLibro {
    private Libro libro;

    public CopiaLibro(Libro libro) {
        this.libro = libro;
    }

    /*public Libro libro() {
        return libro;
    }*/
    public double calcularCosto(int dias) {
        return this.libro.calcularPrecio(dias);
    }

    public int calcularPuntos(int diasAlquilados) {
        return this.libro.calcularPuntos(diasAlquilados);
    }
}