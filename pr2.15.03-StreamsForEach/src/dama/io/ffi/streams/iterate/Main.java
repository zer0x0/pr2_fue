package dama.io.ffi.streams.iterate;

/**
 * Mitarbeiter auflisten.
 */
public class Main {

    public static void main(final String... args) {
        var db = new Database();

        var stream1 = db.getEmployeeStream();
        System.out.println();
        System.out.println("Alle Mitarbeiterinnen und Mitarbeiter:");

        var stream2 = db.getEmployeeStream();
        System.out.println();
        System.out.println("nur die Mitarbeiterinnen und Mitarbeiter, die 1972 geboren sind:");

    }
}
