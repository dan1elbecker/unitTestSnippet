package zdh.thm.de;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
    private Calculator calculator;
    private MathService mathService;

    @Before
    public void setUp() {
        mathService = mock(MathService.class);
        calculator = new Calculator(mathService);
    }

    @Test
    public void testAdd() {
        when(mathService.add(2, 3)).thenReturn(5);
        when(mathService.add(5, -6)).thenReturn(-1);

        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(5, -6));
    }
}
