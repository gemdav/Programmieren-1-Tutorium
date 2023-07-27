package controller;

import java.util.Random;
import java.util.TimerTask;

import helper.Point;
import model.board.Board;
import model.board.fields.Border;
import model.board.fields.Empty;
import model.board.fields.Food;
import model.snake.Head;
import view.Printer;

/**
 * Implements the core logic of the game. A timer calls the run function at
 * fixed rate, the needed functions are called by the in every iteration
 * 
 * @author David Gemen
 * @author Andriyan Lapychak
 */
class Controller extends TimerTask {

    private Board board;
    private Printer printer;
    private Head snake;

    /**
     * Constructor
     * 
     * @param board the game board that should be controlled
     * @param snake the snake that should be controlled
     */
    public Controller(Board board, Head snake) {
        this.board = board;
        this.snake = snake;
        this.printer = new Printer(board, snake);
        placeFood();
    }

    /**
     * Places food on the board on an empty field
     */
    private void placeFood() {
        // get empty fields
        Point[] empty = board.getEmptyFields();
        int counter = 0;
        // remove fields where the snake is
        for (int i = 0; i < empty.length; i++) {
            if (snake.elementAt(empty[i]) != null) {
                empty[i] = null;
            } else {
                counter++;
            }
        }
        // create array that contains all possible positions
        Point[] noSnakeAndEmpty = new Point[counter];
        counter = 0;
        for (int i = 0; i < empty.length; i++) {
            if (empty[i] != null) {
                noSnakeAndEmpty[counter] = empty[i];
                counter++;
            }
        }
        // get random field out of those that are left
        Point newPos = noSnakeAndEmpty[new Random().nextInt(noSnakeAndEmpty.length)];
        board.setFieldAt(newPos, new Food());
    }

    /**
     * Checks if the player has lost the game. That is the case if the snakes head
     * has either crashed into a border or bit itself into the tail.
     * 
     * @param point the position of the snakes head
     * @return true if the player hast lost, false if not
     */
    public boolean checkLost(Point headPos) {
        // wall crash
        if (board.getFieldAt(headPos) instanceof Border) {
            return true;
        }
        // self crash
        if (snake.getNext().elementAt(headPos) != null) {
            return true;
        }
        return false;
    }

    /**
     * Checks if the player has won. The winning condition is that the snake must
     * cover the whole board.
     * 
     * @return true if the player has won, false if not
     */
    public boolean checkWon() {
        return snake.length() >= board.getWidth() * board.getHeight();
    }

    @Override
    public void run() {
        // make move first
        snake.updateDirection();
        snake.move();

        Point headPos = snake.getPosition();

        // consume food if present
        if (board.checkFood(headPos)) {
            snake.appendTail();
            board.setFieldAt(headPos, new Empty());
            placeFood();
        }

        // update view
        printer.printBoard();

        // check if player has won, if yes exit the game
        if (checkWon()) {
            Main.exitGame("Game won!");
        }

        // check if player has lost, if yes exit the game
        if (checkLost(headPos)) {
            Main.exitGame("Game over!");
        }

    }
}