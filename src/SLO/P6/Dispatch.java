package SLO.P6;

public class Dispatch {
    static class A {
        void callMe() {
            System.out.println("A's called method");      }    }
    static class B extends A {
        // override callMe()
        void callMe() {
            System.out.println("B's called method");        }    }
    static class C extends A {
        // override callMe()
        void callMe() {
            System.out.println("C's called method");        }    }
    public static void main(String[] args) {
        A a = new A(); // object of type A
        B b = new B(); // object of type B
        C c = new C(); // object of type C

        A r;
        r = b;
        r.callMe();
        r = c;
        r.callMe();
    }
}
