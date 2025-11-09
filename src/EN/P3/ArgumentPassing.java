package EN.P3;

public class ArgumentPassing {

    public static void main(String[] args) {
        int[] x = {5};
        incPrint(x);
        System.out.println(x[0]);
    }

    public static void incPrint(int[] x){
        x[0] = 1000;
        System.out.println(x[0]);
    }

    public static void passByValue(){
        int x = 22;
        incPrint(x);
        System.out.println(x);
    }

    public static void incPrint(int x){
        ++x;
        System.out.println(x);
    }

}
