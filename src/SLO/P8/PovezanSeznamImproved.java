package SLO.P8;

public class PovezanSeznamImproved extends PovezanSeznam{
    //kaze vedno na zadnji element
    Node tail; // trick za hitro vstavljanje

    public void vstavi(int v){
        if(head == null){
            head =new Node(v);
            tail = head;
        }
        tail.next = new Node(v);
        tail = tail.next;
    }

    public static void main(String[] args) {
        PovezanSeznamImproved pz = new PovezanSeznamImproved();

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
