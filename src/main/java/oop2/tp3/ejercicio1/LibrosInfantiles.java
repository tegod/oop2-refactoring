package oop2.tp3.ejercicio1;

public class LibrosInfantiles extends Libro {

    public LibrosInfantiles(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularPrecio(int diasAlquilados) {
        double monto = 1.5;
        if (diasAlquilados > 3) {
            monto += (diasAlquilados - 3) * 1.5;
        }
        return monto;
    }

    @Override
    public int calcularPuntos(int diasAlquilados) {
        return 1;
    }
}
