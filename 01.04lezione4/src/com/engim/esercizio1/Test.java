package com.engim.esercizio1;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class Test {
    public static void main(String[] args) {
        Persona persona = new Persona("Mario", "Rossi",8);
        Studente studente = new Studente("elementare", "matematica");
        Persona studente1 = new Studente("Luca", "Bianco", 12, "medie", "matematica");
        Insegnante insegnante = new Insegnante("anna", "Ciao", 50, "elementare", "matematica");
        Persona insegnante1 = new Insegnante("Maria", "Salute", 50, "media", "italiano");

        System.out.println("persona: " + persona);
        System.out.println("studente: " + studente);
        System.out.println("studente1: " + studente1);
        System.out.println("insegante: " + insegnante);
        System.out.println("insegnante1: " + insegnante1);

        System.out.println("disturba? " + studente.disturba());
        System.out.println("studia " + studente.studia());
        if (studente.disturba()){
            insegnante.insegna(studente.disturba());
        }

    }
}
