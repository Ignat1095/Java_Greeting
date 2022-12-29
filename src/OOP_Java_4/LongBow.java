package OOP_Java_4;

public class LongBow extends Bow{
    @Override
    public int range() {
        return 350;
    }

    @Override
    public int damage() {
        return 90;
    }

    @Override
    public String toString() {
        return "Большой лук" + super.toString();
    }
}
