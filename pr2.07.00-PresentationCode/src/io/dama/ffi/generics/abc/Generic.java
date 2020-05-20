package io.dama.ffi.generics.abc;

public class Generic<T> {
    public void add(final T x) {
        /* ... */
    }

    public T get() {
        /* ... */
        return null; // hier nur deshalb null, damit es überhaupt ein return gibt
    }

    public void adder(final Generic<? super B> g) {
        g.add(new C());
        g.add(new B());
        g.add(new A()); // FEHLER!! könnte ein Generic<B> sein
        final B b = g.get(); // FEHLER!! könnte ein Generic<A> sein
    }

    public void getter(final Generic<? extends B> g) {
        final A a = g.get();
        final B b = g.get();
        final C c = g.get(); // FEHLER!! g könnte ein Generic<B> sein
        g.add(new B()); // FEHLER!! g könnte ein Generic<C> sein
    }

    public void doIt() {
        adder(new Generic<C>()); // FEHLER!! höchstens Generic<B> erlaubt
        adder(new Generic<B>());
        adder(new Generic<A>());

        getter(new Generic<C>());
        getter(new Generic<B>());
        getter(new Generic<A>()); // FEHLER!! mindestens Generic<B> benötigt
    }

}
