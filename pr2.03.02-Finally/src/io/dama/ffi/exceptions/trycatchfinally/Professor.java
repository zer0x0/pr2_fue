package io.dama.ffi.exceptions.trycatchfinally;

import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.AnimatedImage;
import de.smits_net.games.framework.sprite.AnimatedSprite;
import de.smits_net.games.framework.sprite.Direction;

/**
 * Ein Sprite.
 */
public class Professor extends AnimatedSprite {

    /** Geschwindigkeit der Figur in X-Richtung. */
    private static final int SPRITE_SPEED = 2;

    /**
     * Neues Sprite anlegen.
     *
     * @param board      das Spielfeld
     * @param startPoint Start-Position
     */
    public Professor(final Board board, final Point startPoint) {
        super(board, startPoint, BoundaryPolicy.NONE,
                new AnimatedImage(50, 9, "assets/professor_left"));
        this.velocity.setVelocity(Direction.WEST, Professor.SPRITE_SPEED);
    }

    @Override
    public void move() {
        super.move();

        if ((this.position.x <= -20)
                || (this.position.x >= (this.board.getWidth() - getWidth()))) {
            throw new OuchException();
        }
    }
}
