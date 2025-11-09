package SLO.P3;

public class Main {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(2,5,8,"rdec");
        Triangle t2 = new Triangle(10,5,5,"zelen");
        Triangle t3 = t1.clone();

        System.out.println(t3.getColor());
        t3.setA(1000);
        System.out.println(t2.getA());
    }

}
