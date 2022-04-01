package com.engim.esercizio1;

public class Insegnante extends Persona{
    private String materia;
    private String tipo;

    public Insegnante() {
        super();
    }

    public Insegnante(String materia, String tipo) {
        this.materia = materia;
        this.tipo = tipo;
    }

    public Insegnante(String nome, String cognome, int eta, String materia, String tipo) {
        super(nome, cognome, eta);
        this.materia = materia;
        this.tipo = tipo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Insegnante{" +
                "nome='" + materia + '\'' +
                "cognome='" + materia + '\'' +
                "materia='" + materia + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
    //metodo insegna
    public void insegna(boolean x){
        if (x){
            System.out.println("mette la nota");
        } else {
            System.out.println("fa lezione normalmente");
        }
    }
}
