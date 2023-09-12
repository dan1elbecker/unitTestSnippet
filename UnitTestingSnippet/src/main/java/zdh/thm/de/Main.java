package zdh.thm.de;

/**
 * Hauptklasse für die Ausführung von mathematischen Operationen mit dem Calculator-Objekt.
 * @version 1.0
 * @author Daniel Becker
 */
public class Main {
    public static void main(String[] args) {
        // Erstellen einer MathService-Implementierung (z.B. MathServiceImpl)
        MathService mathService = new MathServiceImpl();

        // Erstellen eines Calculator-Objekts mit der MathService-Implementierung
        Calculator calculator = new Calculator(mathService);

        // Verwenden Sie den Calculator, um mathematische Operationen durchzuführen
        int resultAdd = calculator.add(5, 3);
        int resultSubtract = calculator.subtract(10, 4);
        int resultMultiply = calculator.multiply(6, 2);
        int resultDivide = calculator.divide(8, 2);
        int resultSquare = calculator.square(5);

        // Ausgabe der Ergebnisse
        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraktion: " + resultSubtract);
        System.out.println("Multiplikation: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
        System.out.println("Quadrat: " + resultSquare);
    }
}
