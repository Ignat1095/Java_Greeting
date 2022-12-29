package OOP_Java_4;

public class Captain extends Warrior<Defense, Weapon>{
    public Captain(String name, int healthPoint,Defense defense, Weapon weapon) {
        super(name, healthPoint, defense, weapon);
    }

    @Override
    public String toString() {
        return "Командир: " + super.toString();
    }
}
