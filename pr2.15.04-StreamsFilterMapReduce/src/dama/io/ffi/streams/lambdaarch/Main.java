package dama.io.ffi.streams.lambdaarch;

/**
 * Mitarbeiter auflisten.
 */
public class Main {

    public static void main(final String... args) {
        var db = new Database();

        var stream1 = db.getEmployeeStream();
        System.out.println();
        System.out.println("Alter aller lizensierten Mitarbeiterinnen und Mitarbeiter:");

        var stream2 = db.getEmployeeStream();
        System.out.println();
        System.out.println("Summe aller IDs der lizensierten Mitarbeiterinnen und Mitarbeiter:");

    }
}
