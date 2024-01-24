class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class PseudoPalindromicPath {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);

        int result = pseudoPalindromicPaths(root);
        System.out.println("Number of pseudo-palindromic paths: " + result);
    }

    public static int pseudoPalindromicPaths(TreeNode root) {
        return dfs(root, 0);
    }

    private static int dfs(TreeNode node, int count) {
        if (node == null) {
            return 0;
        }
        count ^= 1 << (node.val - 1);
        if (node.left == null && node.right == null) {
            return (count & (count - 1)) == 0 ? 1 : 0;
        }
        return dfs(node.left, count) + dfs(node.right, count);
    }
}
