package ideas.snake.view;

import ideas.snake.helper.Point;
import ideas.snake.model.board.Board;
import ideas.snake.model.snake.Element;
import ideas.snake.model.snake.Head;

/**
 * The view component of the project, visualizing the game
 * 
 * @author David Gemen
 * @author Andriyan Lapychak
 */
public class Printer {

    private Board board;
    private Head snake;

    /**
     * Constructor
     * 
     * @param board the board that should be presented
     * @param snake the snake that should be presented
     */
    public Printer(Board board, Head snake) {
        this.board = board;
        this.snake = snake;
    }

    /**
     * Generates and returns the string that represents the current game situation
     * and should thus be presented to the player
     * 
     * @return the generated string
     */
    private String generateString() {
        String string = "";
        for (int y = 0; y < board.getHeight() + 2; y++) {
            for (int x = 0; x < board.getWidth() + 2; x++) {
                Element snakePart = snake.elementAt(new Point(x, y));
                if (snakePart != null) {
                    string += snakePart.getSymbol() + " ";
                } else {
                    string += board.getFieldAt(new Point(x, y)).getSymbol() + " ";
                }
            }
            string += "\n";
        }
        return string;
    }

    /**
     * Updates the view by clearing the console and printing the new version
     */
    public void printBoard() {
        String toPrint = generateString();
        clearConsole();
        System.out.println(toPrint);
    }

    /**
     * Clears the console
     */
    public void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
