package BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree bTree= new BinaryTree(10);
        bTree.insertNode(5);
        bTree.insertNode(13);
        bTree.insertNode(2);
        bTree.insertNode(7);
        bTree.insertNode(14);
        bTree.insertNode(12);
        System.out.println("searching for 7: "+ bTree.searchNode(7));
        System.out.println("Preorder TraverSal");
        bTree.preOrder();
        System.out.println("Inorder TraverSal");
        bTree.inOrder();
        System.out.println("Postorder TraverSal");
        bTree.postOrder();

    }


}