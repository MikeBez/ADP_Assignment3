package za.ac.cput.projects.Assignment3;

import static org.junit.Assert.assertTrue;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @BeforeClass
    public static void test1(){
        System.out.println("Method before class");
    }

    @AfterClass
    public static void test2(){
        System.out.println("Method after class");
    }

    @Ignore
    @Test
    public void test3(){
        System.out.println("Third test method");
    }

    @Ignore
    @Test
    public void test4(){
        System.out.println("Fourth test method");
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
