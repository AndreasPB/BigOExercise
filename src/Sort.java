/**
 * Recursive "Bruteforce" metode. Tror den hedder BubbleSort
 * Kræver meget tid og bruger lidt plads - Normalt det modsatte af hvad vi vil med BigO(h)
 */
public class Sort {

    public int[] recursiveBubbleSort(int[] numbers) {

        Utility utility = new Utility();
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
            //utility.printNumbers("Sorting", numbers);
            recursiveBubbleSort(numbers);
        } else {
            return numbers;
        }
        assert(true); // Burde ikke kunne ske
        return numbers;
    }

    /**
     * Scanner efter det højeste tal og flytter det til enden af arrayet.
     * @param numbers
     * @return
     */
    public int[] scanWallSort(int[] numbers, int lowest) {
        int leftWall = 0;
        int rightWall = numbers.length;
        int oldPosition = 0;
        boolean doneSorting = false;
        int high = lowest;
        int[] sortedNumbers = new int[numbers.length];

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
        return sortedNumbers;
    }
}