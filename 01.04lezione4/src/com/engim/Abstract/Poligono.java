package com.engim.Abstract;

public abstract class Poligono {
    private int numeroLati;

    public Poligono(){}

    public Poligono(int numeroLati) {
        this.numeroLati = numeroLati;
    }

    public int getNumeroLati() {
        return numeroLati;
    }

    public void setNumeroLati(int numeroLati) {
        this.numeroLati = numeroLati;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "numeroLati=" + numeroLati +
                '}';
    }
    /**
     * metodo che calcola il perimetro in un determinato poligono
     * @return perimetro tramite la somma del valore dei lati per il numero dei lati
     * */
    public abstract double calcolaPerimetro();

    /**
     * metodo che calcola l'area in un determinato poligono
     *      * @return area tramite una determinata formula
     * */
    public abstract double calcolaArea();

}
