package ideas.snake.helper;

/**
 * A helper class containing coordinates
 * 
 * @author David Gemen
 * @author Andriyan Lapychak
 */
public class Point {
    private int x;
    private int y;

    /**
     * Constructor
     * 
     * @param x the x-coordinate of the point
     * @param y the y-coordinate of the point
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor
     * 
     * @param point the point to get the coordinates from
     */
    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    /**
     * Getter for the x coordinate
     * 
     * @return the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Getter for the y coordinate
     * 
     * @return the y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Translates the point by the passed deltas
     * 
     * @param dx the amount to translate the x-coordinate by
     * @param dy the amount to translate the y-coordinate by
     */
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Sets the x- and the y-coordniates to the location of the passed point
     * 
     * @param point the location this point should get
     */
    public void setLocation(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Point)) {
            return false;
        }

        Point other = (Point) obj;

        return this.x == other.x && this.y == other.y;
    }
}
