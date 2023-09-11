package zdh.thm.de;

public interface MathService {
    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
    int divide(int a, int b) throws ArithmeticException;
    int square(int a);
}