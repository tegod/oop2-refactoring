package oop2.tp3.ejercicio5;

public class Drama extends Evento {

    public Drama(String nombreEvento) {
        super(nombreEvento);
    }

    @Override
    public float calcularPrecio(int espectadores) {
        float precio = 40000;
        if (espectadores > 30) {
            precio += 1000 * (espectadores - 30);
        }
        return precio;
    }

    @Override
    public float calcularCreditos(int espectadores) {
        return Math.max(espectadores - 30, 0);
    }
}
