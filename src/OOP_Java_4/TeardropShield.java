package OOP_Java_4;

public class TeardropShield extends HeavyShield{
    @Override
    public int endurance() {
        return 170;
    }
    @Override
    public int protection() {
        return 200;
    }
    @Override
    public String toString() {
        return "Каплевидный щит: " + super.toString();
    }
}
