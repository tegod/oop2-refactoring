package oop2.tp3.ejercicio1;

public class LibrosRegulares extends Libro {

    public LibrosRegulares(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularPrecio(int diasAlquilados) {
        int monto = 2;
        if (diasAlquilados > 2) {
            monto += (diasAlquilados - 2) * 1.5;
        }
        return monto;
    }

    @Override
    public int calcularPuntos(int diasAlquilados) {
        return 1;
    }
}
