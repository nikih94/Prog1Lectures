package EN.P6;

public class Overloading {

    static void test(){
        System.out.println("No parameters");
    }
    static void test(int a){
        System.out.println("a: "+a);
    }
    static void test(int a, int b){
        System.out.println("a + b: "+ (a+b)  );
    }
    static void test(double a){
        System.out.println("double a: "+a);
    }

//    static int test(int b){
//        System.out.println("b:" +b);
//        return b;
//    }

    public static void main(String[] args) {
        test();
        test(10);
        test(10,20);
        test(20.21);
        float f = 3.3f;
        test(f);
    }

}
