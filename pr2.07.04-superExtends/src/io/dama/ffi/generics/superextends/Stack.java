package io.dama.ffi.generics.superextends;

import java.util.Iterator;

/**
 * Eine einfache, naive Stack Implementierung, die Objekte vom Typ T oder von
 * Subtypen von T speichert.
 *
 */
public class Stack<T> implements Iterable<T> {

    private final T[] stack;
    private int pos;

    /**
     * Legt einen neuen Stack mit der gegebenen Größe an.
     *
     * @param size Größe des Stacks.
     */
    @SuppressWarnings("unchecked")
    public Stack(final int size) {
        this.stack = (T[]) new Object[size];
        this.pos = 0;
    }

    /**
     * Fügt dem Stack ein neues Element hinzu.
     *
     * @param element Element, das hinzugefügt werden soll.
     */
    public void push(final T element) {
        this.stack[this.pos++] = element;
    }

    /**
     * Holt das oberste Element und entfernt es.
     *
     * @return das oberste Element
     */
    public T pop() {
        return this.stack[--this.pos];
    }

    /**
     * Gibt das oberste Element zurück, ohne es zu entfernen.
     *
     * @return das oberste Element
     */
    public T peek() {
        return this.stack[this.pos - 1];
    }

    /**
     * Erzeugt einen Iterator.
     *
     * @return Iterator
     * @see java.lang.Iterable#iterator()
     */
    @Override
    public Iterator<T> iterator() {
        return new StackIterator<>(this.stack, this.pos);
    }

    /**
     * Kopiert alle Elemente dieses Stacks auf den anderen Stack.
     *
     * @param other der andere Stack.
     */
    public void copyInto(final Stack other) {
        // TODO: Signatur dieser Methode verbessern (generischer Typ für other)
        for (var i = 0; i < this.pos; i++) {
            other.push(this.stack[i]);
        }
    }

    /**
     * Füllt diesen Stack mit dem Inhalt des übergebenen Stacks.
     *
     * @param other der andere Stack.
     */
    public void fillFrom(final Stack other) {
        // TODO: Signatur dieser Methode verbessern (generischer Typ für other)
        other.copyInto(this);
    }

}
