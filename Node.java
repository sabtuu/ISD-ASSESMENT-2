
public class Node {
    private int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }

    public int getData(){
        return data;
    }
}

class VirusTree {
    Node root;

    public VirusTree() {
        root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
    }

    public void preorderTraversal() {
        preorderHelper(root);
    }

    private void preorderHelper(Node node) {
        if (node == null) {
            return;
        }

        System.out.printf("%s ", node.getData());
        preorderHelper(node.left);
        preorderHelper(node.right);
    }

    public boolean checkBST() {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.getData() <= min || node.getData() >= max) {
            return false;
        }
        return isBST(node.left, min, node.getData()) && isBST(node.right, node.getData(), max);
    }
}

class Main {
    public static void main(String[] args) {
        VirusTree tree = new VirusTree();
        tree.preorderTraversal();
        System.out.println();
        System.out.println(tree.checkBST());
    }
}
