package io.dama.ffi.generics;

public class SimpleStackInteger {
    private final Integer[] stack;
    private int pos;

    public SimpleStackInteger(final int size) {
        this.stack = new Integer[size];
        this.pos = 0;
    }

    public void push(final Integer o) {
        this.stack[this.pos++] = o;
    }

    public Integer pop() {
        return this.stack[--this.pos];
    }
}
