package com.engim.hashmap;

import com.engim.hashmap.poligonispecializzati.Rettangolo;
import com.engim.hashmap.poligonispecializzati.TriangoloRettangolo;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //rettangolo
        Map<String, Double> mappaRettangolo = new HashMap<>();
        mappaRettangolo.put("base", 10.0);
        mappaRettangolo.put("altezza", 20.0);
        Rettangolo rettangolo = new Rettangolo(mappaRettangolo);
        //System.out.println("area = " + rettangolo.calcolaArea());

        //triangolo rettangolo
        Map<String, Double> mappaTriangoloRettangolo = new HashMap<>();
        mappaTriangoloRettangolo.put("catetoUno", 10.0);
        mappaTriangoloRettangolo.put("catetoDue", 20.0);
        mappaTriangoloRettangolo.put("ipotenusa", 30.0);
        TriangoloRettangolo triangoloRettangolo = new TriangoloRettangolo(mappaTriangoloRettangolo);
        //System.out.println("Perimetro triangolo = " + triangoloRettangolo.calcolaPerimetro());

//        for (String key : mappaRettangolo.keySet()){
//            System.out.println("chiave: " + key + ", valore: " + mappaRettangolo.get(key));
//        }
//        System.out.println("\n ");
//        mappaTriangoloRettangolo.forEach((key, value) -> {
//            System.out.println("LAMBA-NOTATION ---> chiave: " + key + ", valore: " + mappaTriangoloRettangolo.get(key));
//        });
//
//        mappaTriangoloRettangolo.forEach((key, value) -> {
//            System.out.println("2) LAMBA-NOTATION ---> chiave: " + key + ", valore: " + value);
//        });
//        System.out.println("\n ");
//        System.out.println("itero su keySet() lamba notation");
//        mappaTriangoloRettangolo.keySet().forEach((key -> {
//            System.out.println("LAMBA-NOTATION ---> chiave: " + key + ", valore: " + mappaTriangoloRettangolo.get(key));
//        }));

        System.out.println("itero sui valori");
        for (double v : mappaRettangolo.values()){
            System.out.println("valore: " + v);
        }

        System.out.println("\n ");
        System.out.println("itero su keySet() lamba notation");
        mappaTriangoloRettangolo.values().forEach((v -> {
            System.out.println("2) LAMBA-NOTATION ---> valore: " + v);
        }));


    }
}
