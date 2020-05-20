package io.dama.ffi.generics.wildcard;

import java.util.ArrayList;

/**
 * Ausgabe der Liste.
 */
public final class Main {

    /**
     * Haupt-Methode.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(final String[] args) {
        final var l1 = new ArrayList<String>();
        l1.add("Dies");
        l1.add("ist");
        l1.add("ein");
        l1.add("Test");
        l1.add(".");

        final var l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);

        // TODO: Entkommentieren
        // ListHelper.printList(l1);
        // ListHelper.printList(l2);
        // System.out.println(ListHelper.sumList(l2));
    }
}
