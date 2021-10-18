package model.snake;

import helper.Point;

/**
 * The head of the snake, also representing the snake itself as it has
 * successive references to the tails
 * 
 * @author David Gemen
 * @author Andriyan Lapychak
 */
public class Head extends Element {

    private static final char SYMBOL = 'X';

    public static final int UP = 1;
    public static final int DOWN = 2;
    public static final int LEFT = 3;
    public static final int RIGHT = 4;
    private int direction = DOWN;
    // next direction must not overwrite the direction on key press because
    // otherwise it can not be evaluated if the next direction is valid or not
    private int nextDirection = DOWN;

    /**
     * Constructor
     * 
     * @param position the initial position of the snakes head
     * @param next     the successor (a tail) of the head
     */
    public Head(Point position, Element next) {
        super(position, null, next, SYMBOL);
    }

    @Override
    public void move() {
        this.getNext().move();

        switch (direction) {
            case UP:
                this.getPosition().translate(0, -1);
                break;
            case DOWN:
                this.getPosition().translate(0, 1);
                break;
            case LEFT:
                this.getPosition().translate(-1, 0);
                break;
            case RIGHT:
                this.getPosition().translate(1, 0);
                break;
        }
    }

    /**
     * Sets the direction to the buffered next direction
     */
    public void updateDirection() {
        this.direction = this.nextDirection;
    }

    /**
     * Sets the next direction if it is a valid direction
     * 
     * @param newDirection the desired next direction
     */
    public void setNextDirection(int newDirection) {
        if (isValidNextDirection(newDirection)) {
            this.nextDirection = newDirection;
        }
    }

    /**
     * Evaluates if the desired next direction is valid. The snake can not make a
     * 180° turn.
     * 
     * @param newDirection the desired next direction
     * @return true if the desired next direction is valie, false if not
     */
    private boolean isValidNextDirection(int newDirection) {
        int directionSum = newDirection + this.direction;
        return directionSum != UP + DOWN && directionSum != LEFT + RIGHT;
    }
}
