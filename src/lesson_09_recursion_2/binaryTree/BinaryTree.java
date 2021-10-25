package src.lesson_09_recursion_2.binaryTree;

import solutions.lesson_09_recursion_2.binaryTree.Node;

/**
 * BinaryTree
 * 
 * @author David Gemen
 */
public class BinaryTree {

    /**
     * Main function, program starts here
     * 
     * @param args command line arguments, not used here
     */
    public static void main(String[] args) {
        Node tree = TreeLoader.loadTree("./src/lesson_09_recursion_2/binaryTree/nodes.txt");

        System.out.println(tree.exists(26)); // expected: true
        System.out.println(tree.exists(33)); // expected: false
        System.out.println(tree.maximum()); // expected: 40
        System.out.println(tree.minimum()); // expected: 1
        System.out.println(tree.height()); // expected: 5
        tree.printInOrder(); // expected: 0, 1, 3, 4, 6, 8, 14, 19, 20, 23, 26, 27, 32, 35, 36, 40,
        System.out.println();
        System.out.println(tree.isDegenerate()); // expected: false
    }
}
