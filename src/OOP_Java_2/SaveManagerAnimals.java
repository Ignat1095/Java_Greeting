package OOP_Java_2;

import java.util.List;
import java.io.*;

public class SaveManagerAnimals {
    public void save(List<Animal> animals) {
        try (FileWriter writer = new FileWriter("src/OOP_Java_2/List.txt", false)) {
            for (Animal item:animals) {
                writer.write(item.toString() + "\n");

            }
            writer.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}