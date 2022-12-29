package OOP_Java_4;

public class TwoHandedSword extends Sword {
    @Override
    public int damage() {
        return 140;
    }

    @Override
    public String toString() {
        return String.format("Двуручный меч наносит урон: %d", damage());
    }
}