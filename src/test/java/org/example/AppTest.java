package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldAnswerWithFalse()
    {
        assertFalse( false );
    }

    @Test
    public void shouldReturnSum()
    {
        App app1 = new App();
        assertEquals(app1.testSum(2, 2), 4);
        assertEquals(app1.testSum(-1, 2), 1);
        assertEquals(app1.testSum(9, 2), 11);
    }

    @Test
    public void shouldReturnSum2()
    {
        App app1 = new App();
        assertEquals(app1.testSum(2, 2), 5);
        assertEquals(app1.testSum(-1, 2), 2);
        assertEquals(app1.testSum(12, 2), 11);
    }
}
