package EN.P9;

public class TernaryTree {

    TNode root;

    public void insert(int value){
        if(root == null){
            root = new TNode(value);
        }else{
            root.insert(value);
        }
    }

}
