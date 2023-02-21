public class TicTacToeWinCheck {
    
    static void einlesen(String[] felder) {
        if(felder.length != 9) {
            throw new IllegalArgumentException("Das Tic Tac Toe Feld hat nicht die passende Größe.");
        }
        for(String feld : felder) {
            if(!feld.equals("x") && !feld.equals("o") && !feld.equals("-")) {
                throw new IllegalArgumentException("Das Zeichen \"" + feld + "\" ist nicht erlaubt");
            }
        }
    }

    static String bestimmen(String[] felder) {
        // Möglichkeiten zu gewinnen (horizontal, vertical, diagonal)
        int[][] optionen = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};
        for(int[] option: optionen) {
            // prüfen, ob ein Spieler mit der Gewinnmöglichkeit gewonnen hat
            if(felder[option[0]].equals(felder[option[1]]) && felder[option[0]].equals(felder[option[2]])) {
                return felder[option[0]];
            }
        }
        // kein Spieler hat mit einer der Gewinnmöglichkeiten gewonnen
        return "-";
    }

    public static void main(String[] felder) {
        try {
            einlesen(felder);
        } catch(IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        String gewinner = bestimmen(felder);
        if(gewinner.equals("-")) {
            System.out.println("Kein Spieler hat gewonnen.");
        } else {
            System.out.println("Spieler " + gewinner + " hat gewonnen.");
        }
    }
}
