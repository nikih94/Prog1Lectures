package SLO.P6;

public class Box extends PostalItem {
    double width;
    double height;
    double depth;
    double weigth;

    Box(){}

    Box(double postageRate,double width, double height , double depth, double weigth){
        super(postageRate);
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weigth = weigth;
    }

    Box(double width, double height , double depth, double weigth){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weigth = weigth;
    }

    public double getWeight(){
        return weigth;
    }
    public double getVolume(){
        return width * height * depth;
    }
    public void describeBox(){
        System.out.println("Box of volume: " + getVolume() + " weigth: " + weigth);
    }

}
