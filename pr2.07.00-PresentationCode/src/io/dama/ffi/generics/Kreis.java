package io.dama.ffi.generics;

public class Kreis implements Form {
    private final double r;

    public Kreis(final double r) {
        this.r = r;
    }

    @Override
    public double flaeche() {
        return Math.PI * this.r * this.r;
    }

}
