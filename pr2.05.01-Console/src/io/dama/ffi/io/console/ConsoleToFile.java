package io.dama.ffi.io.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Liest einen Text von der Console und schreibt ihn dann in eine Datei.
 * Allerdings erfolgt das Schreiben über eine Ausgabeumleitung und nicht über
 * Dateioperationen.
 */
public class ConsoleToFile {

    /** Logfile für Ausgaben. */
    private static final String LOGFILE = "output/console.log";

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeile-Argumente.
     * @throws IOException
     */
    public static void main(final String[] args) throws IOException {
        final var r = new BufferedReader(new InputStreamReader(System.in));
        final var out = new PrintStream(ConsoleToFile.LOGFILE);
        var line = "";
        var lineNumber = 1;
        while ((line = r.readLine()) != null) {
            System.err.println(lineNumber++);
            System.out.println(line);
            out.println(line);
        }
        out.close();
    }
}
