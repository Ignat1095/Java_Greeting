package OOP_Java_1;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }

    public String getName() {//чтение элемента
        return name;
    }

    private void setName(String name) {//
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){
        return  String.format("%s - %f", name, price);
    }
}