package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UpperCaseTest {
    UpperCase u = new UpperCase();

    @Test
    public void testSomething() {
        assertEquals("HELLO",u.MakeUpperCase("hello"));
    }
}
