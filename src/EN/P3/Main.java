package EN.P3;

public class Main {

    public static void main(String[] args) {

        Triangle t1 = new Triangle(3,4,5,"red");
        Triangle t2 = new Triangle(5,5,5,"blue");

        Triangle larger = t2.clone();

        System.out.println(t2.getA());
        System.out.println(larger.getA());

        t2.setA(1000);
        System.out.println(t2.getA());
        System.out.println(larger.getA());

    }

}
