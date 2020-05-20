package io.dama.ffi.generics.superextends;

import java.util.Iterator;

public class StackIterator<T> implements Iterator<T> {
    private T[] stack;
    private int pos;

    public StackIterator(T[] stack, int pos) {
        this.stack = stack;
        this.pos = pos;
    }

    public boolean hasNext() {
        return this.pos > 0;
    }

    public T next() {
        return this.stack[--this.pos];
    }
}
