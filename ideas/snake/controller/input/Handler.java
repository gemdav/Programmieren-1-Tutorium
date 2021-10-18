package controller.input;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import java.awt.event.KeyEvent;

import model.snake.Head;

/**
 * Key Event Handler.
 * 
 * @author David Gemen
 * @author Andriyan Lapychak
 */
public class Handler implements Consumer<Integer> {

    Head snake;

    public static final List<Integer> UP = Arrays.asList(KeyEvent.VK_UP, KeyEvent.VK_W);
    public static final List<Integer> DOWN = Arrays.asList(KeyEvent.VK_DOWN, KeyEvent.VK_S);
    public static final List<Integer> LEFT = Arrays.asList(KeyEvent.VK_LEFT, KeyEvent.VK_A);
    public static final List<Integer> RIGHT = Arrays.asList(KeyEvent.VK_RIGHT, KeyEvent.VK_D);

    /**
     * Constructor
     * 
     * @param snake the snake that should change the Direction
     */
    public Handler(Head snake) {
        this.snake = snake;
    }

    @Override
    public void accept(Integer keycode) {
        if (UP.contains(keycode)) {
            snake.setNextDirection(Head.UP);
        } else if (DOWN.contains(keycode)) {
            snake.setNextDirection(Head.DOWN);
        } else if (LEFT.contains(keycode)) {
            snake.setNextDirection(Head.LEFT);
        } else if (RIGHT.contains(keycode)) {
            snake.setNextDirection(Head.RIGHT);
        }
    }

}
