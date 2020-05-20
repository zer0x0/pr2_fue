package io.dama.ffi.exceptions.handledeclare;

/**
 * Ausnahme, wenn die Statisitk nicht konsistent ist.
 */
@SuppressWarnings("serial")
public class StatistikException extends Exception {

    /**
     * Legt eine neue Ausnahme an.
     */
    public StatistikException() {
    }

    /**
     * Legt eine neue Ausnahme an.
     *
     * @param message die Nachricht.
     */
    public StatistikException(final String message) {
        super(message);
    }

    /**
     * @see java.lang.Throwable#toString()
     */
    @Override
    public String toString() {
        return getMessage();
    }
}
