package io.dama.ffi.generics;

public class Zusammenfasser {
    public static <T> SimpleStack<T> fasseZusammen(final SimpleStack<T> s1, final SimpleStack<T> s2) {

        final var erg = new SimpleStack<T>(s1.getSize() + s2.getSize());

        for (var i = s1.getSize(); i > 0; i--) {
            erg.push(s1.pop());
        }

        for (var i = s2.getSize(); i > 0; i--) {
            erg.push(s2.pop());
        }

        return erg;
    }

    public static void main(final String[] args) {
        final var stack1 = new SimpleStack<String>(10);
        stack1.push("Hello");
        stack1.push("World");

        final var stack2 = new SimpleStack<String>(10);
        stack2.push("!");

        final var ergebnis = Zusammenfasser.fasseZusammen(stack1, stack2);
    }
}
