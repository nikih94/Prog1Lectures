package SLO.P6;

public class ColorBox extends Box{

    String color;

    ColorBox(double width, double height, double depth, double weght , String color){

    }

    public void describeBox(){
        super.describeBox();
        System.out.println("Box of color: "+ color);
    }


}
