package io.dama.ffi.generics;

public class Rechteck implements Form {
    private final double x;
    private final double y;

    public Rechteck(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double flaeche() {
        return this.x * this.y;
    }

}
