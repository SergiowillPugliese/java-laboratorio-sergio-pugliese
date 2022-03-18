public class MediaArray {
    /**
     * inizializzato un array, calcolarne la somma e la media del valore totale
     * */
    public static double somma(int[]arr){
        double somma = 0;
        for (int i = 0; i < arr.length; i++) {
            somma = somma + arr[i];
        }
        return somma;
    }
    public static double miaFun(int[]par, double par2){
        //inizializzazione variabili
        double media = 0;
        //divido la somma di tutti gli elementi per la lunghezza totale dell'array
        media = par2/par.length;
        return media;
    }

    public static void main(String[] args) {
        // inizializzazione array
        int[] mioarray = {5,9,6,3,4,5,8,9,6,3,4,7,12,5};

        //stampo i risultati ottenuti
        System.out.println("la somma dell'array è di: " + somma(mioarray));
        System.out.println("lunghezza " + mioarray.length);
        System.out.println("il valore medio di mioarray è: " + miaFun(mioarray,somma(mioarray)));
    }
}
