package SLO.P6;

public class Overloading {
    static void test(){
        System.out.println("No params");
    }
    static void test(int a){
        System.out.println("Inpout: "+a);
    }
    static void test(double a){
        System.out.println("a double:"+a);
    }
    static void test(int a, int b){
        System.out.println("Vsota: "+ (a+b));
    }


    public static void main(String[] args) {
        test();
        test(5);
        test(2.2);
        test(5,3);
        test(3.3f);
    }

}
