package OOP_Java_4;

import java.util.*;

public class Team <T extends Warrior> implements Iterable<T> {
    List<T> warriors = new ArrayList<>();
    private Captain captain;

    public Captain getCaptain() {
        return captain;
    }

    public Team(Captain captain) {
        this.captain = captain;
    }

    public void addWarriors(T newWarrior) {
        warriors.add(newWarrior);
    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }

    public int getAllDamage() {
        int sumDamage = 0;
        for (T item : warriors) {
            sumDamage += item.getWeapon().damage();
        }
        return sumDamage;
    }

    public int getAllHealthPoint() {
        int sumHealth = 0;
        for (T item : this) {
            sumHealth += item.getHealthPoint();
        }
        return sumHealth;
    }

    public int getMaxRadius() {
        int maxRange = 0;
        for (T item : this) {
            Weapon weapon = item.getWeapon();
            if (weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                if (maxRange < bow.range()) {
                    maxRange = bow.range();
                }
            }
        }
        return maxRange;
    }


    public int minProtected() {
        int minDefense = warriors.get(0).getDefense().protection();
        for (T item : this) {
            Defense defense = item.getDefense();
            if (defense instanceof Shields) {
                Shields shield = (Shields) defense;
                if (minDefense > shield.protection()) {
                    minDefense = shield.protection();
                }
            }
        }
        return minDefense;
    }

}