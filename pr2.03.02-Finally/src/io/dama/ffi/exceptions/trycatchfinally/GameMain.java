package io.dama.ffi.exceptions.trycatchfinally;

import java.awt.EventQueue;

import de.smits_net.games.framework.board.MainWindow;

/**
 * Hauptklasse des Spiels.
 */
public class GameMain extends MainWindow {

    /**
     * Neues Spiel anlegen.
     */
    public GameMain() {
        super("Watch me walk...", new GameBoard());
    }

    /**
     * Startpunkt.
     *
     * @param args command line arguments.
     */
    public static void main(final String[] args) {
        // Spiel starten
        EventQueue.invokeLater(GameMain::new);
    }
}
