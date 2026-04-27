package oop2.tp3.ejercicio5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorTest {

    @Test
    public void test01() {
        var eventos = cargarEventos();
        var factura = crearFactura();

        assertEquals(
                "Facturación para c1" + System.lineSeparator() +
                "Escuela de Rock: 156400.0. Asientos: 158" + System.lineSeparator() +
                "Hamlet: 113000.0. Asientos: 103" + System.lineSeparator() +
                "El Perfume: 40000.0. Asientos: 8" + System.lineSeparator() +
                "Monto ganado: 309400.0" + System.lineSeparator() +
                "Créditos ganados: 232.0" + System.lineSeparator()
                , new Calculador().reporte(factura, eventos));
    }

    private List<Evento> cargarEventos() {
        return List.of(new Comedia("Escuela de Rock"),
                new Drama("Hamlet"),
                new Drama("El Avion"),
                new Comedia("Cantando en la playa"),
                new Drama("El Perfume")
        );
    }

    private Factura crearFactura() {
        return new Factura("c1", List.of(new Actuacion("Escuela de Rock", 158),
                new Actuacion("Hamlet", 103),
                new Actuacion("El Perfume", 8)));
    }
}
