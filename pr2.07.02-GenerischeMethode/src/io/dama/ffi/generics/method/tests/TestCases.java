package io.dama.ffi.generics.method.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.dama.ffi.generics.method.ArrayHelper;

public class TestCases {

    @Test
    public void testContainsNoNull() {
        final var strings = new String[] { "AB", "BC", "CD", "AE" };
        assertEquals(true, ArrayHelper.contains(strings, "CD"));
        assertEquals(false, ArrayHelper.contains(strings, "CDE"));
        assertEquals(false, ArrayHelper.contains(strings, null));
    }

    @Test
    public void testContainsNull() {
        final var strings = new String[] { "AB", null, "CD", "AE" };
        assertEquals(true, ArrayHelper.contains(strings, "CD"));
        assertEquals(false, ArrayHelper.contains(strings, "CDE"));
        assertEquals(true, ArrayHelper.contains(strings, null));
    }

    @Test
    public void testContainsInts() {
        final var ints = new Integer[] { 1, 2, 3, 4 };
        assertEquals(false, ArrayHelper.contains(ints, 42));
        assertEquals(true, ArrayHelper.contains(ints, 2));
    }

}
