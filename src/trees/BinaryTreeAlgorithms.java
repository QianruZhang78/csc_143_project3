package trees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeAlgorithms {
    /**
     * Performs a pre-order traversal of a binary tree.
     * @param root Root of binary tree.
     * @param <T> Type of node payload.
     * @return A Collection containing the node payloads in traversal order.
     */
    public static <T> List<T> preOrder(BinaryNode<T> root) {
        /* YOUR CODE HERE */
        List<T> list = new ArrayList<>();
        preOrderHelper(list, root);
        return list;
    }

    private static <T> void preOrderHelper(List<T> result, BinaryNode<T> root) {
        if (root == null) {
            return;
        }
        result.add(root.payload);
        preOrderHelper(result, root.left);
        preOrderHelper(result, root.right);
    }

    /**
     * Performs a in-order traversal of a binary tree.
     * @param root Root of binary tree.
     * @param <T> Type of node payload.
     * @return A Collection containing the node payloads in traversal order.
     */
    public static <T> List<T> inOrder(BinaryNode<T> root) {
        /* YOUR CODE HERE */
        List<T> list = new ArrayList<>();
        inOrderHelper(list, root);
        return list;
    }

    private static <T> void inOrderHelper(List<T> result, BinaryNode<T> root) {
        if (root == null) {
            return;
        }
        inOrderHelper(result, root.left);
        result.add(root.payload);
        inOrderHelper(result, root.right);
    }

    /**
     * Performs a post-order traversal of a binary tree.
     * @param root Root of binary tree.
     * @param <T> Type of node payload.
     * @return A Collection containing the node payloads in traversal order.
     */
    public static <T> List<T> postOrder(BinaryNode<T> root) {
        /* YOUR CODE HERE */
        List<T> list = new ArrayList<>();
        postOrderHelper(list, root);
        return list;
    }

    private static <T> void postOrderHelper(List<T> result, BinaryNode<T> root) {
        if (root == null) {
            return;
        }
        postOrderHelper(result, root.left);
        postOrderHelper(result, root.right);
        result.add(root.payload);
    }

    /**
     * Conduct a binary search on a binary search tree for a target value.
     * @param root Root of the binary search tree.
     * @param value The value to search for.
     * @return The node containing the value, or null if the value is not present in the tree.
     */
    public static BinaryNode<Integer> binarySearch(BinaryNode<Integer> root, Integer value) {
        /* YOUR CODE HERE */
        if (root == null) {
            return null;
        }
        if (root.payload.equals(value)) {
            return root;
        } else if (value < root.payload) {
            return binarySearch(root.left, value);
        } else {
            return  binarySearch(root.right, value);
        }
    }

    /**
     * Inserts an Integer value into a Binary Search Tree.
     * @param root Root of the binary search tree.
     * @param value The value to insert.
     * @return The BinaryNode containing the newly inserted value, or an existing BinaryNode with an equal value.
     */
    public static BinaryNode<Integer> insert(BinaryNode<Integer> root, Integer value) {
        /* YOUR CODE HERE */
        return null;
    }

    /**
     * Determines if two BSTs are equal in value.
     * @param A Root of first tree.
     * @param B Root of second tree.
     * @return True or false depending on the equality of the two trees.
     */
    public static boolean equals(BinaryNode<Integer> A, BinaryNode<Integer> B) {
        /* YOUR CODE HERE */
        if (A == null && B == null) {
            return true;
        }
        if (A == null || B == null) {
            return false;
        }
        if (!A.payload.equals(B.payload)) {
            return false;
        }
        return equals(A.left, B.left) && equals(A.right, B.right);
    }

    /**
     * Finds the path from the tree root to a target element.
     * This algorithm does NOT assume the tree is a Binary Search Tree,
     * only that it is a Binary Tree.
     *
     * Hint: This method is a bit harder than the ones above.
     * Consider implementing some TreeAlgorithms first to get some more recursion practice.
     *
     * Hint: You can use the LinkedList::addAll method to append all the contents of
     * another list to a list (like a join, but copies and is non-destructive).
     * You may also use the LinkedList::addFirst method to push to the front of the list.
     *
     * @param root Root of the tree.
     * @param value The value to search for.
     * @param <T> The type of the value to search for.
     * @return A LinkedList of Directions that lead to the target value.
     * If the target value is at the root element, return an empty list.
     * If the target value is not present in the tree, return null.
     */
    public static <T> LinkedList<BinaryNode.Direction> path(BinaryNode<T> root, T value) {
        /* YOUR CODE HERE */
        return null;
    }
}
