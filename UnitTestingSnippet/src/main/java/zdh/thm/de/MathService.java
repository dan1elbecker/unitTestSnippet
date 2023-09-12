package zdh.thm.de;

/**
 * MathService-Schnittstelle
 * Definiert mathematische Operationen, die von implementierenden Klassen bereitgestellt werden müssen.
 * @version 1.0
 * @author Daniel Becker
 */
public interface MathService {
    /**
     * Addiert zwei Zahlen.
     * @param a Die erste Zahl.
     * @param b Die zweite Zahl.
     * @return Die Summe der beiden Zahlen.
     */
    int add(int a, int b);

    /**
     * Subtrahiert zwei Zahlen.
     * @param a Die erste Zahl.
     * @param b Die zweite Zahl.
     * @return Die Differenz der beiden Zahlen.
     */
    int subtract(int a, int b);

    /**
     * Multipliziert zwei Zahlen.
     * @param a Die erste Zahl.
     * @param b Die zweite Zahl.
     * @return Das Produkt der beiden Zahlen.
     */
    int multiply(int a, int b);

    /**
     * Dividiert zwei Zahlen.
     * @param a Die Dividendenzahl (Zahl, die geteilt wird).
     * @param b Der Divisor (Zahl, durch die geteilt wird).
     * @return Das Ergebnis der Division.
     * @throws ArithmeticException Wenn eine Division durch Null auftritt.
     */
    int divide(int a, int b) throws ArithmeticException;

    /**
     * Berechnet das Quadrat einer Zahl.
     * @param a Die Zahl, deren Quadrat berechnet wird.
     * @return Das Quadrat der gegebenen Zahl.
     */
    int square(int a);
}
