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
     * Skal blive i det første index indtil værdien er den laveste -> Smider værdien af indexet til højre indtil den rammer
     * en højere værdi eller rammer muren. Hvis den rammer muren er den den højeste værdi og flytter muren
     * Hvis den ikke kan finde en lavere værdi, er den den laveste værdi og flytter venstre mur frem
     * @param numbers
     * @return
     */
    public int[] wallSort(int[] numbers) {
        int leftWall = 0;
        int rightWall = numbers.length;
        int newPosition;
        boolean doneSorting = false;

        while (!doneSorting) {
            for (int i = leftWall; i < rightWall; i++) {
                if (numbers[leftWall] > i) {
                    newPosition = i;
                }
            }

            doneSorting = true;
        }
        return numbers;
    }

    /**
     * Walls + scanner efter højeste + laveste værdi
     * @param numbers
     * @return
     */
    public int[] scanWallSort(int[] numbers, int highest, int lowest) {
        int leftWall = 0;
        int rightWall = numbers.length;
        int newPosition;
        int oldPosition = 0;
        boolean doneSorting = false;
        int low = highest;
        int high = lowest;
        int[] sortedNumbers = new int[numbers.length];
        Utility utility = new Utility();

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

            //utility.printNumbers("Sorting", numbers);

            high = lowest;
            if (rightWall == leftWall) {
                doneSorting = true;
            }
        }
        return sortedNumbers;
    }
}