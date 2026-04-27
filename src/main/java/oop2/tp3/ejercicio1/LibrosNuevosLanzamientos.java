package oop2.tp3.ejercicio1;

public class LibrosNuevosLanzamientos extends Libro {

    public LibrosNuevosLanzamientos(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularPrecio(int diasAlquilados) {
        double monto = 0;
        monto += diasAlquilados * 3;
        return monto;
    }

    //calcula los puntos extra ganados en base a si son 1 o mas dias.
    @Override
    public int calcularPuntos(int diasAlquilados) {
        if (diasAlquilados > 1) {
            return 2;
        }
        return 1;
    }
}
