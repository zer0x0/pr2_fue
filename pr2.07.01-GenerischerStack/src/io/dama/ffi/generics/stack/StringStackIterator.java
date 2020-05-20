package io.dama.ffi.generics.stack;

import java.util.Iterator;

public class StringStackIterator implements Iterator<String> {
    private final String[] stack;
    private int pos;

    public StringStackIterator(final String[] stack, final int pos) {
        this.stack = stack;
        this.pos = pos;
    }

    @Override
    public boolean hasNext() {
        return this.pos > 0;
    }

    @Override
    public String next() {
        return this.stack[--this.pos];
    }
}
