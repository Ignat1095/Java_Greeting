package OOP_Java_5;

import OOP_Java_5.di.Component;

public class Main {

    private static final Component appComponent = new Component();

    public static void main(String[] args) {

        appComponent.viewUser.run();
    }
}