package SLO.P3;

public class PodajanjeArgumentov {


    public static void main(String[] args) {
        prenosPoReferenci();
    }

    public static void prenosPoReferenci(){
        int[] x = {1};
        set1000(x);
        System.out.println(x[0]);
    }

    public static void set1000(int[] x){
        x[0] = 1000;
        System.out.println(x[0]);
    }

    public static void prenosPoVrednosti() {
        int x = 12;
        incPrint(x);
        System.out.println(x);
    }

    public static void incPrint(int x){
        ++x;
        System.out.println(x);
    }
}
