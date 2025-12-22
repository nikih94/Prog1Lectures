package SLO.P8;

public class BSTNode {

    int key;

    BSTNode left; //levo poddrevo

    BSTNode right; // desno poddrevo

    BSTNode(int value){
        this.key = value;
    }

    public void insert(int value){
        if(value < key){ // levo poddrevo
            if(left == null){
                left = new BSTNode(value);
            }else {
                left.insert(value);
            }
        }else if (value > key){// desno poddrevo
            if(right == null){
                right = new BSTNode(value);
            }else{
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value < key) {//isci v levem poddrevesu
            if(left == null) return false;
            return left.contains(value);
        } else if (value > key) {//isci v desnem poddrevesu
            if(right == null) return false;
            return right.contains(value);
        }else{
            return true; // nasli iskani element
        }
    }

    public void inOrderTraversal(){
        if(left != null) left.inOrderTraversal();

        System.out.print(key+ " ");

        if(right != null) right.inOrderTraversal();
    }

}
