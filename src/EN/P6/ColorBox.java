package EN.P6;

public class ColorBox extends Box{

    String color;

    ColorBox(double w, double h, double d, double weight, String color){
        super(w,h,d,weight);
        this.color = color;
    }

    public void describeBox(){
        super.describeBox();
        System.out.println("Box of color: "+ color);
    }

}
