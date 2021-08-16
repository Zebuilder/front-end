package io.zolaton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FrontEndTest 
{
    FrontEnd frontEnd = new FrontEnd();

    @Test
    public void testApp()
    {
        assertEquals("Hello world from FrontEnd", frontEnd.greet("world"));
    }

    @Test
    public void testTrue()
    {
        assertTrue( true );
    }
}
