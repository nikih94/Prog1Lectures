package SLO.P8;

public class Node {

    int value;
    Node next;

    Node(int v){
        this.value = v;
    }

    public void vstavi(int v){
        if( next == null ){
            next = new Node(v);
        }else{
            next.vstavi(v);
        }
    }

    public boolean vsebuje(int v){
        if(value == v){
            return true;
        }else if(next == null){
            return false;
        }else{
            return next.vsebuje(v);
        }

    }

    public boolean brisi(int v){
        if(next == null) return false;
        if(next.value == v){
            next = next.next;
            return true;
        }
        return next.brisi(v);
    }

}
