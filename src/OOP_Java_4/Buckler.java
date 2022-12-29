package OOP_Java_4;

public class Buckler extends LigthShield {
    @Override
    public int endurance() {
        return 70;
    }
    @Override
    public int protection() {
        return 100;
    }
    @Override
    public String toString() {
        return "Баклер(Легкий щит): " + super.toString();
    }
}
