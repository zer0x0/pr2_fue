package io.dama.ffi.generics.method;

public class ArrayHelper {
    public static boolean contains(final String[] array, final String other) {
        for (final var element : array) {
            if (other == null) {
                if (element == null) {
                    return true;
                }
            } else if (other.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(final Integer[] array, final Integer other) {
        for (final var element : array) {
            if (other == null) {
                if (element == null) {
                    return true;
                }
            } else if (other.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
