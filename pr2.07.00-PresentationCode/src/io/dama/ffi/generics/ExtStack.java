package io.dama.ffi.generics;

public class ExtStack<T> extends SimpleStack<T> {
    public ExtStack(final int size) {
        super(size);
    }

    public T peek() {
        final T wert = pop();
        push(wert);
        return wert;
    }
}
