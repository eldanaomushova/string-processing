import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {
    private StringProcessor stringProcessor;

    //setting up
    @BeforeEach
    void setUp() {
        stringProcessor = new StringProcessor();
    }

    @Test
    void isStrongPassword() {
        assertTrue(stringProcessor.isStrongPassword("Eldana.8"));//assertTrue-should evaluate to true
        assertFalse(stringProcessor.isStrongPassword("Eldana"));//assertFalse-should evaluate to true
        //a
    }

    @Test
    void calculateDigits() {
        assertEquals(8, stringProcessor.calculateDigits("Eldana8."));//check for equality
        assertEquals(9, stringProcessor.calculateDigits("WordExcel"));
    }

    @Test
    void calculateWords() {
        assertEquals(5, stringProcessor.calculateWords("Press Shift twice to open"));
        assertEquals(4, stringProcessor.calculateWords("Press Shift to open"));
    }

    @Test
    void calculateExpression() {
        assertEquals(40, stringProcessor.calculateExpression("10 * 3 + 10"));
        assertEquals(31, stringProcessor.calculateExpression("21 + 10"));

    }
    @Test
    void calculateExpressionDivisionByZero() {
        try {
            stringProcessor.calculateExpression("10 / 0");
            fail("Expected an ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            assertEquals("Error, division by zero!", e.getMessage());
        } // check if division by zero
    }

}