public class Main {
    public static void main(String[] args) {

        /**
         * Recursive sorting
         */
        RecursiveSort recursiveSort = new RecursiveSort();
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        Utility utility = new Utility();
        int[] numbers = arrayGenerator.GetNumbers(20);

        utility.printNumbers("Original array", numbers);
        recursiveSort.Sort(numbers);
        utility.printNumbers("Sorted array", numbers);
    }
}
