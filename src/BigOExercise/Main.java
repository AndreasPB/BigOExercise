package BigOExercise;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Array sorting sammenligninger");

        Sort sort = new Sort();
        Search search = new Search();



        /**
         * To ens arrays til sammenligning
         */
        ArrayGenerator bubbleArray = new ArrayGenerator(1000);
        ArrayGenerator selectionArray = (ArrayGenerator) bubbleArray.clone();


        /**
         * Constant Time + Tid
         * Viser det første tal i et array
         */
        System.out.println("\nViser første index - Constant Time O(1)");

        long startTime3 = System.nanoTime();
        System.out.println(search.findFirstIndex(bubbleArray.getNumbers()));
        long endTime3 = System.nanoTime();
        long duration3 = (endTime3 - startTime3);
        System.out.println("millisekunder: " + duration3 / 1000000);


        /**
         * Linear Time + Tid
         * Antal tal i et array
         */
        System.out.println("\nAntal tal i et array - Linear Time O(n)");

        long startTime4 = System.nanoTime();

        search.countAllValues(bubbleArray.getNumbers());
        long endTime4 = System.nanoTime();
        long duration4 = (endTime4 - startTime4);
        System.out.println("millisekunder: " + duration4 / 1000000);


        /**
         * Linear Time + Tid
         * Printer alle tal i et array
          */
        System.out.println("\nPrinter alle tal i et array - Linear Time O(n)");

        long startTime5 = System.nanoTime();

        search.printAllValues(bubbleArray.getNumbers());
        long endTime5 = System.nanoTime();
        long duration5 = (endTime4 - startTime4);
        System.out.println("millisekunder: " + duration5 / 1000000);




        // BubbleSort + Tager tid
        System.out.println("\nBubbleSort O(n^2)");
        System.out.println(bubbleArray.toString());

        long startTime1 = System.nanoTime();
        sort.recursiveBubbleSort(bubbleArray.getNumbers());
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);

        System.out.println(bubbleArray.toString());
        System.out.println("millisekunder: " + duration1 / 1000000);


        // SelectionSort + Tager tid
        System.out.println("\nSelectionSort O(n^2)");

        System.out.println(selectionArray.toString());
        long startTime2 = System.nanoTime();
        sort.selectionSort(selectionArray.getNumbers(), -10);
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);

        System.out.println(selectionArray.toString());
        System.out.println("millisekunder: " + duration2 / 1000000);
    }
}
