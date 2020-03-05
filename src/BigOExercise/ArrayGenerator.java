package BigOExercise;

import java.util.Arrays;
import java.util.Random;

/**
 * En array generator, der også kan klone
 */

public class ArrayGenerator implements Cloneable {


    private int[] numbers;
    private int arraySize;

    public ArrayGenerator(int arraySize) {
        this.arraySize = arraySize;
        this.numbers = createNumbers();
    }

    public int[] createNumbers() {
        int[] numbers = new int[arraySize];
        Random random = new Random();

        for(int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(20) - 10;
        }
        return numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    /**
     * Laver en deep copy af mit array objekt, så mine tests giver et mere meningsfuldt resultat
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        ArrayGenerator cloned = (ArrayGenerator) super.clone();
        cloned.setNumbers(cloned.getNumbers().clone());
        return cloned;
    }

    @Override
    public String toString() {
        return "Array: "  + Arrays.toString(numbers);
    }
}
