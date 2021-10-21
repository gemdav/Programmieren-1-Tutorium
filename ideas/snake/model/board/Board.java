package ideas.snake.model.board;

import ideas.snake.helper.Point;
import ideas.snake.model.board.fields.Border;
import ideas.snake.model.board.fields.Empty;
import ideas.snake.model.board.fields.Field;
import ideas.snake.model.board.fields.Food;

/**
 * The game board the snake is moving on
 * 
 * @author David Gemen
 * @author Andriyan Lapychak
 */
public class Board {

    private Field[][] board;
    private int width;
    private int height;

    /**
     * Constructor
     * 
     * @param width  the width of the board
     * @param height the height of the board
     */
    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new Field[width + 2][height + 2];
        for (int x = 0; x < width + 2; x++) {
            for (int y = 0; y < height + 2; y++) {
                if (x == 0 || y == 0 || x == width + 1 || y == height + 1) {
                    // place borders at the edges
                    board[x][y] = new Border();
                } else {
                    // empty fields else
                    board[x][y] = new Empty();
                }
            }
        }
    }

    /**
     * Returns the empty positions of the field
     */
    public Point[] getEmptyFields() {
        int index = 0;
        Point[] empty = new Point[getWidth() * getHeight()];
        for (int y = 0; y < height + 2; y++) {
            for (int x = 0; x < height + 2; x++) {
                Point pos = new Point(x, y);
                if (getFieldAt(pos) instanceof Empty) {
                    empty[index] = pos;
                    index++;
                }
            }
        }
        return empty;
    }

    /**
     * Checks if the passed position is filled with a Food objects
     * 
     * @param point the position to be checked
     * @return true if the position is filled with food, false if not
     */
    public boolean checkFood(Point point) {
        return getFieldAt(point) instanceof Food;
    }

    /**
     * Getter of the width property of the game board
     * 
     * @return the width of the board
     */
    public int getWidth() {
        return width;
    }

    /**
     * Getter of the height property of the game board
     * 
     * @return the height of the board
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets the field at a specific position
     * 
     * @param point the position the get the field from
     * @return the field object at the position
     */
    public Field getFieldAt(Point point) {
        return board[point.getX()][point.getY()];
    }

    /**
     * Sets the field at a specific position
     * 
     * @param point the position to set the field on
     * @param field the field to be set
     */
    public void setFieldAt(Point point, Field field) {
        board[point.getX()][point.getY()] = field;
    }
}
