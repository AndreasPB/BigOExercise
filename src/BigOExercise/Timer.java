package BigOExercise;

import java.lang.reflect.Method;

/**
 * Vil have en metode der kan tage tid på en vilkårlig metode
 */
public class Timer {
    public void methodTimer(Method method) {
        long startTime2 = System.nanoTime();
        // Metode
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);
        System.out.println("millisekunder: " + duration2 / 1000000);
    }
}
