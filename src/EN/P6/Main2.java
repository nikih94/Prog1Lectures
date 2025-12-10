package EN.P6;

public class Main2 {

    public static void main(String[] args) {

        Box b = new Box(0.2,5,5,5,25);

        b.describeBox();
        System.out.println("PostageRate: "+ b.calculatePostage());

        ShippingBox sb = new ShippingBox("Koper 4, 6000",0.1,4,4,4,20);
        sb.printShippingLabel();
        System.out.println("Calculate postage: "+sb.calculatePostage());

        System.out.println(sb);

        Object[] boxes = new Box[3];
        boxes[0] = b;
        boxes[1] = sb;
        boxes[2] = new ColorBox(2,3,2,1,"Red");

        for (int i = 0; i < boxes.length; i++) {
            if(boxes[i] instanceof Box) {
                ((Box)boxes[i]).describeBox();
            }
            if( boxes[i] instanceof Shippable){
                ((Shippable) boxes[i]).printShippingLabel();
            }
        }



    }
}
