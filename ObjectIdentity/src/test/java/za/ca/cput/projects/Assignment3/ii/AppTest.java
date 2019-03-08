package za.ca.cput.projects.Assignment3.ii;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private String name,surname;
    App person = new App();

    @Before
    public void setUp() throws  Exception{
        name = person.name("Michael");
        surname = person.surname("Bezuidenhout");
    }

    @After
    public void tearDown() throws Exception{
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void name()
    {
        String nameString = "Michael";
        assertSame(nameString, name);
    }

    @Test
    public void surName()
    {
        String surNameString = "Bezuidenhout";
        assertSame(surNameString,surname);
    }


}
