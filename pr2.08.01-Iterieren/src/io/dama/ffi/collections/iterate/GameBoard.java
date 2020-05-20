package io.dama.ffi.collections.iterate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.sprite.Sprite;

/**
 * Spielfeld.
 */
@SuppressWarnings("serial")
public class GameBoard extends Board {

    /** Anzahl der Münzen. */
    private static final int NUM_COINS = 1000;

    /** Münzgenerator. */
    private final CoinGenerator generator;
    private final Sprite[] coins = new Sprite[NUM_COINS];

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(600, 600), Color.BLACK);

        this.generator = new CoinGenerator(this, NUM_COINS);

        // TODO: Münzen generieren
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public synchronized void drawGame(Graphics g) {
        // TODO: Münzen zeichnen
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        return true;
    }
}
