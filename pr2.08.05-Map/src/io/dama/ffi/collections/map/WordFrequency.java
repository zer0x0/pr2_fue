package io.dama.ffi.collections.map;

/**
 * Klasse für die Verwaltung der Worthäufigkeiten.
 */
// TODO: Sortierbar machen (Comparable)
public class WordFrequency {

    /** Das Wort. */
    private final String word;

    /** Seine Häufigkeit. */
    private int frequency;

    /**
     * Legt ein neues Objekt an.
     *
     * @param word      das gespeicherte Wort
     * @param frequency die Häufigkeit
     */
    WordFrequency(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    /**
     * Erhöht die Häufigkeit des Wortes.
     */
    public void incrementFrequency() {
        this.frequency++;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s: %d", this.word, this.frequency);
    }
}
