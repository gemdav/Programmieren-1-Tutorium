package model.board.fields;

/**
 * A border field
 * 
 * @author David Gemen
 * @author Andriyan Lapychak
 */
public class Border implements Field {

    private static final char SYMBOL = '\u2588';

    @Override
    public char getSymbol() {
        return SYMBOL;
    }
}
