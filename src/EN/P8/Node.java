package EN.P8;

public class Node {

    int value;
    Node next; // next element in the LL

    public Node(int value){
        this.value = value;
    }

    public void insert(int value){
        if(next == null){ // reached the end of LL
            next = new Node(value);
        }else {
            next.insert(value);
        }
    }

    public boolean contains(int value){
        if( this.value == value ) return true; // value found!
        if( this.next == null ) return false; // end of LL
        return this.next.contains(value);
    }

    public boolean delete(int value){
        if( next == null ) return false; //end of LL
        if( next.value == value){
            next = next.next;
            return true;
        }
        return next.delete(value);
    }


}
