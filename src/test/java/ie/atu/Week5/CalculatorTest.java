package ie.atu.Week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator myCount;
    @BeforeEach
    void setUp() {
        myCount = new Calculator();
    }
    @Test
    void testAdd(){
        assertEquals(1, myCount.add());
    }

    @Test
    void testSub(){
        assertEquals(-1, myCount.sub());
    }

    @Test
    void testMultiply(){
        assertEquals(16, myCount.multi(4,4));
    }

    @Test
    void testDivide(){
        assertEquals(2, myCount.divide(4,2));
    }

    @Test
    void testConstructor(){
        Exception exMessage = assertThrows(IllegalAccessException.class, () -> {new Calculator(4);});
        assertEquals("This is not a valid numner", exMessage);
    }
    @AfterEach
    void tearDown() {
    }
}