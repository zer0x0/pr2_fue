package io.dama.ffi.generics;

public class FormStack extends SimpleStack<Form> {
    public FormStack(final int size) {
        super(size);
    }

    public Form peek() {
        final Form wert = pop();
        push(wert);
        return wert;
    }
}
