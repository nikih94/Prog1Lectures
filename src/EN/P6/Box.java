package EN.P6;

public class Box extends PostaItem {
    double w;
    double h;
    double d;
    double weight;

    public Box(double w, double h, double d, double weight){
        this.w = w;
        this.h = h;
        this.d = d;
        this.weight = weight;
    }

    public Box(double postageRate,double w, double h, double d, double weight){
        super(postageRate);
        this.w = w;
        this.h = h;
        this.d = d;
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public double getVolume(){
        return w * h * d;
    }

    public void describeBox(){
        System.out.println("Box of volume: " + getVolume() +
                ", weight: "+ weight);
    }

}
