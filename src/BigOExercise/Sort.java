package BigOExercise;

public class Sort {


    /**
     * Recursive "Bruteforce" metode - BubbleSort
     * O(n^2)
     * @param numbers
     */
    public void recursiveBubbleSort(int[] numbers) {
        boolean sorted = false;
        int posA;
        int posB;

        for(int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] > numbers[i + 1] && numbers[i] != numbers.length) {
                posA = numbers[i];
                posB = numbers[i + 1];
                numbers[i] = posB;
                numbers[i + 1] = posA;
                sorted = true;
            }
        }
        if (sorted) {
            recursiveBubbleSort(numbers);
        }
    }

    /**
     * Scanner efter det højeste tal og flytter det til enden af arrayet.
     * O(n^2)
     * @param numbers
     * @return
     */
    public void selectionSort(int[] numbers, int lowest) {
        int leftWall = 0;
        int rightWall = numbers.length;
        int oldPosition = 0;
        boolean doneSorting = false;
        int high = lowest;

        while (!doneSorting) {
            /**
             * Scanner for og gemmer det højeste tal mellem murene
             */
            for (int i = leftWall; i < rightWall; i++) {
                if (high < numbers[i]) {
                    high = numbers[i];
                    oldPosition = i;
                }
            }

            /**
             * Flytter elementer fra den gamle position og frem
             */
            for (int i = oldPosition; i < rightWall - 1; i++) {
                numbers[i] = numbers[i + 1];
            }

            numbers[rightWall - 1] = high;
            rightWall--;

            high = lowest;
            if (rightWall == leftWall) {
                doneSorting = true;
            }
        }
    }
}