package EN.P8;

public class LinkedList {

    Node head;

    public void insert(int value) {
        if (head == null) { //empty list
            head = new Node(value);
        }else {
            head.insert(value);
        }
    }

    public boolean contains(int value){
        if( head == null ) return false; //empy LL
        return head.contains(value);
    }

    public boolean delete(int value){
        if( head == null ) return false;//empty LL
        if( head.value == value ){
            head = head.next;
            return true;
        }
        return head.delete(value);
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(5);
        ll.insert(4);
        ll.insert(3);
        ll.insert(2);
        ll.insert(5);

        System.out.println(ll.contains(5));
        System.out.println(ll.contains(3));
        System.out.println(ll.contains(10));
        System.out.println(ll.contains(1));


        System.out.println("delete 10");
        System.out.println(ll.delete(10));
        System.out.println("Delete 3");
        System.out.println(ll.delete(3));
        System.out.println(ll.contains(3));
        System.out.println(ll.contains(2));

    }
}
