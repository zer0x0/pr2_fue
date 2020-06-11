package io.dama.ffi.lambda;

public interface Transformer<X> {
    X transform(X in);
}
