package sandbox;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public final class StatisticsUtil {

    private StatisticsUtil() {
    }

    public static double median(List<Integer> values) {
        if (values == null || values.isEmpty()) {
            throw new IllegalArgumentException();
        }

        List<Integer> sortedValues = new ArrayList<>(values);
        Collections.sort(sortedValues);

        int size = sortedValues.size();
        if (size % 2 == 1) {
            return sortedValues.get(size / 2);
        } else {
            return (sortedValues.get(size / 2 - 1) + sortedValues.get(size / 2)) / 2.0;
        }
    }

}