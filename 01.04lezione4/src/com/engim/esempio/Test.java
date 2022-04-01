package com.engim.esempio;

public class Test {
    public static void main(String[] args) {
        Persona personaGenerica = new Persona("Ciccio", "Pasticcio");
        System.out.println(personaGenerica);

        Bambino bambinoGenerico = new Bambino("Ciccio", "Graziani", 3.8,true);
        Persona bambinoGenerico2 = new Bambino("Luca","Rossi",3,true);
        System.out.println("bambino = new bambino: " + bambinoGenerico);
        System.out.println("persona = new bambino: "+bambinoGenerico2);
    }
}
