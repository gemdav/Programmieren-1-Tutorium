package ideas.snake.model.board.fields;

/**
 * An empty field
 * 
 * @author David Gemen
 * @author Andriyan Lapychak
 */
public class Empty implements Field {

    private static final char SYMBOL = ' ';

    @Override
    public char getSymbol() {
        return SYMBOL;
    }
}
