package oop2.tp3.ejercicio3;

public class Cena extends Gasto{

    public Cena(String nombre, int monto) {
        super(nombre, monto);
    }

    public int devolverSiEsComida() {
        return monto;
    }

    public boolean excesoComida() {
        return monto > 5000;
    }
}
