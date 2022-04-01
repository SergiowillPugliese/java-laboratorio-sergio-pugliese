package com.engim.esercizio1;

import java.util.Scanner;

public class Studente extends Persona{
    Scanner tastiera = new Scanner(System.in);
    private String scuola;
    private String materia;

    public Studente() {
        super();
    }
    public Studente(String scuola, String materia) {
        this.scuola = scuola;
        this.materia = materia;
    }
    public Studente(String nome, String cognome, int eta, String scuola, String materia) {
        super(nome, cognome, eta);
        this.scuola = scuola;
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "tastiera= " + tastiera +
                ", nome=' " + scuola + '\'' +
                ", cognome=' " + scuola + '\'' +
                ", scuola=' " + scuola + '\'' +
                ", materia=' " + materia + '\'' +
                '}';
    }

    //metodo disturba
    public boolean disturba(){
        System.out.println("seleziona 0 o 1");
        int x = tastiera.nextInt();
        boolean y;
        if (x==0){
            System.out.println("non Sta disturbando" );
            return y=false;
        } else {
            System.out.println("E' concentrato");
            return y=true;
        }
    }

    //metodo studia
    public boolean studia(){
        if (disturba()){
            System.out.println("è consentrato su cosa sta facendo");
            return true;
        } else {
            System.out.println("Non studia perché disturba");
            return false;
        }
    }
}
