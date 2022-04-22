/**
 * BinaryTree
 * 
 * @author David Gemen
 */
public class BinaryTree {

    private static final String FILE = "./solutions/lesson_10_recursion_2/binaryTree/nodes.txt";

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    /**
     * Main function, program starts here
     * 
     * @param args command line arguments, not used here
     */
    public static void main(String[] args) {

        // check if assertions are enabled
        boolean assertsEnabled = false;
        assert assertsEnabled = true;
        if (!assertsEnabled) {
            syserr("Please enable assertions using the '-ea' flag");
            return;
        }

        Node tree = TreeLoader.loadTree(FILE);

        try {
            assert tree.exists(26);
            assert !tree.exists(33);
            assert tree.exists(40);
            assert !tree.getLhc().exists(40);
        } catch (AssertionError ae) {
            syserr(">> exists << does not work properly.");
        }
        try {
            assert tree.maximum() == 40;
            assert tree.getLhc().maximum() == 19;
            assert tree.getLhc().getLhc().maximum() == 4;
        } catch (AssertionError ae) {
            syserr(">> maximum << does not work properly.");
        }
        try {
            assert tree.minimum() == 0;
            assert tree.getRhc().minimum() == 23;
            assert tree.getRhc().getRhc().minimum() == 35;
        } catch (AssertionError ae) {
            syserr(">> minimum << does not work properly.");
        }
        try {
            assert tree.nodeAmount() == 16;
            assert tree.getLhc().nodeAmount() == 8;
            assert tree.getRhc().nodeAmount() == 7;
            assert tree.getRhc().getLhc().nodeAmount() == 3;
        } catch (AssertionError ae) {
            syserr(">> nodeAmount << does not work properly.");
        }
        try {
            assert tree.height() == 5;
            assert tree.getLhc().height() == 4;
            assert tree.getRhc().height() == 3;
        } catch (AssertionError ae) {
            syserr(">> height << does not work properly.");
        }
        try {
            assert !tree.isDegenerate();
            assert new Node(0, null, null).isDegenerate();
            assert new Node(0, new Node(0, new Node(0, null, null), null), null).isDegenerate();
        } catch (AssertionError ae) {
            syserr(">> isDegenerate << does not work properly.");
        }
        tree.printInOrder(); // expected: 0, 1, 3, 4, 6, 8, 14, 19, 20, 23, 26, 27, 32, 35, 36, 40,
        System.out.println();
    }

    /**
     * Print to console in red color
     * 
     * @param out the string to be printed
     */
    private static void syserr(String out) {
        System.err.println(ANSI_RED + out + ANSI_RESET);
    }
}
