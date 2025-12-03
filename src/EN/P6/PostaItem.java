package EN.P6;

public abstract class PostaItem {

    double postageRate;

    PostaItem(){}

    PostaItem(double postageRate){
        this.postageRate = postageRate;
    }

    abstract double getVolume();
    abstract double getWeight();

    public double calculatePostage(){
        return getVolume() * getWeight() * postageRate;
    }


}
