package OOP_Java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product water = new Product("water", 15.3);
        System.out.println(water);

        VendingMachine machine = new VendingMachine();
        System.out.println(machine);
        List<Product> goods = new ArrayList<>();
        goods.add(water);
        goods.add(new Product("milk", 56));
        goods.add(new Product("bread", 43));
        goods.add(new SodaWater("kind", 24, "grapes"));
        goods.add(new Milk("sour cream", 68,  1000));
        goods.add(new Milk("yogurt", 24, 500));
        goods.add(new Bread("button", 23, 1.8));

        VendingMachine machine1 = new VendingMachine(goods);
        System.out.println(machine1);
        System.out.println(machine1.findByName("kind"));
        System.out.println(machine1.findByPrice(68));
        System.out.println(machine1.findByPriceRange(10,61));


    }
}