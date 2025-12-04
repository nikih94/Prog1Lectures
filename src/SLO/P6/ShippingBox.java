package SLO.P6;

public class ShippingBox extends Box implements Shippable{
    String shippingAddress;

    ShippingBox(String shippingAddress, double postageRate, double w,
                double h, double d,double weight){
        super(postageRate,w,h,d,weight);
        this.shippingAddress = shippingAddress;
    }

    @Override
    public void printShippingLabel() {
        System.out.println(shippingAddress);
    }

    public String toString(){
        return shippingAddress;
    }
}
