package sandbox;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {

  private final Calculator calc = new Calculator();

  @Test
  void add() {
    assertEquals(5, calc.add(2, 3));
  }

  @Test
  void subtract() {
    assertEquals(-1, calc.subtract(2, 3));
  }

  @Test
  void multiply() {
    assertEquals(6, calc.multiply(2, 3));
  }

  @Test
  void divideTruncates() {
    assertEquals(2, calc.divide(7, 3));
  }

  @Test
  void divideByZeroThrows() {
    assertThrows(ArithmeticException.class, () -> calc.divide(1, 0));
  }
}
