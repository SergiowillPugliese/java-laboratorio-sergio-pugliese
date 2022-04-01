package com.engim.esercizio2;

public class Rettangolo extends Poligono {
    private int base;
    private int altezza;

    public Rettangolo(int base, int altezza, int numeroLati) {
        this.base = base;
        this.altezza = altezza;
        this.numeroLati = numeroLati;
    }

    public void setBase(int base) {
        this.base = Math.max(0, base);
    }

    public void setAltezza(int altezza) {
        this.altezza = Math.max(0, altezza);
    }

    public double area() {
        return (base * altezza);
    }
    public double perimetro(){
        return (2*base) + (2*altezza);
    }
}
