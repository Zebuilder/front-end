package io.zolaton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AIProcTest 
{
    AIProc aiProc = new AIProc();

    @Test
    public void testApp()
    {
        assertEquals("Hello world from AIProc", aiProc.greet("world"));
    }

    @Test
    public void testTrue()
    {
        assertTrue( true );
    }
}
