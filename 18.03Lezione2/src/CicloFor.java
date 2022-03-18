import java.util.Scanner;

public class CicloFor {
    public static void main(String[] args) {
        int primonumero;
        int secondonumero;
        int somma = 0;
        Scanner inpututente = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("inserisci il primo numero");
            primonumero = inpututente.nextInt();
            System.out.println("inserisci il secondo numero");
            secondonumero = inpututente.nextInt();
            //System.out.println(primonumero+ " " +secondonumero);
            somma = somma + primonumero + secondonumero;
            System.out.println("somma corrente al ciclo " + i + " è: " + somma);
        }
        System.out.println("la somma è: " + somma);
    }
}


