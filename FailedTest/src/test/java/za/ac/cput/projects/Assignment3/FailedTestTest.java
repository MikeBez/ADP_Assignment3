package za.ac.cput.projects.Assignment3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FailedTestTest {

    FailedTest firstName = new FailedTest();
    String name;

    @Before
    public void setUp() throws Exception {
        name = firstName.fname("Brandon");
    }

    @After
    public void tearDown() throws Exception{
    }

    @Test
    public void answer (){
        String answer = "Branzon";

        assertEquals(answer, name);
    }
}