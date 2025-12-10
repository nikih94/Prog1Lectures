package EN.P6;

public class ShippingBox extends Box implements Shippable{

    public String shippingAddress;

    public ShippingBox(String shippingAddress,double postageRate, double w, double h, double d, double weight) {
        super(postageRate, w, h, d, weight);
        this.shippingAddress = shippingAddress;
    }

    public String toString(){
        return shippingAddress;
    }

    @Override
    public void printShippingLabel() {
        System.out.println("Shipping address: "+ shippingAddress);
    }
}
