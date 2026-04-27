package oop2.tp3.ejercicio3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReporteDeGastosTest {

   /* @BeforeEach
    void setUp() {
        Gasto g1 = new Gasto();
        g1.tipoGasto = TipoDeGasto.DESAYUNO;
        g1.monto = 1000;
        ReporteDeGastos reporte = new ReporteDeGastos();
        reporte.calcular(List.of(g1));
    }*/

    @Test
    void TestReporte() {
        Gasto g1 = new Desayuno("cafe", 1000);
        /*g1.tipoGasto = TipoDeGasto.DESAYUNO;
        g1.monto = 1000;*/
        ReporteDeGastos reporte = new ReporteDeGastos();
        String resultado =  reporte.calcular(List.of(g1));
        assertEquals("expensas "  + LocalDate.now() + "\n" +
                "cafe\t1000\t \n" +
                "Gastos de comida: 1000\n" +
                "Total de gastos: 1000\n", resultado);
    }

    @Test
    void TestReporteTotalExceso() {
        Gasto g1 = new Desayuno("cafe con chocolate", 1001);
        /*g1.tipoGasto = TipoDeGasto.DESAYUNO;
        g1.monto = 1001;*/
        Gasto g2 = new Cena("osobuco a la salsa de frutos rojos", 5500);
        /*g2.tipoGasto = TipoDeGasto.CENA;
        g2.monto = 5500;*/
        ReporteDeGastos reporte = new ReporteDeGastos();
        String resultado = reporte.calcular(List.of(g1, g2));
        assertEquals("expensas " + LocalDate.now() + "\n" +
                "cafe con chocolate\t1001\tX\n" +
                "osobuco a la salsa de frutos rojos\t5500\tX\n" +
                "Gastos de comida: 6501\n" +
                "Total de gastos: 6501\n", resultado);
    }
}
