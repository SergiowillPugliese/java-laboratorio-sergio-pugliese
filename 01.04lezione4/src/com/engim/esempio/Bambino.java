package com.engim.esempio;

public class Bambino extends Persona {
    private double pesoNascita;
    private boolean prematuro;

    public Bambino() {
        super();
    }

    public Bambino(double pesoNascita, boolean prematuro) {
        this.pesoNascita = pesoNascita;
        this.prematuro = prematuro;
    }

    public Bambino(String nome, String cognome, double pesoNascita, boolean prematuro) {
        super(nome, cognome);
        this.pesoNascita = pesoNascita;
        this.prematuro = prematuro;
    }

    public double getPesoNascita() {
        return pesoNascita;
    }

    public void setPesoNascita(double pesoNascita) {
        this.pesoNascita = pesoNascita;
    }

    public boolean isPrematuro() {
        return prematuro;
    }

    public void setPrematuro(boolean prematuro) {
        this.prematuro = prematuro;
    }

    @Override
    public String toString() {
        return "Bambino{" +
                "nome= " + getNome()+" "+
                "cognome= " + getCognome()+" "+
                "pesoNascita= " + pesoNascita +
                ", prematuro= " + prematuro +
                '}';
    }
}
