package com.engim;

import java.util.*;

public class Esercizio {

    public static void main(String[] args) {
        List<String> comuni = new ArrayList<>();
        comuni.add("Moncalieri");
        comuni.add("Chieri");
        comuni.add("Vinovo");
        comuni.add("Santena");

        Map<String,List> regProvCom = new HashMap<>();
        regProvCom.put("torino", comuni);


    }

}
