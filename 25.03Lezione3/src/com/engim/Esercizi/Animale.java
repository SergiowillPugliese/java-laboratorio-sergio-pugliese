package com.engim.Esercizi;

import java.util.Scanner;

public class Animale {

    private String tipoAnimale;
    private String tipoSpecie;
    private boolean animaleDaCompagnia;

    public Animale() {
    }
    public Animale(String tipoAnimale, String tipoSpecie, boolean animaleDaCompagnia) {
        this.tipoAnimale = tipoAnimale;
        this.tipoSpecie = tipoSpecie;
        this.animaleDaCompagnia = animaleDaCompagnia;
    }

    public String getTipoAnimale() {
        return tipoAnimale;
    }
    public void setTipoAnimale(String tipoAnimale) {
        this.tipoAnimale = tipoAnimale;
    }
    public String getTipoSpecie() {
        return tipoSpecie;
    }
    public void setTipoSpecie(String tipoSpecie) {
        this.tipoSpecie = tipoSpecie;
    }
    public boolean isAnimaleDaCompagnia() {
        return animaleDaCompagnia;
    }
    public void setAnimaleDaCompagnia(boolean animaleDaCompagnia) {
        this.animaleDaCompagnia = animaleDaCompagnia;
    }

    @Override
    public String toString() {
        return "Animale{" +
                "tipoAnimale='" + tipoAnimale + '\'' +
                ", tipoSpecie='" + tipoSpecie + '\'' +
                ", animaleDaCompagnia=" + animaleDaCompagnia +
                '}';
    }

    public void mangia(String inputMangia) {
        if (inputMangia.compareTo("Si") == 0){
            System.out.println("Sto mangiando");
        } else {
            System.out.println("non sto mangiando");
        }
    }

    public void caccia(String inputCaccia){
        if (inputCaccia.compareTo("Si") == 0){
            System.out.println("Sono a caccia");
        } else {
            System.out.println("Non sono a caccia");
        }
    }


}

