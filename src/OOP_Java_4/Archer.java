package OOP_Java_4;

public class Archer extends Warrior< LigthShield, Bow> {
    LigthShield ligthShield;
    Bow bow;


    public Archer(String name, int healthPoint, LigthShield ligthShild, Bow bow) {
        super(name, healthPoint, ligthShild, bow);
    }

    @Override
    public String toString() {
        return "Лучник" + super.toString();
    }
}
