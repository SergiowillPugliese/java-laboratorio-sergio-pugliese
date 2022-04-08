package com.engim.hashmap;

import java.util.HashMap;
import java.util.Map;

public abstract class Poligono implements MisurePerimetro
{
    private Map<String, Double> mappaLati = new HashMap<>();

    public Poligono() {}

    /**
     * costruttore che "istanzia" una classe poligono mediante una mappa passata
     * come paramentro.
     * Questa mappa come chiave (K) ha il nome del lato che vogliamo mappare invece, come valore
     * ha il valore effettivo del lato proprio.
     * es: <"base", 22.2>
     * @param mappaLati hashmap dei lati mappati
     * */
    public Poligono(Map<String, Double> mappaLati) {
        this.mappaLati = mappaLati;
    }

    public Map<String, Double> getMappaLati() {
        return mappaLati;
    }

    public void setMappaLati(Map<String, Double> mappaLati) {
        this.mappaLati = mappaLati;
    }

    @Override
    public abstract double calcolaArea();

    @Override
    public abstract double calcolaPerimetro();

    @Override
    public String toString() {
        return "Poligono{" +
                "mappaLati=" + mappaLati +
                '}';
    }
}
