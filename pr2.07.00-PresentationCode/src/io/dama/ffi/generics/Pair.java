package io.dama.ffi.generics;

public class Pair<T, V> {
    private final T o1;
    private final V o2;

    public Pair(final T o1, final V o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public T o1() {
        return this.o1;
    }

    public V o2() {
        return this.o2;
    }
}
