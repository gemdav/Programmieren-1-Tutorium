package ideas.snake.controller.input;

import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.function.Consumer;

/**
 * Java Swing JFrame for the key listener.
 * 
 * @author David Gemen
 */
public class ListenerFrame extends JFrame {

    /**
     * Constructor
     * 
     * @param handler the consuming function of the key event
     */
    public ListenerFrame(Consumer<Integer> handler) {
        this.setAlwaysOnTop(true);
        this.setVisible(true);
        this.setSize(100, 100);
        this.addKeyListener(new KeyboardListener(handler));
    }

    /**
     * Keylistener that calles the handler function every time a key is pressed
     * 
     * @author David Gemen
     * @author Andriyan Lapychak
     */
    private class KeyboardListener extends KeyAdapter {

        private Consumer<Integer> handler;

        /**
         * Constructor
         * 
         * @param handler the consuming function of the key event
         */
        private KeyboardListener(Consumer<Integer> handler) {
            this.handler = handler;
        }

        @Override
        public void keyPressed(KeyEvent e) {
            handler.accept(e.getKeyCode());
        }

    }
}
