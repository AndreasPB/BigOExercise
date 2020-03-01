package BigOExercise;

import java.util.Random;

/**
 *  asbc
 *    Proev at aendre nedenstående til en klasse, hvis objekter er de arrays
 *    med de egenskaber, som du oensker i din loesning.
 *
 *    Det vil vaere rigtig objekt orienteret.
 *
 *    Altsaa lav en konstruktor, der naar du anvender  new  returnerer et objekt,
 *    der er dit array. Det vil vaere rigtig paent (og effektivt).
 *
 *    Og naar du nu er igang, saa lav en toString() metode. Saa behøver du ikke
 *    BigOExercise.Utility.java
 */
public class ArrayGenerator {
    public int[] getNumbers(int arraySize) {
        int[] numbers = new int[arraySize];
        Random random = new Random();

        for(int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(20) - 10;
        }
        return numbers;
    }
}
