import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    @Test
    void testPower() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.power(2, 3));
        assertEquals(1, calculator.power(5, 0));
        assertThrows(IllegalArgumentException.class, () -> calculator.power(2, -1));
    }
}
