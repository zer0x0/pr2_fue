package io.dama.ffi.generics;

public class SimpleStack<T> {
    private final T[] stack;
    private int pos;

    @SuppressWarnings("unchecked")
    public SimpleStack(final int size) {
        this.stack = (T[]) new Object[size];
        this.pos = 0;
    }

    public void push(final T o) {
        this.stack[this.pos++] = o;
    }

    public T pop() {
        return this.stack[--this.pos];
    }

    public int getSize() {
        return this.pos;
    }

    public static void main(final String[] args) {
        final var stack1 = new SimpleStack<String>(10);
        stack1.push("Hello");
        String s1 = stack1.pop();
        System.out.println(s1);

        stack1.push(42); // FEHLER (Compile-Time)!!
        s1 = stack1.pop();
        System.out.println(s1);

        final var stack2 = new SimpleStack(10);
        stack2.push("Hello");
        var s2 = stack2.pop();
        System.out.println(s2);

        stack2.push(42);
        s2 = stack2.pop();
        System.out.println(s2);

        final var x = new SimpleStack<String>(4);
        final var y = new SimpleStack<Integer>(4);
        final var z = new SimpleStack(4);

        System.out.println(x.getClass());
        System.out.println(y.getClass());
        System.out.println(z.getClass());
    }
}
