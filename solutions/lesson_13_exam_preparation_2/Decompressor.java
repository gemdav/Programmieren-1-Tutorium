package solutions.lesson_13_exam_preparation_2;

/**
 * Decompressor
 * 
 * @author David Gemen
 */
public class Decompressor {

    /**
     * Main function, program starts here
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String[] compressedStrings = { "4a5v2c1s9i", "6y7v3k9m", "0s4b", "1a1b1c1d" };

        String compressed = "";
        try {
            switch (args[0]) {
                case "0":
                case "1":
                case "2":
                case "3":
                    compressed = compressedStrings[Integer.parseInt(args[0])];
                    System.out.println(decompress(compressed));
                    break;

                default:
                    throw new IllegalArgumentException("The cmd line argument must be an integer between 0 and 3");
            }
        } catch (IllegalArgumentException iaEx) {
            System.out.println(iaEx.getMessage());
        } catch (ArrayIndexOutOfBoundsException aioobEx) {
            System.out.println("You must provide a command line argument");
        }
    }

    /**
     * Decompresses a compressed String
     * 
     * @param compressed the compressed String
     * @return the decompressed String
     * @throws IllegalArgumentException
     */
    private static String decompress(String compressed) throws IllegalArgumentException {
        String decompressed = "";
        for (int i = 0; i < compressed.length(); i += 2) {
            int amount = Character.getNumericValue(compressed.charAt(i));
            char letter = compressed.charAt(i + 1);

            if (amount == 0) {
                throw new IllegalArgumentException("The chosen string contains the letter amount 0");
            }

            for (int j = 0; j < amount; j++) {
                decompressed += letter;
            }
        }
        return decompressed;
    }

}