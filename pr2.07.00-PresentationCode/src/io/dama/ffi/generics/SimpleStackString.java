package io.dama.ffi.generics;

public class SimpleStackString {
    private final String[] stack;
    private int pos;

    public SimpleStackString(final int size) {
        this.stack = new String[size];
        this.pos = 0;
    }

    public void push(final String o) {
        this.stack[this.pos++] = o;
    }

    public String pop() {
        return this.stack[--this.pos];
    }
}
