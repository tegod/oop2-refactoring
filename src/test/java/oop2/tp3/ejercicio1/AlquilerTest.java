package oop2.tp3.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlquilerTest {
    private Cliente yo;

    @BeforeEach
    public void setUp() {
        Libro elTunel = new LibrosRegulares("El Túnel");
        Libro antesDelFin = new LibrosRegulares("Antes del Fin");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
        yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        //Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
    }

    @Test
    public void testCalculoDePago() {
        Object[] resultado = yo.obtenerTotalDeudaYPuntosObtenidos();
        assertEquals(10.0, resultado[0]);
        assertEquals(2, resultado[1]);
    }
}
