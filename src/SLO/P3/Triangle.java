package SLO.P3;

public class Triangle {

    private static int triangleCount = 0;

    private int a,b,c;
    private final String color;

    Triangle(int a, int b, int c, String color){
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
        triangleCount++;
        System.out.println("Created a new Triangle, total count: "+triangleCount);
    }

    Triangle(int a, String color){
        this.a = a;
        this.b = a;
        this.c = a;
        this.color = color;
        triangleCount++;
        System.out.println("Created a new Triangle, total count: "+triangleCount);
    }

    public Triangle clone(){
        return new Triangle(this.a,b,c,color);
    }

    public Triangle vrniVecjega(Triangle t2){
        if( this.getPerimeter() > t2.getPerimeter() ){
            return this;
        }
        return t2;
    }

    public int getPerimeter(){
        return a+b+c;
    }

    public boolean isEquilateral(){
        return a == b && b ==c;
    }

    public boolean isIsosceles(){
        return a == b || b == c || c == a;
    }

    public static void printNumTriangles(){
        System.out.println("Number of Triangles: "+triangleCount);
    }

    public int getA(){
        return a;
    }

    public void setA(int a){
        if(a > 0) {
            this.a = a;
        }else{
            System.out.println("Invalid value");
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getColor() {
        return color;
    }
}
