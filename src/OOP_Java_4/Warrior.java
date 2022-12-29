package OOP_Java_4;

public abstract class Warrior<E extends Defense, T extends Weapon> {
    private String name;
    int healthPoint;
    private E defense;
    private T  weapon;

    @Override
    public String toString() {
        return String.format("Имя героя: %s, здоровье: %d, защита: %s, вооружение: %s", name, healthPoint, defense, weapon);
    }

    public Warrior(String name, int healthPoint, E defense, T weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.defense = defense;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public E getDefense() {
        return defense;
    }

    public void setDefense(E defense) {
        this.defense = defense;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

}
