class TreeNode01 {
    int value;
    TreeNode01 left, right;

    TreeNode01(int item) {
        value = item;
        left = right = null;
    }
}

class BinarySearchTreeOp01 {
    TreeNode01 root;

    void insert(int value) {
        root = insertVal(root, value);
    }

    TreeNode01 insertVal(TreeNode01 node, int value) {
        if (node == null) {
            node = new TreeNode01(value);
            return node;
        }
        if (value < node.value) {
            node.left = insertVal(node.left, value);
        } else if (value > node.value) {
            node.right = insertVal(node.right, value);
        }
        return node;
    }

    void inorder() {
        inorderVal(root);
    }

    void inorderVal(TreeNode01 node) {
        if (node != null) {
            inorderVal(node.left);
            System.out.print(node.value + " ");
            inorderVal(node.right);
        }
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTreeOp01 bstobj = new BinarySearchTreeOp01();
        bstobj.insert(100);
        bstobj.insert(50);
        bstobj.insert(400);
        bstobj.insert(70);
        bstobj.insert(500);

        System.out.println("Here is the code for in-order traversal of Binary Search Tree:");
        bstobj.inorder();
    }
}



