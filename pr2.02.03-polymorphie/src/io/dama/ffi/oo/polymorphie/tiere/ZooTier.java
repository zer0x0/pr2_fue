package io.dama.ffi.oo.polymorphie.tiere;

/**
 * Ein Tier im Zoo.
 */
public class ZooTier {

    /** Zeigt an, ob das Tier hungrig ist. */
    private boolean hungrig = true;

    /** Name des Tiers. */
    private final String name;

    /**
     * Legt ein neues Zootier an.
     *
     * @param name Name des Tiers
     */
    public ZooTier(final String name) {
        this.name = name;
    }

    /**
     * Gibt dem Tier futter.
     */
    public void fuettern() {
        this.hungrig = false;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.name + ": Ich bin " + (this.hungrig ? "hungrig" : "satt")
                + "!";
    }
}
