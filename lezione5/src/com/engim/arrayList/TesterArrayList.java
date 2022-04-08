package com.engim.arrayList;

import java.util.ArrayList;
import java.util.List;

public class TesterArrayList {
    public static void main(String[] args) {
        List<String> nomiMacchine = new ArrayList<>();
        nomiMacchine.add("BMV");
        nomiMacchine.add("Citroen");
        nomiMacchine.add(1, "Fiat");

        for (String macchina: nomiMacchine)
            System.out.println(macchina);

        System.out.println("\n LAMBDA-NOTATION");
        nomiMacchine.forEach((macchina ->
                System.out.println(macchina)
        ));
    }
}
