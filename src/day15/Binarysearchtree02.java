class TreeNode {
    int item;
    TreeNode left, right;
    TreeNode(int item) { this.item = item; }
}

class BinarySearchTreeOp {
    TreeNode root;


    void insert(int value) {
        root = insert(root, value);
    }

    TreeNode insert(TreeNode node, int value) {
        if (node == null) return new TreeNode(value);
        if (value < node.item) node.left = insert(node.left, value);
        else if (value > node.item) node.right = insert(node.right, value);
        return node;
    }

    TreeNode search(int key) {
        TreeNode current = root;
        while (current != null && current.item != key)
            current = (key < current.item) ? current.left : current.right;
        return current;
    }

    void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.item + " ");
            inorder(node.right);
        }
    }
}

public class Binarysearchtree02 {
    public static void main(String[] args) {
        BinarySearchTreeOp bst = new BinarySearchTreeOp();
        for (int val : new int[]{10, 50, 40, 70, 5}) bst.insert(val);

        System.out.println("In-order traversal of BST:");
        bst.inorder(bst.root);
        System.out.println();

        int key = 70;
        System.out.println((bst.search(key) != null) ? "Key " + key + " found." : "Key " + key + " not found.");
    }
}
