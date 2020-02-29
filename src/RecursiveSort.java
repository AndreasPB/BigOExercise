import java.util.Random;

/**
 * Recursive "Bruteforce" metode
 * Kræver meget tid og bruger lidt plads - Normalt det modsatte af hvad vi vil med BigO(h)
 */
public class RecursiveSort {

    public int[] Sort(int[] numbers) {
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
            utility.printNumbers("Sorting", numbers);
            Sort(numbers);
        } else {
            return numbers;
        }
        assert(true); // Burde ikke kunne ske
        return numbers;
    }
}