package model.snake;

import helper.Point;

/**
 * A factory class to create snakes of any length
 * 
 * @author David Gemen
 * @author Andriyan Lapychak
 */
public class SnakeFactory {

    /**
     * Creates a snake and returns it
     * 
     * @param tails the amount of desired tail element
     * @return the reference to the head of the snake and thus the snake itself
     */
    public static Head createSnake(int tails) {
        Head head = new Head(new Point(1, 1), null);
        Element last = head;
        for (int i = 0; i < tails; i++) {
            Element tail = new Tail(last, null);
            last.setNext(tail);
            last = tail;
        }
        return head;
    }
}
