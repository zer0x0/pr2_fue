package io.dama.ffi.collections.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Zählen von Worthäfigkeiten.
 */
public class WordCount {

    /**
     * Listet alle Worte in der Datei und deren Häufigkeit auf. Die
     * zurückgegebene Liste ist bereits nach der Häfuigkeit sortiert.
     *
     * @param filename Dateiname
     * @return die Liste der vorhandenen Wort
     * @throws IOException Fehler beim Dateizugriff.
     */
    private static List<WordFrequency> countWords(String filename)
            throws IOException {

        // TODO: Map deklarieren

        // Datei zum Lesen öffnen
        var reader = new BufferedReader(new FileReader(filename));

        var line = ""; // aktuelle Zeile

        // Über die Zeilen der Datei iterieren
        while ((line = reader.readLine()) != null) {

            // Sonderzeichen entfernen und die Zeilen in Worte splitten
            line = line.toLowerCase();
            line = line.replaceAll("[\",.:;\\)'\\-\\!?]", "");

            var words = line.toLowerCase().split("[,. ]");

            for (var word : words) {
                // TODO: Worthäufigkeiten in Map speichern
            }
        }

        reader.close();

        // TODO: Worthäufigkeiten aus der Map extrahieren und sortieren

        // TODO: Ergebnis zurückgeben
        return null;
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String... args) {
        try {
            var words = countWords("assets/kafka.txt");

            for (var word : words) {
                System.out.println(word);
            }
        } catch (IOException e) {
            System.err.println("Probleme beim Dateizugriff: " + e);
        }
    }
}
