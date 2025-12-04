package SLO.P6;

public class Main2 {

    public static void main(String[] args) {
        Box pi = new Box(0.2,3,3,3,20);

        Object rf = pi;

        pi.describeBox();
        System.out.println("Postnina: "+ pi.calculatePostage());

        ShippingBox sb = new ShippingBox("FAMNIT, glagoljaska 6",0.3,4,4,4,10);

        System.out.println("Postnina: "+sb.calculatePostage());
        sb.printShippingLabel();
        sb.describeBox();

        rf = sb;

        System.out.println(sb);

        if( rf instanceof ColorBox){
            System.out.println("Objekt je tipa color box");
        }


    }
}
