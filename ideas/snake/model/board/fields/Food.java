package model.board.fields;

/**
 * A food field
 * 
 * @author David Gemen
 * @author Andriyan Lapychak
 */
public class Food implements Field {

    private static final char SYMBOL = '\u259e';

    @Override
    public char getSymbol() {
        return SYMBOL;
    }
}
