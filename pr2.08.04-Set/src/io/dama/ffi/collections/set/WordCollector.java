package io.dama.ffi.collections.set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Klassen, um die in einem Text vorkommenen Wörter zu sammeln.
 */
public class WordCollector {

    /**
     * Listet alle Worte in der Datei alphabetisch auf. Duplikate werden
     * entfernt. Die Wörter werden in Kleinbuchstaben umgewandelt.
     *
     * @param filename Dateiname
     * @return die Liste der vorhandenen Wort
     * @throws IOException Fehler beim Dateizugriff.
     */
    public static String[] listWords(String filename) throws IOException {
        var allWords = readFileAndSplitIntoWords(filename);
        var result = removeDuplicates(allWords);

        return result;
    }

    /**
     * Listet alle Worte in der Datei auf.
     *
     * @param filename Dateiname
     * @return die Liste der vorhandenen Wort
     * @throws IOException Fehler beim Dateizugriff.
     */
    private static String[] readFileAndSplitIntoWords(String filename)
            throws IOException {

        // Datei zum Lesen öffnen
        var reader = new BufferedReader(new FileReader(filename));

        var line = ""; // aktuelle Zeile
        var wordBuffer = new String[100]; // Puffer für die Worte
        var pos = 0; // Position im Word-Puffer

        // Über die Zeilen der Datei iterieren
        while ((line = reader.readLine()) != null) {

            // Sonderzeichen entfernen und die Zeilen in Worte splitten
            line = line.replaceAll("[\",.:'\\-\\!?]", "");

            var words = line.toLowerCase().split("[,. ]");

            // Worte in den Puffer übertragen
            for (var word : words) {

                if (pos >= wordBuffer.length) {
                    // Puffer ist voll, vergrößern
                    var newBuffer = new String[wordBuffer.length * 2];
                    System.arraycopy(wordBuffer, 0, newBuffer, 0,
                            wordBuffer.length);
                    wordBuffer = newBuffer;
                }

                wordBuffer[pos++] = word;
            }
        }

        reader.close();

        // Ergebnis-Array mit der richtigen Größe anlegen
        var result = new String[pos];
        System.arraycopy(wordBuffer, 0, result, 0, pos);

        return result;
    }

    /**
     * Sortiert das übergebene Array alphabetisch und entfernt Duplikate.
     *
     * @param input Eingabe Array
     * @return sortiertes und bereinigtes Array
     */
    private static String[] removeDuplicates(String[] strings) {

        // Array sortieren
        Arrays.sort(strings);

        // Über die Einträge laufen
        for (var i = 0; i < strings.length; i++) {
            var word = strings[i];

            if (word == null) {
                // Bereits entfernter Eintrag
                continue;
            }

            // Über die Einträge laufen
            for (var k = i + 1; k < strings.length; k++) {
                var otherWord = strings[k];

                if (otherWord == null) {
                    // Bereits entfernter Eintrag
                    continue;
                }
                else if (otherWord.compareTo(word) > 0) {
                    // Sind schon hinter der möglichen Position
                    break;
                }
                else if (otherWord.equals(word)) {
                    // Duplikat, ausnullen
                    strings[k] = null;
                }
            }
        }

        // Ausgenullte Einträge entfernen
        var pos = 0;
        var temp = new String[strings.length];

        for (var string : strings) {
            if (string != null) {
                temp[pos++] = string;
            }
        }

        // Ergebnis auf die richtige Länge bringen
        var result = new String[pos];
        System.arraycopy(temp, 0, result, 0, pos);

        return result;
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String... args) {
        try {
            var words = listWords("assets/kafka.txt");
            System.out.println(Arrays.toString(words));
        } catch (IOException e) {
            System.err.println("Probleme beim Dateizugriff: " + e);
        }
    }
}
