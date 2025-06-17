class main {

    public static void main(String[] args) {
        VirusTree tree = new VirusTree();
        tree.preorderTraversal();//pre-order untuk mengecek bentuk pohon
        System.out.println(tree.checkBST());//hasil true atau false
        tree.deleteBST();
        System.out.println(tree.checkBST());
        System.out.println("Pohon setelah dihapus:");
        tree.preorderTraversal(); 
    }
}
