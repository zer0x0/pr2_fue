package io.dama.ffi.generics;

public class StackPrinter<T> {
    public void printStack(final SimpleStack<T> stack) {
        for (var i = stack.getSize(); i > 0; i--) {
            System.out.printf("%d %s%n", i, stack.pop());
        }
    }

    public static void main(final String[] args) {
        final var stack1 = new SimpleStack<String>(10);
        stack1.push("Hello World");
        final var stack2 = new SimpleStack<Integer>(10);
        stack2.push(42);

        final var printerString = new StackPrinter<String>();
        printerString.printStack(stack1);
        final var printerInteger = new StackPrinter<Integer>();
        printerInteger.printStack(stack2);
    }
}