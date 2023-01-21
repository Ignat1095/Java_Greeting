package OOP_Java_6;

import OOP_Java_6.di.Component;

public class Main {

    private static final Component appComponent = new Component();

    public static void main(String[] args) {

        appComponent.noteView.run();
    }
}
