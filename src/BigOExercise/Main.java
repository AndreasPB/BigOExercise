package BigOExercise;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Array sorting sammenligninger");

        Sort sort = new Sort();

        /**
         * To ens arrays til sammenligning
         */
        ArrayGenerator bubbleArray = new ArrayGenerator(1000);
        ArrayGenerator selectionArray = (ArrayGenerator) bubbleArray.clone();

        /**
         * BubbleSort + Tager tid
         */
        System.out.println("\nBubbleSort");
        System.out.println(bubbleArray.toString());

        long startTime1 = System.nanoTime();
        sort.recursiveBubbleSort(bubbleArray.getNumbers());
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);

        System.out.println(bubbleArray.toString());
        System.out.println("millisekunder: " + duration1 / 1000000);


        /**
         * SelectionSort + Tager tid
         */
        System.out.println("\nSelectionSort");

        System.out.println(selectionArray.toString());
        long startTime2 = System.nanoTime();
        sort.selectionSort(selectionArray.getNumbers(), -10);
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);

        System.out.println(selectionArray.toString());
        System.out.println("millisekunder: " + duration2 / 1000000);
    }
}
