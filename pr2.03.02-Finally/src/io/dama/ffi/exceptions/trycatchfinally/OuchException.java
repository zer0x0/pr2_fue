package io.dama.ffi.exceptions.trycatchfinally;

/**
 * Exception, die geworfen wird, wenn die Figur an den Rand stößt.
 */
@SuppressWarnings("serial")
public class OuchException extends RuntimeException {

    /**
     * Neue Ausnahme.
     */
    public OuchException() {
    }

    /**
     * Neue Ausnahme mit Meldung.
     *
     * @param message Meldung.
     */
    public OuchException(final String message) {
        super(message);
    }
}
