package sandbox;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

public class StatisticsUtilTest {

    @Test
    public void testMedian_odd() {
        assertEquals(2.0, StatisticsUtil.median(List.of(3, 1, 2)));
    }

    @Test
    public void testMedian_even() {
        assertEquals(2.5, StatisticsUtil.median(List.of(4, 1, 3, 2)));
    }

    @Test
    public void testMedian_null() {
        assertThrows(IllegalArgumentException.class, () -> {
            StatisticsUtil.median(null);
        });
    }

    @Test
    public void testMedian_empty() {
        assertThrows(IllegalArgumentException.class, () -> {
            StatisticsUtil.median(List.of());
        });
    }

}