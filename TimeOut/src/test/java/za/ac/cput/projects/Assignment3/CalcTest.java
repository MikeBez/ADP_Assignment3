package za.ac.cput.projects.Assignment3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    Calc calculator = new Calc();
    private int add;

    @Before
    public void setUp() throws Exception {
        add = calculator.addition(15,15);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test(timeout = 1000)
    public void addition(){
        assertEquals(30, add);
    }
}