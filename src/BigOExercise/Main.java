package BigOExercise;
// asbc  Altid en god vane at laegge koden i en package

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Sort sort = new Sort();
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        Utility utility = new Utility();
        int arraySize = 10000;

        /**
         * To ens arrays til sammenligning
         */
        int[] numbers = arrayGenerator.getNumbers(arraySize);
        int[] numbers1 = Arrays.copyOf(numbers, arraySize);
        int[] numbers2 = Arrays.copyOf(numbers, arraySize);

        /**
         * Bubble Sort
         */
        utility.printNumbers("Original array", numbers1);

        long startTime1 = System.nanoTime();
        sort.recursiveBubbleSort(numbers1);
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);

        utility.printNumbers("Sorted array", numbers1);
        System.out.println("millisekunder: " + duration1 / 1000000);


        /**
         * Har sikkert et navn, men min scan + mur idé
         */
        utility.printNumbers("Original array", numbers2);

        long startTime2 = System.nanoTime();
        sort.scanWallSort(numbers2, -10);
        // asbc Din metode returnerer et array; her anvender du det ikke !
        //      Din kode overlever, fordi du kalder "By reference"
        //      Kig på det. Vi skal lige have en generel snak om det i klassen.
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);

        utility.printNumbers("Sorted array", numbers2);
        System.out.println("millisekunder: " + duration2 / 1000000);
    }
}
