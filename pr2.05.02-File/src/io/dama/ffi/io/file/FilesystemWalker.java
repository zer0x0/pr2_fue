package io.dama.ffi.io.file;

import java.io.File;
import java.io.IOException;

/**
 * Klasse, die das Datesystem durchläuft und Informationen ausgibt.
 */
public class FilesystemWalker {

    /**
     * Haupt-Methode.
     *
     * @param args Kommandozeilen-Argumente.
     * @throws IOException IO-Probleme
     */
    public static void main(final String[] args) throws IOException {

        final var path = args.length > 0 ? args[0] : "../";

        final var root = new File(path).getCanonicalFile();

        System.out.println("Untersuche: " + root);
        System.out.println();

        final var total = FilesystemWalker.walk(root);

        System.out.println();
        System.out.println("Gesamtgröße: " + FilesystemWalker.niceSize(total));
    }

    /**
     * Rekursive Methode, um den Baum zu durchlaufen.
     *
     * @param file Verzeichnis, bei dem gestartet werden soll.
     * @return die Größe des Verzeichnisses.
     */

    private static long walk(final File file)
            throws IOException, IllegalArgumentException {
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " ist kein Verzeichnis.");
        }
        final var size = 0;
        final var files = file.listFiles();

        for (final var f : files) {
            if (f.isDirectory()) {
                // Rekursion
            }
            else {
                // Rekursionsanker
            }
        }
        return size;

    }

    /**
     * Wandelt die Größe in eine schönere Darstellung um.
     *
     * @param size Die Größe.
     * @return Schönere Darstellung.
     */
    private static String niceSize(final long size) {
        if (size > 1000_000L) {
            return String.format("%.1f MByte", size / 1024.0 / 1024.0);
        }
        else if (size > 1000L) {
            return String.format("%.1f kByte", size / 1024.0);
        }
        else {
            return String.format("%d Byte", size);
        }
    }
}
