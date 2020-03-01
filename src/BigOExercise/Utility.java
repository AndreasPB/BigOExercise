package BigOExercise;

public class Utility {

    /**
     * Metode til genbrug
     * @param text
     * @param numbers
     */
    public void printNumbers(String text, int[] numbers) {
        System.out.print(text + ": [");
        for (int element : numbers) {
            System.out.print(element + ",");
        }
        System.out.print("]");
        System.out.println();
    }
}
