package OOP_Java_1;

public class Bread extends Product {
    public Bread(String name, int price, double weight){
        super(name, price);
        this.setWeight(weight);
    }
    private Double weight;

    public Double getWeight(){
        return weight;
    }
    private void setWeight(Double weight){
        this.weight = weight;
    }
    public String toString() {
        return String.format("%s - %s", super.toString(), weight);
    }

}