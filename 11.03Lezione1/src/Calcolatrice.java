
import java.util.Scanner;



public class Calcolatrice {
    /**
     * @author Sergio Pugliese
     * @a variabile con input double da tastiera
     * @b variabile con input double da tastiera
     * @op variabile con input string da tastiera per selezionare l'operatore
     * @somma variabile che racchiude la somma dei due numeri inseriti
     * @addizione funzione per calcolare la somma
     * @sottrazione funzione per calcolare la differenza
     * @moltiplicazione funzione per calcolare il prodotto
     * @divisione funzione per fare la divisione
     */

    public static double addizione(double num1, double num2) {
        double somma;
        somma = num1 + num2;
        return somma;
    }

    public static double sottrazione(double num1, double num2) {
        double somma;
        somma = num1 - num2;
        return somma;
    }

    public static double moltiplicazione(double num1, double num2) {
        double somma;
        somma = num1 * num2;
        return somma;
    }

    public static double divisione(double num1, double num2) {
        double somma = 0;
        if (num2 != 0) {
            somma = num1 / num2;
        } else {
            System.out.println("non puoi dividere per 0");
            return Double.NEGATIVE_INFINITY;
        }
        return somma;
    }

    public static boolean possibile(double num1){
        boolean possibile = false ;
        if (num1%2 == 0){
            possibile = true;
        } else if (num1%3 == 0){
            possibile = true;
        } else if (num1%4 == 0){
            possibile = true;
        } else if (num1%5 == 0){
            possibile = true;
        }
        return possibile;
    }

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Scrivere l'operatore da usare: +,-,*,/.");
        System.out.println("scrivere \"divisibile\" per sapere se un numero è divisibile per 2,3,4,5");
        String op = tastiera.nextLine();

        if (op.compareTo("divisibile") != 0) {
            System.out.println("Scrivere il primo numero da calcolare");
            double a = tastiera.nextDouble();
            System.out.println("Scrivere il secondo numero da calcolare");
            double b = tastiera.nextDouble();
            double somma;
            switch (op) {
                case "+":
                    somma = addizione(a, b);
                    System.out.println(somma);
                    break;
                case "-":
                    somma = sottrazione(a, b);
                    System.out.println(somma);
                    break;
                case "*":
                    somma = moltiplicazione(a, b);
                    System.out.println(somma);
                    break;
                case "/":
                    somma = divisione(a, b);
                    System.out.println(somma);
                    break;
            }
        } else {
            System.out.println("inserisci un numero");
            double a = tastiera.nextDouble();
            System.out.println("il numero è divisibile? " + possibile(a));
        }
    }
}
