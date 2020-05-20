package io.dama.ffi.generics;

public class SimpleStackObject {

    private final Object[] stack;
    private int pos;

    public SimpleStackObject(final int size) {
        this.stack = new Object[size];
        this.pos = 0;
    }

    public void push(final Object o) {
        this.stack[this.pos++] = o;
    }

    public Object pop() {
        return this.stack[--this.pos];
    }

    public static void main(final String[] args) {
        final var stack1 = new SimpleStackObject(10);
        stack1.push("Hello");
        String s1 = (String) stack1.pop();
        System.out.println(s1);

        stack1.push(42);
        s1 = (String) stack1.pop(); // FEHLER (Runtime)!!
        System.out.println(s1);

        final var stack2 = new SimpleStack(10);
        stack2.push("Hello");
        var s = stack2.pop();
        System.out.println(s);

        stack2.push(42);
        s = stack2.pop();
        System.out.println(s);

    }

}
