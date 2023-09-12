package zdh.thm.de;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * JUnit-Testklasse für die Calculator-Klasse unter Verwendung von Mockito.
 * @version 1.0
 * @author Daniel Becker
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
    private Calculator calculator;
    private MathService mathService;

    /**
     * Initialisierungsmethode, die vor jedem Testfall aufgerufen wird.
     * Hier wird ein Mock-Objekt für MathService erstellt und der Calculator damit initialisiert.
     */
    @Before
    public void setUp() {
        mathService = mock(MathService.class);
        calculator = new Calculator(mathService);
    }

    /**
     * Testfall für die add-Methode des Calculators.
     * Hier werden Mock-Ergebnisse für mathService.add festgelegt und die add-Methode des Calculators getestet.
     */
    @Test
    public void testAdd() {
        // Festlegen von Mock-Ergebnissen für mathService.add
        when(mathService.add(2, 3)).thenReturn(5);
        when(mathService.add(5, -6)).thenReturn(-1);
        when(mathService.add(6, 0)).thenReturn(6);

        // Überprüfung der add-Methode des Calculators
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(5, -6));
        assertEquals(6, calculator.add(6, 0));
    }
}
