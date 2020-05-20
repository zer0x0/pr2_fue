package io.dama.ffi.oo.factory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import de.smits_net.games.framework.board.Board;
import io.dama.ffi.oo.factory.figuren.Figur;
import io.dama.ffi.oo.factory.figuren.Lady;
import io.dama.ffi.oo.factory.figuren.Ninja;
import io.dama.ffi.oo.factory.figuren.Wizard;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {

    /** Figur, die durch das Bild läuft. */
    private final Figur[] figur = new Figur[10];

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(400, 400), Color.BLACK);

        // Figuren erzeugen
        for (var i = 0; i < this.figur.length; i++) {

            if ((i % 3) == 0) {
                this.figur[i] = new Lady(this);
            }
            else if ((i % 3) == 1) {
                this.figur[i] = new Ninja(this);
            }
            else { // i % 3 == 2
                this.figur[i] = new Wizard(this);
            }
        }
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public void drawGame(final Graphics g) {
        // Figuren zeichnen
        for (final var animatedSprite : this.figur) {
            animatedSprite.draw(g, this);
        }
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        for (final var animatedSprite : this.figur) {
            animatedSprite.move();
        }
        return true;
    }
}
