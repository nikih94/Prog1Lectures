package EN.P6;

public class Main {

    public static void main(String[] args) {
        Box b = new Box(5,5,5,25);

        b.describeBox();

        ColorBox cb = new ColorBox(3,3,3,10,"red");

        System.out.println(cb.getVolume());
        cb.describeBox();

    }
}
