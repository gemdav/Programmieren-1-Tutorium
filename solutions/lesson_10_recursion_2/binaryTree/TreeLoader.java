package solutions.lesson_10_recursion_2.binaryTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import src.lesson_10_recursion_2.binaryTree.Node;

/**
 * TreeLoader
 * 
 * @author David Gemen
 */
public class TreeLoader {

    /**
     * Loads the binary tree from the passed file by creating the nodes and
     * inserting them one after another
     * 
     * @param tree the root node of the binary tree
     */
    public static Node loadTree(String file) {
        Node tree = new Node(Integer.MIN_VALUE, null, null);
        try {
            File nodesFile = new File(file);
            Scanner fileReader = new Scanner(nodesFile);
            String nodes = fileReader.nextLine();
            for (String strValue : nodes.split(",")) {
                int value = Integer.parseInt(strValue);
                if (tree.getValue() == Integer.MIN_VALUE) {
                    tree.setValue(value);
                } else {
                    tree.insert(value);
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return tree;
    }

}
