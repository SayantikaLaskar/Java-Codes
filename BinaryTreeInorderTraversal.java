import java.util.ArrayList;
import java.util.List;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println("Inorder Traversal: " + inorderTraversal(root));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalRecursive(root, result);
        return result;
    }

    private static void inorderTraversalRecursive(TreeNode node, List<Integer> result) {
        if (node != null) {
            // Traverse the left subtree
            inorderTraversalRecursive(node.left, result);
            // Visit the current node
            result.add(node.val);
            // Traverse the right subtree
            inorderTraversalRecursive(node.right, result);
        }
    }
}
