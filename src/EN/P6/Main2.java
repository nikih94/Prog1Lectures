package EN.P6;

public class Main2 {

    public static void main(String[] args) {

        Box b = new Box(0.2,5,5,5,25);

        b.describeBox();
        System.out.println("PostageRate: "+ b.calculatePostage());

        ShippingBox sb = new ShippingBox("Koper 4, 6000",0.1,4,4,4,20);
        sb.printShippingLabel();
        System.out.println("Calculate postage: "+sb.calculatePostage());
    }
}
