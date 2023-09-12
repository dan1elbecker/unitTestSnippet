package zdh.thm.de;

/**
 * Implementierung der MathService-Schnittstelle
 * Diese Klasse stellt mathematische Operationen bereit.
 * @version 1.0
 * @author Daniel Becker
 */
public class MathServiceImpl implements MathService {

    /**
     * Addiert zwei Zahlen.
     * @param a Die erste Zahl.
     * @param b Die zweite Zahl.
     * @return Die Summe der beiden Zahlen.
     */
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtrahiert zwei Zahlen.
     * @param a Die erste Zahl.
     * @param b Die zweite Zahl.
     * @return Die Differenz der beiden Zahlen.
     */
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multipliziert zwei Zahlen.
     * @param a Die erste Zahl.
     * @param b Die zweite Zahl.
     * @return Das Produkt der beiden Zahlen.
     */
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Dividiert zwei Zahlen.
     * @param a Die Dividendenzahl (Zahl, die geteilt wird).
     * @param b Der Divisor (Zahl, durch die geteilt wird).
     * @return Das Ergebnis der Division.
     * @throws ArithmeticException Wenn eine Division durch Null auftritt.
     */
    @Override
    public int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    /**
     * Berechnet das Quadrat einer Zahl.
     * @param a Die Zahl, deren Quadrat berechnet wird.
     * @return Das Quadrat der gegebenen Zahl.
     */
    @Override
    public int square(int a) {
        return a * a;
    }
}
