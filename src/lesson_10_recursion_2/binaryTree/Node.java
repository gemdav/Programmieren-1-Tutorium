package src.lesson_10_recursion_2.binaryTree;

/**
 * Node Class
 * 
 * @author David Gemen
 */
public class Node {

    private int value;
    private Node lhc;
    private Node rhc;

    /**
     * Constructor taking value and children of the node
     * 
     * @param value the value of the node
     * @param lhc   the left child of the node, null if there is none
     * @param rhc   the right child of the node, null if there is none
     */
    public Node(int value, Node lhc, Node rhc) {
        this.value = value;
        this.lhc = lhc;
        this.rhc = rhc;
    }

    /**
     * Getter for value attribute
     * 
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * Setter for the value attribute
     * 
     * @param value the new value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Getter for the left child
     * 
     * @return the left child
     */
    public Node getLhc() {
        return lhc;
    }

    /**
     * Getter for the right child
     * 
     * @return the right child
     */
    public Node getRhc() {
        return rhc;
    }

    /**
     * Inserts a Node at the correct position in the subtree
     * 
     * @param value the value of the new node
     */
    public void insert(int value) {
        if (value <= this.value) {
            if (this.lhc == null) {
                this.lhc = new Node(value, null, null);
            } else {
                this.lhc.insert(value);
            }
        } else {
            if (this.rhc == null) {
                this.rhc = new Node(value, null, null);
            } else {
                this.rhc.insert(value);
            }
        }
    }

    /**
     * Checks if a node with the passed value exists in the subtree
     * 
     * @param value the value to check
     * @return true if the value exists, false if not
     */
    public boolean exists(int value) {
        // TODO: implement
        return false;
    }

    /**
     * Gets the maximum value of the subtree
     * 
     * @return the maximum value
     */
    public int maximum() {
        // TODO: implement
        return 0;
    }

    /**
     * Gets the minimum value of the subtree
     * 
     * @return the minimum value
     */
    public int minimum() {
        // TODO: implement
        return 0;
    }

    /**
     * Gets the amount of nodes in the subtree (including the root of the subtree)
     * 
     * @return the amount of nodes in the subtree
     */
    public int nodeAmount() {
        // TODO: implement
        return 0;
    }

    /**
     * Calculates the height of the subtree. The height of a subtree equals the
     * length of its longest path.
     * 
     * @return the height
     */
    public int height() {
        // TODO: implement
        return 0;
    }

    /**
     * Prints the nodes of the subtree in order (from small to big).
     */
    public void printInOrder() {
        // TODO: implement
        return;
    }

    /**
     * Check if the subtree is degenerate. A substree is degenerate iff theres no
     * Node in the subtree that has two children. Alternative definition: A subtree
     * is degenerate iff it has n nodes and has a height of n - 1 (n ∈ ℕ). An empty
     * tree is not degenerate.
     * 
     * @return true if the subtree is degenrate, fals if not
     */
    public boolean isDegenerate() {
        // TODO: implement
        return true;
    }
}
