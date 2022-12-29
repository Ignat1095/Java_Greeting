package OOP_Java_4;

public class Knight extends Warrior<HeavyShield, Sword>{
    public Knight(String name, int healthPoint, HeavyShield shields, Sword weapon) {
        super(name, healthPoint, shields, weapon);
    }

    @Override
    public String toString() {
        return "Рыцарь: " + super.toString();
    }
}
