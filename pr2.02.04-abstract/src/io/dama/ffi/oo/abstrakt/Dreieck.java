package io.dama.ffi.oo.abstrakt;

/**
 * Ein Dreieck.
 */
public class Dreieck {

    /** Grundseite des Dreiecks. */
    private final double grundseite;

    /** Höhe. */
    private final double hoehe;

    /**
     * Erzeugt ein neues Dreieck.
     *
     * @param grundseite Grundseite.
     * @param hoehe      Höhe.
     */
    public Dreieck(final double grundseite, final double hoehe) {
        this.grundseite = grundseite;
        this.hoehe = hoehe;
    }

    /**
     * Berechnet die Fläche.
     *
     * @return die Fläche.
     */
    public double flaeche() {
        return (this.grundseite * this.hoehe) / 2;
    }
}
