public class Main {
    static class TreeNode {
        TreeNode left, right;

        TreeNode(int item) {
            left = right = null;
        }
    } 

    int findHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    
    public static void main(String[] args){
        Main tree = new Main();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        int height = tree.findHeight(tree.root);
        System.out.println("Height of the tree is: " + height);

    }
    TreeNode root;

    Main() {
        root = null;
    }
}