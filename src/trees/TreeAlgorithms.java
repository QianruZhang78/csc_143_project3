package trees;

import java.util.*;

public class TreeAlgorithms {
    /**
     * Finds the maximum Integer in a tree.
     * @param root Root of the tree.
     * @return The maximum Integer contained in the tree; null if the root is null.
     */
    public static Integer max(TreeNode<Integer> root) {
        /* YOUR CODE HERE */
        return null;
    }

    /**
     * Finds the minimum Integer in a tree.
     * @param root Root of the tree.
     * @return The minimum Integer contained in the tree; null if the root is null.
     */
    public static Integer min(TreeNode<Integer> root) {
        /* YOUR CODE HERE */
        return null;
    }

    /**
     * Finds all the tree leaves (nodes with no children) in a tree.
     * @param root Root of the tree.
     * @return A LinkedList of leaf TreeNodes from the tree.
     */
    public static LinkedList<TreeNode<Integer>> leaves(TreeNode<Integer> root) {
        /* YOUR CODE HERE */
        return null;
    }

    /**
     * Counts the number of nodes in a tree.
     * @param root Root of the tree.
     * @return
     */
    public static int count(TreeNode<Integer> root) {
        /* YOUR CODE HERE */
        return -1;
    }

    /**
     * Computes the depth (height) of a tree.
     * A single node by itself has zero depth;
     * a single node and a single child has a depth of 1.
     * @param root Root of the tree.
     * @return The depth (height) of the tree.
     */
    public static <T> int depth(TreeNode<T> root) {
        /* YOUR CODE HERE */
        return -1;
    }

    /**
     * Determines if two trees are equal in value.
     * @param A Root of the first tree.
     * @param B Root of the second tree.
     * @param <T> Type of value contained by the tree.
     * @return True or false depending on the equality of the two trees.
     */
    public static <T> boolean equals(TreeNode<T> A, TreeNode<T> B) {
        /* YOUR CODE HERE */
        return false;
    }

    /**
     * Conducts a breadth first search on a tree, from top to bottom, left to right.
     *
     * Hint: use a Java Queue, rather than recursion (which depends on the Stack).
     * You can add and remove to the queue using Queue::add(e) and Queue::remove, respectively.
     *
     * @param root Root of the tree.
     * @return List of elements in the tree, in order of BFS search.
     */
    public static LinkedList<Integer> bfs(TreeNode<Integer> root) {
        /* YOUR CODE HERE */
        return null;
    }

    /**
     * Finds the path from a tree root to a target element.
     *
     * Note: unlike BinaryTreeAlgorithms::path, this method returns a list of nodes
     * rather than a list of directions (enums). Furthermore, this method returns
     * an empty list when there is no path, while the BinaryTreeAlgorithms::path method
     * will return null if there is no path.
     *
     * @param root Root of the tree.
     * @param value Value to search for.
     * @return A LinkedList of TreeNodes, starting with the root node, describing the path of nodes
     * from the root to the node containing the target value.
     * If the target element is not present in the tree, return an empty list.
     */
    public static <T> LinkedList<TreeNode<T>> path(TreeNode<T> root, T value) {
        /* YOUR CODE HERE */
        return null;
    }
}
