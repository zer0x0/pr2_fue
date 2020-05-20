package io.dama.ffi.generics.wildcard;

import io.dama.ffi.generics.Form;
import io.dama.ffi.generics.Kreis;
import io.dama.ffi.generics.Rechteck;
import io.dama.ffi.generics.SimpleStack;

public class FormenStack<T extends Form> extends SimpleStack<T> {
    public FormenStack(final int size) {
        super(size);
    }

    public double flaeche() {
        var summe = 0.0;

        for (var i = getSize(); i > 0; i--) {
            summe += pop().flaeche();
        }

        return summe;
    }

    public static void main(final String[] args) {
        final var s1 = new FormenStack<Kreis>(10);
        s1.push(new Kreis(0.4));
        s1.push(new Kreis(0.7));
        final var s2 = new FormenStack<Rechteck>(10);
        s2.push(new Rechteck(0.4, 0.4));
        s2.push(new Rechteck(0.7, 0.3));
        final var s3 = new FormenStack<>(10);
        s3.push(new Rechteck(0.4, 0.4));
        s3.push(new Rechteck(0.7, 0.3));
        s3.push(new Kreis(0.4));
        s3.push(new Kreis(0.7));
        System.out.printf("Gesamtfläche: %g%n", s1.flaeche());
        System.out.printf("Gesamtfläche: %g%n", s2.flaeche());
        System.out.printf("Gesamtfläche: %g%n", s3.flaeche());

    }
}
