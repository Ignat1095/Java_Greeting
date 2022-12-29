package OOP_Java_4;

public class FlatBow extends Bow{
    @Override
    public int range() {
        return 120;
    }

    @Override
    public int damage() {
        return 45;
    }
    @Override
    public String toString() {
        return "Плоский лук" + super.toString();
    }
}
