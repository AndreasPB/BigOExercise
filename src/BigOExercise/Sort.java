package BigOExercise;
/**
 * Recursive "Bruteforce" metode. Tror den hedder BubbleSort
 * Kræver meget tid og bruger lidt plads - Normalt det modsatte
 * af hvad vi vil med BigO(h).
 *
 * asbc "bruger lidt plads" er IKKE sandt. Hver gang du kalder rutinen
 *      afsættes der plads, som først bliver frigivet naar de recursive
 *      kald vender tilbage.
 */
public class Sort {

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
            //utility.printNumbers("Sorting", numbers);
            recursiveBubbleSort(numbers);
        } else {
        }
        assert(true); // Burde ikke kunne ske
        // asbc Assert har kun en vaerdi, hvis det kan gå forkert
        //      https://www.youtube.com/watch?v=qeKSharClIo
    }

    /**
     * Scanner efter det højeste tal og flytter det til enden af arrayet.
     * @param numbers
     * @return
     */
    public void scanWallSort(int[] numbers, int lowest) {
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