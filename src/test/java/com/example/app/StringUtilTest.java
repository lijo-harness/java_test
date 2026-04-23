package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void testUpperCase() {
        String input = "harness";
        assertEquals("HARNESS", input.toUpperCase());
    }

    @Test
    void testLength() {
        assertEquals(7, "harness".length());
    }
}
