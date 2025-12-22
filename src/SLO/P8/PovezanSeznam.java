package SLO.P8;

public class PovezanSeznam {

    Node head; //prvo vozlisce v seznamu


    public void vstavi(int v){
        if(head == null){
            head = new Node(v);
        }else{
            head.vstavi(v);
        }
    }


    public boolean vsebuje(int v){
        if(head == null){
            return false;
        }else {
            return head.vsebuje(v);
        }
    }

    public boolean brisi(int v){
        if(head==null) return false;
        if(head.value == v){
            head = head.next;
            return true;
        }
        return head.brisi(v);
    }


    public static void main(String[] args) {
        PovezanSeznam pz = new PovezanSeznam();

        pz.vstavi(7);
        pz.vstavi(4);
        pz.vstavi(9);
        pz.vstavi(5);

        System.out.println(pz.vsebuje(2));
        System.out.println(pz.vsebuje(5));

        System.out.println("//////////////////");
        System.out.println(pz.brisi(9));
        System.out.println(pz.vsebuje(9));
        System.out.println(pz.vsebuje(5));


    }

}
