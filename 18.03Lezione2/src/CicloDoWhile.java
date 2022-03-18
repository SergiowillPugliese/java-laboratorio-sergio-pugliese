import java.util.Scanner;

public class CicloDoWhile {
    public static void main(String[] args) {
        int primonumero;
        int secondonumero;
        int somma = 0;
        int numeroIterazioni = 0;
        Scanner inpututente = new Scanner(System.in);

        do {
            System.out.println("inserisci il primo numero");
            primonumero = inpututente.nextInt();
            System.out.println("inserisci il secondo numero");
            secondonumero = inpututente.nextInt();
            //System.out.println(primonumero+ " " +secondonumero);
            somma = somma + primonumero + secondonumero;
            System.out.println("somma corrente al ciclo " + numeroIterazioni + " è: " + somma);
            numeroIterazioni++;
        } while (numeroIterazioni < 4);
        System.out.println("la somma è: " + somma);
    }
}

