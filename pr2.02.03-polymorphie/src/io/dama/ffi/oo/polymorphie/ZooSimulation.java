package io.dama.ffi.oo.polymorphie;

import io.dama.ffi.oo.polymorphie.tiere.Affe;
import io.dama.ffi.oo.polymorphie.tiere.Giraffe;
import io.dama.ffi.oo.polymorphie.tiere.Gorilla;

/**
 * Simulationsklasse.
 */
public final class ZooSimulation {

    /**
     * Konstruktor.
     */
    private ZooSimulation() {
        // keine Objekte benötigt
    }

    /**
     * Main-Methode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(final String[] args) {
        final var futterstelle = new Futterstelle();

        final var charlie = new Affe("Charlie");
        final var buck = new Gorilla("Buck");
        final var debbie = new Giraffe("Debbie");

        System.out.println(charlie);
        System.out.println(buck);
        System.out.println(debbie);

        System.out.println("Fütterung...");

        futterstelle.gibFutter(charlie);
        futterstelle.gibFutter(buck);
        futterstelle.gibFutter(debbie);

        System.out.println(charlie);
        System.out.println(buck);
        System.out.println(debbie);
    }
}
