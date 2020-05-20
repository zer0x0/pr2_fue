package io.dama.ffi.generics.wildcard;

import io.dama.ffi.generics.SimpleStack;

public class StackPrinter {
    public void printStack(final SimpleStack<?> stack) {
        for (var i = stack.getSize(); i > 0; i--) {
            System.out.printf("%d %s%n", i, stack.pop());
        }
    }

    public static void main(final String[] args) {
        final var stack1 = new SimpleStack<String>(10);
        stack1.push("Hello World");
        final var stack2 = new SimpleStack<Integer>(10);
        stack2.push(42);

        final var printer = new StackPrinter();
        printer.printStack(stack1);
        printer.printStack(stack2);

        final SimpleStack<?> wildcard1 = new SimpleStack<String>(10);
        final SimpleStack<?> wildcard2 = new SimpleStack<?>(10); // FEHLER!!

    }
}