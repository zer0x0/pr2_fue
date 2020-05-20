package io.dama.ffi.io.serialization;

import java.io.Serializable;

/**
 * Ein Dame-Brett.
 */
@SuppressWarnings("serial")
public class Board implements Serializable {

    /** Belegung des Brettes. */
    private final Color[][] brett = new Color[8][8];

    /**
     * Setzt einen Stein an die gegebene Koordinate.
     *
     * @param koordinate Koordinate in "a1"-Notation.
     * @param farbe      Fabe des Spielsteins.
     */
    public void set(final String koordinate, final Color farbe) {
        final var t = parseCoordinates(koordinate);
        this.brett[t.x][t.y] = farbe;
    }

    /**
     * Tupel von zwei int-Werten.
     */
    private static class Tupel {
        int x;
        int y;
    }

    /**
     * Wandelt textuelle Koordinaten in x- und y-Wert um.
     *
     * @param koordinate Koordinate als String.
     * @return Koordinate als Integer-Tupel.
     */
    private Tupel parseCoordinates(final String koordinate) {
        final var buchstabe = koordinate.toLowerCase().charAt(0);
        final var zahl = koordinate.charAt(1);

        final var t = new Tupel();

        t.y = buchstabe - 'a';
        t.x = zahl - '1';

        if ((t.x < 0) || (t.x > 7)) {
            throw new IllegalArgumentException();
        }

        if ((t.y < 0) || (t.y > 7)) {
            throw new IllegalArgumentException();
        }

        return t;
    }

    /**
     * Schreibt den Inhalt des Spielfeldes (Color[8][8] brett) in eine Datei.
     *
     * @param file Dateiname.
     */
    public void writeToFile(final String file) {
        // TODO: Serialisierung nach file
        // Exceptions sollen deklariert werden
    }

    /**
     * Liest den Inhalt (Color[8][8] brett) aus einer Datei.
     *
     * @param file Dateipfad.
     * @return das gelesene Spielfeld
     */
    public static Board loadFromFile(final String file) {
        final Board result = null;
        // TODO: Deserialisierung aus file
        // Exceptions sollen deklariert werden
        return result;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        final var result = new StringBuilder();

        var y = '1';

        result.append(" ");
        for (final var c : "abcdefgh".toCharArray()) {
            result.append(' ').append(c);
        }

        result.append("\n");

        for (final var figurs : this.brett) {

            result.append(y++);

            for (final var figur : figurs) {
                if (figur != null) {
                    result.append(' ').append(figur);
                }
                else {
                    result.append("  ");
                }
            }

            result.append("\n");
        }

        return result.toString();
    }
}
