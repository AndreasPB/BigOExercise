package BigOExercise;

public class Search {


    /**
     * Constant Time O(1)
     */
    public int findFirstIndex(int[] numbers) {
        return numbers[0];
    }


    /**
     * Linear Time O(n)
     */
    public void printAllValues(int[] numbers) {
        System.out.print("Tal i array: ");
        System.out.print(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            System.out.print(", " + numbers[i]);
        }
        System.out.println();
    }

    public void countAllValues(int[] numbers) {
        int counter = 0;

        for(int num : numbers) {
            counter++;
        }
        System.out.println("Antal tal i arrayet: " + counter);
    }
}
