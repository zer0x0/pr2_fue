package io.dama.ffi.generics.superextends.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.dama.ffi.generics.superextends.Stack;

/**
 * Test für die Liste.
 */
public class TestListeSuperExtends {

    /**
     * Testet das Umkopieren.
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testAddAndClear() {
        final var stackVonStrings = new Stack<String>(10);
        var stackVonObjects = new Stack<>(10);

        stackVonStrings.push("Hallo");
        stackVonStrings.push("Hugo");
        stackVonStrings.push("Peter");
        stackVonStrings.push("Alfons");

        stackVonStrings.copyInto(stackVonObjects);

        assertEquals("Alfons", stackVonObjects.pop());
        assertEquals("Peter", stackVonObjects.pop());

        stackVonObjects = new Stack<>(10);
        stackVonObjects.fillFrom(stackVonStrings);

        assertEquals("Alfons", stackVonObjects.pop());
        assertEquals("Peter", stackVonObjects.pop());
        assertEquals("Hugo", stackVonObjects.pop());
        assertEquals("Hallo", stackVonObjects.pop());
        // es gibt nichts mehr für pop(), daher ArrayIndexOutOfBoundsException
        stackVonObjects.pop();
    }

    @Test
    public void compilerTest() {
        // Fehlerhaft: Sollte vom Compiler erkannt werden
        // Solange dies compilerbar ist, ist Ihre Lösung noch nicht gut genug.
        // Wenn dies nicht compilierbar ist, löschen Sie diese Methode.

        final var stackVonStrings = new Stack<String>(10);
        final var stackVonIntegern = new Stack<Integer>(10);
        stackVonStrings.push("Hallo");
        stackVonStrings.copyInto(stackVonIntegern);
        assertEquals("Hallo", stackVonIntegern.pop());
    }
}
