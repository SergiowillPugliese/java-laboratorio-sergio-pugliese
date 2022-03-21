import java.util.Arrays;

public class OrdinaArray {
//        int[] mioarray = {5,9,6,3,4,5,8,9,6,3,4,7,12,5};
//        System.out.println("l'array originale è: " +  Arrays.toString(mioarray));
//        Arrays.sort(mioarray);
//        System.out.println("l'array ordinato è: " + Arrays.toString(mioarray))

    public static void main(String[] args) {
        //inizializzo l'array
        int[] mioarray = {5,9,6,3,4,5,8,9,6,3,4,7,12,5};

        //stampo array originale
        System.out.println("Array originale: " + Arrays.toString(mioarray));

        //ciclo per analizzare l'array
        for (int i = 0; i < mioarray.length; i++) {
            //tengo bloccato l'elemento da confrontare con i successivi
            for (int j = 0; j < mioarray.length; j++) {
                //prendo gli elementi successivi
                if (mioarray[i] < mioarray[j]) {
                    int temp = mioarray[i];
                    mioarray[i] = mioarray[j];
                    mioarray[j] = temp;
                }
            }
        }
        //stampo risultato finale
        System.out.println("Array ordinato: " + Arrays.toString(mioarray));
    }
}
