package sandbox;

/** 整数の四則演算。 */
public class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  /**
   * 整数の割り算（小数点以下は切り捨て）。
   *
   * @throws ArithmeticException b が 0 のとき
   */
  public int divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("0 で割ることはできません");
    }
    return a / b;
  }
}
