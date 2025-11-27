package SLO.P6;

public class Box {
    double width;
    double height;
    double depth;
    double weigth;

    Box(){}

    Box(double width, double height , double depth, double weigth){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weigth = weigth;
    }

    public double getVolume(){
        return width * height * depth;
    }

    public void describeBox(){
        System.out.println("Box of volume: " + getVolume() + " weigth: " + weigth);
    }

}
