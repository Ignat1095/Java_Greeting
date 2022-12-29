package OOP_Java_4;

public class Bastard extends Sword{
    @Override
    public int damage(){
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Полуторный меч наносит урон: %d", damage());
    }
}
