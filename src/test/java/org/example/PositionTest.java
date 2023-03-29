package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PositionTest {
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", Position.position('a'));
        assertEquals("Position of alphabet: 26", Position.position('z'));
        assertEquals("Position of alphabet: 5", Position.position('e'));
    }
}
