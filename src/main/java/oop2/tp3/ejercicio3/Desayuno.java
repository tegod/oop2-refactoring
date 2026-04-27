package oop2.tp3.ejercicio3;

public class Desayuno extends Gasto{

    public Desayuno(String nombre, int monto) {
        super(nombre, monto);
    }

    public int devolverSiEsComida() {
        return monto;
    }

    public boolean excesoComida() {
        return monto > 1000;
    }
}
