public class Calculator {
    public int power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent cannot be negative");
        }
        return (int) Math.pow(base, exponent);
    }
}
