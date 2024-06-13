package com.mycompany.app;  // Adjust this package name to match your project structure

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {
    @Test
    public void testSample() {
        String message = "Hello, Jenkins!";
        assertEquals("Hello, Jenkins!", message);
    }
}
