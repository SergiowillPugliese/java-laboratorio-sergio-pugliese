package com.engim.esercizio2;

public class Test {
    public static void main(String[] args) {
        Quadrato quadrato = new Quadrato(12,4);
        Rettangolo rettangolo = new Rettangolo(13,20,4);
        Triangolo triangolo = new Triangolo(15,9,3);

        double x = quadrato.area();
        System.out.println("Area quadrato: " + x + " lati " + quadrato.numeroLati);
        double y = quadrato.perimetro();
        System.out.println("perimetro quadrato: " + y + " lati " + quadrato.numeroLati);
        double z = rettangolo.area();
        System.out.println("area rettangolo: " + z + " lati " + rettangolo.numeroLati);
        double a = rettangolo.perimetro();
        System.out.println("perimetro rettangolo " + a + " lati " + rettangolo.numeroLati);
        double b = triangolo.area();
        System.out.println("area triangolo: " + b + " lati " + triangolo.numeroLati);
    }
}
