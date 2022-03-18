import java.util.Scanner;

/**
 * @author Sergio Pugliese
 * implementare cicli commando due numeti per x volte, tenendpo traccia della somma di questi due numeri
 * */


public class CicloWhile {
    public static void main(String[] args) {
        int primonumero;
        int secondonumero;
        int somma = 0;
        int numeroIterazioni = 0;
        Scanner inpututente = new Scanner(System.in);

        while (numeroIterazioni < 4){
            System.out.println("inserisci il primo numero");
            primonumero = inpututente.nextInt();
            System.out.println("inserisci il secondo numero");
            secondonumero = inpututente.nextInt();
            //System.out.println(primonumero+ " " +secondonumero);
            somma = somma + primonumero + secondonumero;
            System.out.println("somma corrente: " + somma);
            numeroIterazioni++;
        }
        System.out.println("la somma è: " + somma);
    }
}
