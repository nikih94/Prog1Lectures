package SLO.P6;

public abstract class PostalItem {

    double postageRate;

    PostalItem(){}

    public PostalItem(double postageRate){
        this.postageRate = postageRate;
    }

    abstract double getVolume();
    abstract double getWeight();

    public double calculatePostage(){
        return getVolume() * getWeight() * postageRate;
    }

}
