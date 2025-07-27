package day15;
class TreeNode {
    int data;
    treeNode left;
    treeNode right;


    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


public class Task01 {
    public static void main(String[]args){
        treeNode root = new treeNode(10);
        root.left = new treeNode(5);
        root.right = new treeNode(15);

        System.out.println("root " + root);
        System.out.println("left root " + root.left);
        System.out.println("Right foot node " + root.right);
    }
}
