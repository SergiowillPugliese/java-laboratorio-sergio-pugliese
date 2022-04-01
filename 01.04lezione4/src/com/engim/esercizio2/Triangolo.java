package com.engim.esercizio2;

public class Triangolo extends Poligono {
    private int base;
    private int altezza;

    public Triangolo(int base, int altezza, int numeroLati) {
        this.base = base;
        this.altezza = altezza;
        this.numeroLati = numeroLati;
    }

    public double area(){
        return (base*altezza)/2;
    }
}
