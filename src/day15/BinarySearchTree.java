package day15;

// TreeNode class
class treeNode {
    int data;
    treeNode left;
    treeNode right;

    public treeNode(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

// Binary Search Tree class
public class BinarySearchTree {
    private treeNode root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    // 1. Insert when tree is empty
    public void insert(int value) {
        if (root == null) {
            root = new treeNode(value);
            System.out.println("Inserted root: " + value);
        } else {
            insert(root, value);
        }
    }

    // 2. Insert when tree has one or more nodes
    private void insert(treeNode current, int value) {
        if (value < current.data) {
            if (current.left == null) {
                current.left = new treeNode(value);
                System.out.println("Inserted " + value + " to the left of " + current.data);
            } else {
                insert(current.left, value);
            }
        } else if (value > current.data) {
            if (current.right == null) {
                current.right = new treeNode(value);
                System.out.println("Inserted " + value + " to the right of " + current.data);
            } else {
                insert(current.right, value);
            }
        } else {
            System.out.println("Duplicate value " + value + " not inserted.");
        }
    }

    // Display tree in-order
    public void inorderTraversal(treeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Start traversal from root
    public void display() {
        System.out.print("In-order Traversal: ");
        inorderTraversal(root);
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50); // First insert — empty tree
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        bst.display();  // Should print the tree in sorted order
    }
}

