import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class RootToLeafPaths {
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<ArrayList<Integer>> result = Paths(root);

        System.out.println("Root to Leaf Paths:");
        for (ArrayList<Integer> path : result) {
            for (Integer nodeValue : path) {
                System.out.print(nodeValue + " ");
            }
            System.out.println();
        }
    }

    static void solve(Node root, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> ds) {
        if (root == null) return;
        ds.add(root.data);
        if (root.left == null && root.right == null) {
            res.add(new ArrayList<>(ds));
            ds.remove(ds.size() - 1);
            return;
        }
        solve(root.left, res, ds);
        solve(root.right, res, ds);
        ds.remove(ds.size() - 1);
    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        solve(root, res, ds);
        return res;
    }
}
