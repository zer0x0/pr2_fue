package io.dama.ffi.exceptions.trycatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Ein simples Zahlenraten-Spiel.
 */
public final class Zahlenraten {

    /**
     * Liest einen String von der Tastatur.
     *
     * @return der gelesene String
     * @throws IOException Probleme mit der Console
     */
    private static String readNumber() throws IOException {
        final var br = new BufferedReader(new InputStreamReader(System.in));
        final var input = br.readLine();
        return input;
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente
     * @throws NumberFormatException Fehler bei der Zahlenkovertierung
     * @throws IOException           I/O-Fehler
     */
    public static void main(final String[] args)
            throws NumberFormatException, IOException {

        // zu ratende Zahl bestimmen
        final var zahl = new Random().nextInt(100) + 1;

        var versuche = 0;

        while (true) {
            System.out.print("Bitte geben Sie eine Zahl ein: ");
            final var geraten = Integer.parseInt(Zahlenraten.readNumber());
            versuche++;

            if (geraten < zahl) {
                System.out.println("Zu niedrig");
            }
            else if (geraten > zahl) {
                System.out.println("Zu hoch.");
            }
            else {
                System.out.printf("Richtig in %d Versuchen", versuche);
                break;
            }
        }
    }
}
