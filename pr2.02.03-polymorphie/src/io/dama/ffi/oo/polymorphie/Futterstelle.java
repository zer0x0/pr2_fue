package io.dama.ffi.oo.polymorphie;

import io.dama.ffi.oo.polymorphie.tiere.Affe;
import io.dama.ffi.oo.polymorphie.tiere.Giraffe;
import io.dama.ffi.oo.polymorphie.tiere.Gorilla;

/**
 * Fütterung der Tiere.
 */
public class Futterstelle {

    /**
     * Füttert den Affen.
     *
     * @param affe Affe, der gefüttert werden soll.
     */
    public void gibFutter(final Affe affe) {
        affe.fuettern();
    }

    /**
     * Füttert den Gorilla.
     *
     * @param gorilla Gorilla, der gefüttert werden soll.
     */
    public void gibFutter(final Gorilla gorilla) {
        gorilla.fuettern();
    }

    /**
     * Füttert die Giraffe.
     *
     * @param giraffe Giraffe, die gefüttert werden soll.
     */
    public void gibFutter(final Giraffe giraffe) {
        giraffe.fuettern();
    }
}
