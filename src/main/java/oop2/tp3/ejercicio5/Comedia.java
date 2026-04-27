package oop2.tp3.ejercicio5;

public class Comedia extends Evento {

    public Comedia(String nombreEvento) {
        super(nombreEvento);
    }

    @Override
    public float calcularPrecio(int espectadores) {
        float precio = 30000;
        if (espectadores > 20) {
            precio += 10000 + 500 * (espectadores - 20);
        }
        precio += 300 * espectadores;
        return precio;
    }

    @Override
    public float calcularCreditos(int espectadores) {
        float creditos = Math.max(espectadores - 30, 0);
        creditos += Math.floor(espectadores / 5);

        return creditos;
    }
}
