package com.engim.Esercizi;

public class TesterConto {
    public static void main(String[] args) {
        ContoCorrente mioprimoCC = new ContoCorrente("Sergio", "4545454213", 500);
        System.out.println("Info: " + mioprimoCC);
        System.out.println("Il saldo è di: " + mioprimoCC.getSaldo());
        mioprimoCC.prelievo(800);
        mioprimoCC.deposito(1000);
        mioprimoCC.prelievo(800);
        System.out.println("Il saldo è di: " + mioprimoCC.getSaldo());
    }
}
