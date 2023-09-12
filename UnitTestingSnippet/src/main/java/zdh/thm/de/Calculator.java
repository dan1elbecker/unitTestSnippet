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
     * @param mathService Ein MathService-Objekt, das für mathematische Operationen verwendet wird.
     */
    public Calculator(MathService mathService) {
        this.mathService = mathService;
    }

    /**
     * Addiert zwei Zahlen
     * @param a Die erste Zahl
     * @param b Die zweite Zahl
     * @return Die Summe der beiden Zahlen
     */
    public int add(int a, int b) {
        return mathService.add(a, b);
    }

    /**
     * Subtrahiert zwei Zahlen
     * @param a Die erste Zahl
     * @param b Die zweite Zahl
     * @return Die Differenz der beiden Zahlen
     */
    public int subtract(int a, int b) {
        return mathService.subtract(a, b);
    }

    /**
     * Multipliziert zwei Zahlen
     * @param a Die erste Zahl
     * @param b Die zweite Zahl
     * @return Das Produkt der beiden Zahlen
     */
    public int multiply(int a, int b) {
        return mathService.multiply(a, b);
    }

    /**
     * Dividiert zwei Zahlen
     * @param a Die Dividendenzahl (Zahl, die geteilt wird)
     * @param b Der Divisor (Zahl, durch die geteilt wird)
     * @return Das Ergebnis der Division
     */
    public int divide(int a, int b) {
        return mathService.divide(a, b);
    }

    /**
     * Quadriert eine Zahl
     * @param a Die Zahl, die quadriert werden soll
     * @return Das Quadrat der gegebenen Zahl
     */
    public int square(int a) {
        return mathService.square(a);
    }
}
