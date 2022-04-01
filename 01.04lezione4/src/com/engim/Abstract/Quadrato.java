package com.engim.Abstract;

public class Quadrato extends Poligono {

    private double valoreLato;
    private static final int NUMERO_LATI = 4;

    public Quadrato(){super();}

    public Quadrato(double valoreLato) {
        super(NUMERO_LATI);
        this.valoreLato = valoreLato;
    }

    public Quadrato(int numeroLati, double valoreLato) {
        super(numeroLati);
        this.valoreLato = valoreLato;
    }

    @Override
    public double calcolaPerimetro() {
        return this.valoreLato * NUMERO_LATI;
    }

    @Override
    public double calcolaArea() {
        return this.valoreLato * this.valoreLato;
    }

}
