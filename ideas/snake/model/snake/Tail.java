package model.snake;

import helper.Point;

/**
 * The tails class of the snake
 * 
 * @author David Gemen
 * @author Andriyan Lapychak
 */
public class Tail extends Element {

    private static final char SYMBOL = 'O';

    /**
     * Constructor
     * 
     * @param previous the previous element of this tail
     * @param next     the next element of this tail
     */
    public Tail(Element previous, Element next) {
        super(new Point(previous.getPosition()), previous, next, SYMBOL);
    }

    @Override
    public void move() {
        if (this.getNext() != null) {
            this.getNext().move();
        }
        this.getPosition().setLocation(this.getPrevious().getPosition());
    }
}
