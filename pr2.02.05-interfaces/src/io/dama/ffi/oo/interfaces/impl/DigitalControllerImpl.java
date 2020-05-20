package io.dama.ffi.oo.interfaces.impl;

import java.awt.Point;

import io.dama.ffi.oo.interfaces.api.DigitalController;

/**
 * Implementierung eines digitalen Joysticks.
 */
public class DigitalControllerImpl implements DigitalController {

    private Point position = new Point(0, 0);

    /**
     * @see io.dama.ffi.oo.interfaces.api.DigitalController#up()
     */
    @Override
    public void up() {
        this.position.translate(0, -1);
    }

    /**
     * @see io.dama.ffi.oo.interfaces.api.DigitalController#down()
     */
    @Override
    public void down() {
        this.position.translate(0, 1);
    }

    /**
     * @see io.dama.ffi.oo.interfaces.api.DigitalController#left()
     */
    @Override
    public void left() {
        this.position.translate(-1, 0);
    }

    /**
     * @see io.dama.ffi.oo.interfaces.api.DigitalController#right()
     */
    @Override
    public void right() {
        this.position.translate(1, 0);
    }

    /**
     * @see io.dama.ffi.oo.interfaces.api.DigitalController#getPosition()
     */
    @Override
    public Point getPosition() {
        return (Point) this.position.clone();
    }
}
