package solutions.lesson_10_recursion_2.binaryTree;

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
     * Setter for the value attribute
     * 
     * @param value the new value
     */
    public void setValue(int value) {
        this.value = value;
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
        if (value == this.value) {
            return true;
        } else if (value < this.value) {
            return this.lhc == null ? false : this.lhc.exists(value);
        } else {
            return this.rhc == null ? false : this.rhc.exists(value);
        }
    }

    /**
     * Gets the maximum value of the subtree
     * 
     * @return the maximum value
     */
    public int maximum() {
        return this.rhc == null ? this.value : this.rhc.maximum();
    }

    /**
     * Gets the minimum value of the subtree
     * 
     * @return the minimum value
     */
    public int minimum() {
        return this.rhc == null ? this.value : this.lhc.minimum();
    }

    /**
     * Gets the amount of nodes in the subtree (including the root of the subtree)
     * 
     * @return the amount of nodes in the subtree
     */
    public int nodeAmount() {
        int leftHeight = this.lhc == null ? 0 : this.lhc.nodeAmount();
        int rightHeight = this.rhc == null ? 0 : this.rhc.nodeAmount();
        return leftHeight + rightHeight + 1;
    }

    /**
     * Calculates the height of the subtree. The height of a subtree equals the
     * length of its longest path.
     * 
     * @return the height
     */
    public int height() {
        int leftHeight = this.lhc == null ? 0 : this.lhc.height();
        int rightHeight = this.rhc == null ? 0 : this.rhc.height();
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

    /**
     * Prints the nodes of the subtree in order (from small to big).
     */
    public void printInOrder() {
        if (this.lhc != null) {
            this.lhc.printInOrder();
        }
        System.out.print(this.value + ", ");
        if (this.rhc != null) {
            this.rhc.printInOrder();
        }
    }

    /**
     * Check if the subtree is degenerate. A substree is degenerate if theres no
     * Node in the subtree that has two children. Alternative definition: A subtree
     * is degenerate iff it has n nodes and has a height of n - 1 (n ∈ ℕ). An empty
     * tree is not degenerate.
     * 
     * @return true if the subtree is degenrate, fals if not
     */
    public boolean isDegenerate() {
        if (this.lhc != null) {
            return this.rhc != null ? false : this.lhc.isDegenerate();
        } else {
            return this.rhc != null ? this.rhc.isDegenerate() : true;
        }
    }
}
