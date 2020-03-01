import java.util.Random;

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
