package EN.P8;

public class NodeBST {

    int key;
    NodeBST left;
    NodeBST right;

    public NodeBST(int value){
        this.key = value;
    }

    public boolean contains(int value){
        if( value < key ){ // left subtree
            if(left == null){
                return false;
            }else{
                return left.contains(value);
            }
        }else if( value > key){ //right subtree
            if(right == null){
                return false;
            }else{
                return right.contains(value);
            }
        } else{ // value == key
            return true; // element found !!
        }
    }


    public void insert(int value){
        if( value < key ){ // left subtree
            if(left == null){ // insert, empty branch
                left = new NodeBST(value);
            }else{ // not empty, delegate insertion
                left.insert(value);
            }
        }else if (value > key){ //right subtree
            if(right == null){
                right = new NodeBST(value);
            }else{
                right.insert(value);
            }
        }
    }

    public void inOrderTraversal(){
        if( left != null ){
            left.inOrderTraversal();
        }
        System.out.print(key+" ");
        if( right != null ){
            right.inOrderTraversal();
        }
    }

}
