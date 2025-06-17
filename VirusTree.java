
class VirusTree {

    Node root;

    public VirusTree() {
        root = new Node(30);
        root.left = new Node(5);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(12);
    }

    public void preorderTraversal() {
        preorderHelper(root);
    }

    private void preorderHelper(Node node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.getData()); // output node data
        preorderHelper(node.left); // traverse left subtree
        preorderHelper(node.right); // traverse right subtree
    }

    public boolean checkBST() {
        return checkBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkBSTHelper(Node node, int min, int max) {
        if (node == null) {
            return true;
        } else if (node.getData() <= min || node.getData() >= max) {
            return false;
        }
        return true;
    }

    // menghapus semua pohon BST
    public void deleteBST() {
        root = null;
    }
}
