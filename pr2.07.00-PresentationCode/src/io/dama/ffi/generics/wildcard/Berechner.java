package io.dama.ffi.generics.wildcard;

import io.dama.ffi.generics.Form;
import io.dama.ffi.generics.SimpleStack;

public class Berechner {
    public double berechneFlaeche(final SimpleStack<? extends Form> formen) {
        var summe = 0.0;

        for (var i = formen.getSize(); i >= 0; i--) {
            summe += formen.pop().flaeche();
        }

        return summe;
    }
}
