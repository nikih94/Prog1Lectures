package SLO.P6;

public class Main {

    public static void main(String[] args) {
        Box b = new Box(3,3,3,10);
        //b.describeBox();

        ColorBox cb = new ColorBox(4,4,4,15,"yellow");
        System.out.println("Volumen: " +cb.getVolume());
        cb.describeBox();
    }
}
