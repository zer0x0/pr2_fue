package io.dama.ffi.oo.abstrakt;

/**
 * Flächenberechnung.
 */
public final class Geometer {

    /** Keine Instanzen. */
    private Geometer() {
        // keine Objekte
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(final String[] args) {
        final var kreise = new Kreis[5];
        final var dreiecke = new Dreieck[5];

        kreise[0] = new Kreis(10.0);
        kreise[1] = new Kreis(5.5);
        kreise[2] = new Kreis(3.3);
        kreise[3] = new Kreis(7.2);
        kreise[4] = new Kreis(8.0);

        dreiecke[0] = new Dreieck(4.0, 3.0);
        dreiecke[1] = new Dreieck(2.0, 1.0);
        dreiecke[2] = new Dreieck(5.0, 8.0);
        dreiecke[3] = new Dreieck(2.0, 7.2);
        dreiecke[4] = new Dreieck(14.0, 3.8);

        var gesamtflaeche = 0.0;

        for (final var kreis : kreise) {
            gesamtflaeche += kreis.flaeche();
        }

        for (final var dreieck : dreiecke) {
            gesamtflaeche += dreieck.flaeche();
        }

        System.out.printf("Die Fläche beträgt: %.2f", gesamtflaeche);
    }
}
