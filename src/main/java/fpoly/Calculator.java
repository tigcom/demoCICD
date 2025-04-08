package fpoly;

public class Calculator {
    public int add(int a, int b) {
        return 0;
    }

    public int subtract(int a, int b) {
        return 0;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Không thể chia cho 0");
        return a / b;
    }
}