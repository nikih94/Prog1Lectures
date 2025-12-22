package SLO.P8;

public class BST {

    BSTNode root;

    public void insert(int value){
        if(root == null){
            root = new BSTNode(value);
        }else {
            root.insert(value);
        }
    }

    public boolean contains(int value){
        if(root == null) return false; // prazno drevo
        return root.contains(value);
    }

    public void inOrderTraversal(){
        if(root != null){
            root.inOrderTraversal();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(10);
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(18);
        tree.insert(13);

        System.out.println(tree.contains(5));
        System.out.println(tree.contains(13));
        System.out.println(tree.contains(16));

        tree.inOrderTraversal();

    }


}
