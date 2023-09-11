package zdh.thm.de;

/**
 * Calculator-Klasse
 * Führt mathematische Operationen aus
 * @version 1.0
 * @author Daniel Becker
 */
public class Calculator {
    private MathService mathService;

    /**
     * Konstruktor
     * @param mathService
     */

    public Calculator(MathService mathService) {
        this.mathService = mathService;
    }

    /**
     * Addiert zwei Zahlen
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        return mathService.add(a, b);
    }

    /**
     * Subtrahiert zwei Zahlen
     * @param a
     * @param b
     * @return
     */
    public int subtract(int a, int b) {
        return mathService.subtract(a, b);
    }

    /**
     * Multipliziert zwei Zahlen
     * @param a
     * @param b
     * @return
     */
    public int multiply(int a, int b) {
        return mathService.multiply(a, b);
    }

    /**
     * Dividiert zwei Zahlen
     * @param a
     * @param b
     * @return
     */
    public int divide(int a, int b) {
        return mathService.divide(a, b);
    }

    /**
     * Quadriert eine Zahl
     * @param a
     * @return
     */
    public int square(int a) {
        return mathService.square(a);
    }
}
