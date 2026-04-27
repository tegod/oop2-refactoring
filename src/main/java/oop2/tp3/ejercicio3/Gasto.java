package oop2.tp3.ejercicio3;

public abstract class Gasto {
    String nombre;
    int monto;

    public Gasto(String nombre, int monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public int devolverSiEsComida() {return 0;}

    public boolean excesoComida() {return false;}
}
