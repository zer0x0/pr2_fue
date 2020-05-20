package io.dama.ffi.collections.iterator;

/**
 * Eine einfache, naive Stack Implementierung, die Strings speichert.
 *
 */
public class StringStack {

    private final String[] stack;
    private int pos;

    /**
     * Legt einen neuen Stack mit der gegebenen Größe an.
     *
     * @param size Größe des Stacks.
     */
    public StringStack(int size) {
        this.stack = new String[size];
        this.pos = 0;
    }

    /**
     * Fügt dem Stack ein neues Element hinzu.
     *
     * @param s Element, das hinzugefügt werden soll.
     */
    public void push(String s) {
        this.stack[this.pos++] = s;
    }

    /**
     * Holt das oberste Element und entfernt es.
     *
     * @return das oberste Element
     */
    public String pop() {
        return this.stack[--this.pos];
    }

    /**
     * Gibt das oberste Element zurück, ohne es zu entfernen.
     *
     * @return das oberste Element
     */
    public String peek() {
        return this.stack[this.pos - 1];
    }

}
