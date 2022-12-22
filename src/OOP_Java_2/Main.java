package OOP_Java_2;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Marsa",4,"Ignat"))
                .addAnimal(new Dog("Zig",4,"Zag"))
                .addAnimal(new Duck("Donald",2,"Ivan"))
                .addAnimal(new Eagle("Rocket",2,"Quill"))
                .addAnimal(new Octopus("Octavius", 8, "Piter Parker" ));
        System.out.println(zoo.toString());
        System.out.println(zoo.talk());
        for (Runable i: zoo.getRunable()) {
            System.out.println(i.runSpeed());
        }
        System.out.println(zoo.getChampionSpeed());
        System.out.println("_____________");
        for (Flyable i: zoo.getFlyable())
        {
            System.out.println(i.flySpeed());
        }
        SaveManagerAnimals saveManagerAnimals = new SaveManagerAnimals();
        saveManagerAnimals.save(zoo.getAnimals());

    }
}