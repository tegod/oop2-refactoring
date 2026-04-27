package oop2.tp3.ejercicio3;

import java.util.List;

public class EjemploDeUsoDelReporte {
    public static void main(String[] args) {
        var g1 = new Desayuno("cafe", 1000);
        /*g1.tipoGasto = TipoDeGasto.DESAYUNO;
        g1.monto =1000;*/
        var reporte = new ReporteDeGastos();
        System.out.print(reporte.calcular(List.of(g1)));
    }
}
