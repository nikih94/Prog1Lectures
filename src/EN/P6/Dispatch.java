package EN.P6;

public class Dispatch {
    static class A {
        void callMe() {
            System.out.println("A's called method");}    }
    static class B extends A {
        // override callMe()
        void callMe() {
            System.out.println("B's called method");}    }
    static class C extends A {
        // override callMe()
        void callMe() {
            System.out.println("C's called method");}    }
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;
        r = a;
        r.callMe();
        r = b;
        r.callMe();
        r = c;
        r.callMe();
    }


}
