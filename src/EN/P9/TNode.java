package EN.P9;

public class TNode {

    int value;

    TNode left;
    TNode middle;
    TNode right;

    TNode(int value){
        this.value = value;
    }

    public void insert(int value){
        if(value < this.value){
            if (left == null) {
                left = new TNode(value);
            }else{
                left.insert(value);
            }
        }else if( this.value <= value && value < (this.value * this.value)){
            if( middle == null){
                middle = new TNode(value);
            }else{
                middle.insert(value);
            }
        }else{
            if(right == null){
                right = new TNode(value);
            }else{
                right.insert(value);
            }
        }
    }

}
