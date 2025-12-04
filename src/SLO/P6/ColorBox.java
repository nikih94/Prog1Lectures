package SLO.P6;

public class ColorBox extends Box{

    String color;

    ColorBox(){}

    ColorBox(double width, double height, double depth, double weight , String color){
        super(width,height,depth,weight);
        this.color = color;
    }

    public void describeBox(){
        super.describeBox();
        System.out.println("Box of color: "+ color);
    }


}
