package com.engim.Esempio;

public class Main {

    public static void main(String[] args) {
	Persona p1 = new Persona();
    p1.nome = "Mario";
    p1.cognome = "Rossi";

    Persona p2 = new Persona("Emanuel","Epifani","8/4/1994");

    Persona p3 = new Persona(29);

        System.out.println("p1 " + p1);
        System.out.println("p2" + p2);
        System.out.println("p3" + p3);
    }

}
