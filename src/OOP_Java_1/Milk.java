package OOP_Java_1;

public class Milk extends Product {
    public Milk(String name, double price,int volume) {
        super(name, price);
        this.setVolume(volume);
    }
    private Integer volume;
    public Integer getVolume() {
        return volume;
    }
    private void setVolume(Integer volume) {
        this.volume = volume;
    }
    public String toString() {
        return String.format("%s - %s", super.toString(), volume);
    }

}