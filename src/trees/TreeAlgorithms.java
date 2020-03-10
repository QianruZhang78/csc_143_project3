package trees;

import java.util.*;

public class TreeAlgorithms {
    /**
     * Finds the maximum Integer in a tree.
     *
     * @param root Root of the tree.
     * @return The maximum Integer contained in the tree; null if the root is null.
     */
    public static Integer max(TreeNode<Integer> root) {
        /* YOUR CODE HERE */
        if (root == null) {
            return null;
        }
        ArrayList<TreeNode<Integer>> children = root.children;
        int currentMax = root.payload;
        if (children != null) {
            for (TreeNode<Integer> child : children) {
                Integer childResult = max(child);
                if (childResult == null) {
                    continue;
                }
                currentMax = Math.max(childResult, currentMax);
            }
        }
        return currentMax;
    }

    /**
     * Finds the minimum Integer in a tree.
     *
     * @param root Root of the tree.
     * @return The minimum Integer contained in the tree; null if the root is null.
     */
    public static Integer min(TreeNode<Integer> root) {
        /* YOUR CODE HERE */
        if (root == null) {
            return null;
        }
        ArrayList<TreeNode<Integer>> children = root.children;
        int currentMin = root.payload;
        if (children != null) {
            for (TreeNode<Integer> child : children) {
                Integer childResult = min(child);
                if (childResult == null) {
                    continue;
                }
                currentMin = Math.min(childResult, currentMin);
            }
        }
        return currentMin;
    }

    /**
     * Finds all the tree leaves (nodes with no children) in a tree.
     *
     * @param root Root of the tree.
     * @return A LinkedList of leaf TreeNodes from the tree.
     */
    public static LinkedList<TreeNode<Integer>> leaves(TreeNode<Integer> root) {
        /* YOUR CODE HERE */
        LinkedList<TreeNode<Integer>> rst = new LinkedList<>();
        leavesHelper(root, rst);
        return rst;
    }

    private static void leavesHelper(TreeNode<Integer> root, LinkedList<TreeNode<Integer>> rst) {
        if (root == null) {
            return;
        }

        if (root.children == null || root.children.isEmpty()) {
            rst.add(root);
            return;
        }

        for (TreeNode<Integer> child : root.children) {
            leavesHelper(child, rst);
        }
    }

    /**
     * Counts the number of nodes in a tree.
     *
     * @param root Root of the tree.
     * @return
     */
    public static int count(TreeNode<Integer> root) {
        /* YOUR CODE HERE */
        if (root == null) {
            return 0;
        }
        int currentCount = 1;
        if (root.children != null) {
            for (TreeNode<Integer> child : root.children) {
                currentCount += count(child);
            }
        }
        return currentCount;

    }

    /**
     * Computes the depth (height) of a tree.
     * A single node by itself has zero depth;
     * a single node and a single child has a depth of 1.
     *
     * @param root Root of the tree.
     * @return The depth (height) of the tree.
     */
    public static <T> int depth(TreeNode<T> root) {
        /* YOUR CODE HERE */
        if (root == null) {
            return 0;
        }
        if (root.children == null || root.children.isEmpty()) {
            return 0;
        }
        int currentMaxDepth = 0;
        for (TreeNode<T> child : root.children) {
            currentMaxDepth = Math.max(depth(child), currentMaxDepth);
        }
        return 1 + currentMaxDepth;

    }

    /**
     * Determines if two trees are equal in value.
     *
     * @param A   Root of the first tree.
     * @param B   Root of the second tree.
     * @param <T> Type of value contained by the tree.
     * @return True or false depending on the equality of the two trees.
     */
    public static <T> boolean equals(TreeNode<T> A, TreeNode<T> B) {
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
        if (A.children == null && B.children == null) {
            return true;
        }
        if (A.children == null || B.children == null) {
            return false;
        }
        if (A.children.size() != B.children.size()) {
            return false;
        }
        int size = A.children.size();
        for (int i = 0; i < size; i++) {
            boolean result = equals(A.children.get(i), B.children.get(i));
            if (!result) {
                return false;
            }
        }
        return true;
    }

    /**
     * Conducts a breadth first search on a tree, from top to bottom, left to right.
     * <p>
     * Hint: use a Java Queue, rather than recursion (which depends on the Stack).
     * You can add and remove to the queue using Queue::add(e) and Queue::remove, respectively.
     *
     * @param root Root of the tree.
     * @return List of elements in the tree, in order of BFS search.
     */
    public static LinkedList<Integer> bfs(TreeNode<Integer> root) {
        /* YOUR CODE HERE */
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        LinkedList<Integer> rst = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            TreeNode<Integer> current = queue.poll();
            rst.add(current.payload);
            if (current.children == null || current.children.isEmpty()) {
                continue;
            }
            for (TreeNode<Integer> child : current.children) {
                queue.offer(child);
            }
        }
        return rst;
    }

    /**
     * Finds the path from a tree root to a target element.
     * <p>
     * Note: unlike BinaryTreeAlgorithms::path, this method returns a list of nodes
     * rather than a list of directions (enums). Furthermore, this method returns
     * an empty list when there is no path, while the BinaryTreeAlgorithms::path method
     * will return null if there is no path.
     *
     * @param root  Root of the tree.
     * @param value Value to search for.
     * @return A LinkedList of TreeNodes, starting with the root node, describing the path of nodes
     * from the root to the node containing the target value.
     * If the target element is not present in the tree, return an empty list.
     */
    public static <T> LinkedList<TreeNode<T>> path(TreeNode<T> root, T value) {
        /* YOUR CODE HERE */
        LinkedList<TreeNode<T>> rst = new LinkedList<>();
        pathHelper(root, value, rst);
        return rst;
    }

    private static <T> boolean pathHelper(TreeNode<T> root, T value, LinkedList<TreeNode<T>> rst) {
        if (root == null) {
            return false;
        }
        if (root.payload.equals(value)) {
            rst.push(root);
            return true;
        }
        if (root.children != null && !root.children.isEmpty()) {
            for (TreeNode<T> child : root.children) {
                if (pathHelper(child, value, rst)) {
                    rst.push(root);
                    return true;
                }

            }
        }
        return false;
    }
}
