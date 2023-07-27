package model.snake;

import helper.Point;

/**
 * A element of the snake
 * 
 * @author David Gemen
 * @author Andriyan Lapychak
 */
public abstract class Element {

    private Point position;
    private Element previous;
    private Element next;
    private char symbol;

    /**
     * Constructor
     * 
     * @param position the position of the part
     * @param previous the predecessor of this element
     * @param next     the successor of the element
     * @param symbol   the symbol that represents this element
     */
    public Element(Point position, Element previous, Element next, char symbol) {
        this.position = position;
        this.previous = previous;
        this.next = next;
        this.symbol = symbol;
    }

    /**
     * Moves the element on by changing its position
     */
    public abstract void move();

    /**
     * Determines and returns the Element at a specific position
     * 
     * @param point the position where the element should be
     * @return the element at the position, null if there is none
     */
    public Element elementAt(Point point) {
        if (this.getPosition().equals(point)) {
            return this;
        }
        if (this.getNext() != null) {
            return this.getNext().elementAt(point);
        }
        return null;
    }

    /**
     * Appends a tail at the end of the snake using recursion
     */
    public void appendTail() {
        if (this.next == null) {
            this.next = new Tail(this, null);
        } else {
            this.next.appendTail();
        }
    }

    /**
     * Determines the length of the snake using recursion
     * 
     * @return the length of the snake
     */
    public int length() {
        if (this.next == null) {
            return 1;
        }
        return 1 + this.next.length();
    }

    /**
     * Getter of the elements position attribute
     * 
     * @return the position of this element
     */
    public Point getPosition() {
        return position;
    }

    /**
     * Setter of the elements position attribute
     * 
     * @param position the new positon of this element
     */
    public void setPosition(Point position) {
        this.position = position;
    }

    /**
     * Getter of the elements previous reference
     * 
     * @return the reference to the previous element
     */
    public Element getPrevious() {
        return previous;
    }

    /**
     * Getter of the elements next reference
     * 
     * @return the reference to the next element
     */
    public Element getNext() {
        return next;
    }

    /**
     * Setter of the elements next reference
     * 
     * @param next the elements new next element
     */
    public void setNext(Element next) {
        this.next = next;
    }

    /**
     * Getter of the elements representing symbol
     * 
     * @return the representing symbol
     */
    public char getSymbol() {
        return symbol;
    }
}
