package task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4};
        Integer max = findMax(array);
        Integer min = findMin(array);
        Float average = findAverage(array);

        System.out.println(String.format("Max: %s, Min: %s, Average: %s", max, min, average));
    }

    private static Float findAverage(Integer[] array) {
        List<Integer> integersList = Arrays.asList(array);
        Float sum = 0F;
        for (Integer integer : integersList) {
            sum = sum + integer;
        }

        return sum / integersList.size();
    }

    private static Integer findMin(Integer[] array) {
        List<Integer> integersList = Arrays.asList(array);
        return Collections.min(integersList);
    }

    private static Integer findMax(Integer[] array) {
        List<Integer> integersList = Arrays.asList(array);

        return Collections.max(integersList);
    }

}
