package OOP_Java_4;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------первый отряд---------------");
        Captain captain = new Captain("Djo", 500, new Buckler(), new LongBow());
        Team<Archer> archerTeam = new Team<>(captain);
        System.out.println(captain);
        archerTeam.addWarriors(new Archer("Salamon", 230, new Buckler(), new FlatBow()));
        archerTeam.addWarriors(new Archer("Flint", 145, new Buckler(), new FlatBow()));
        archerTeam.forEach(System.out::println);
        System.out.println("Суммарный урон:" + archerTeam.getAllDamage()+" "+
                "Суммарное здоровье:"+ " " + archerTeam.getAllHealthPoint() + " " +
                "Зона поражение макс:"+ " " + archerTeam.getMaxRadius()+ " " + "Минимальная защита: " + archerTeam.minProtected());
        System.out.println("---------------второй отряд--------------");
        Captain captain1 = new Captain("Zafar", 400, new Buckler(), new TwoHandedSword());
        Team<Knight> knigthTeam = new Team<>(captain1);
        knigthTeam.addWarriors(new Knight("David", 170, new TeardropShield(), new Bastard()));
        knigthTeam.addWarriors(new Knight("Garold", 190, new TeardropShield(), new Bastard()));
        System.out.println(captain1);
        for(Knight item:knigthTeam){
            System.out.println(item);
        }
        System.out.println("Суммарный урон:" + knigthTeam.getAllDamage()+" "+
                "Суммарное здоровье:"+ " " + knigthTeam.getAllHealthPoint() + " " +
                "Зона поражение макс:"+ " " + knigthTeam.getMaxRadius()+ " " + "Минимальная защита: " + knigthTeam.minProtected());
        System.out.println("-----------------третья команда----------------");
        Captain captain2 = new Captain("Karl", 550, new TeardropShield(), new Bastard());
        Team<Warrior> consolidateTeam = new Team<>(captain2);
        consolidateTeam.addWarriors(new Archer("Damir", 160, new Buckler(), new LongBow()));
        consolidateTeam.addWarriors(new Knight("Adam", 140, new TeardropShield(), new Bastard()));
        consolidateTeam.addWarriors(new Knight("Egor", 170, new TeardropShield(), new TwoHandedSword()));
        System.out.println(captain2);
        consolidateTeam.forEach(System.out::println);
        System.out.println("Суммарный урон:" + consolidateTeam.getAllDamage()+" "+
                "Суммарное здоровье:"+ " " + consolidateTeam.getAllHealthPoint() + " " +
                "Зона поражение макс:"+ " " + consolidateTeam.getMaxRadius()+ " " + "Минимальная защита: " + consolidateTeam.minProtected());


    }
}