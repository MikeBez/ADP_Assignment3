package za.ac.cput.projects.Assignment3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    Calculate calculation = new Calculate();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void multiply() {
        int answer = calculation.multiply(20, 5);
        assertEquals(100, answer);
    }

    @Test
    public void divide() {
        int answer = calculation.divide(20, 5);
        assertEquals(4, answer);
    }
}