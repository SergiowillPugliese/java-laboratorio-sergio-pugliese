package com.engim.Esercizi;

import java.util.Scanner;

public class TesterAnimale {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Animale gatto = new Animale();
        Animale cane = new Animale("Cane", "Canide", true );
        Animale leone = new Animale("Leone", "Felino", false);
        gatto.setTipoAnimale("gatto");
        gatto.setTipoSpecie("felino");
        gatto.setAnimaleDaCompagnia(true);


        System.out.println("il " + leone.getTipoAnimale());
        System.out.println("Sono a caccia? ");
        leone.caccia(tastiera.nextLine());



    }
}
