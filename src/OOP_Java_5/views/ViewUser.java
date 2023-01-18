package OOP_Java_5.views;

import OOP_Java_5.controllers.UserController;
import OOP_Java_5.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду: \n" +
                    "    NONE,\n" +
                    "    READ,\n" +
                    "    CREATE,\n" +
                    "    UPDATE,\n" +
                    "    LIST,\n" +
                    "    DELETE,\n" +
                    "    EXIT\n" +
                    "    :");
            com = Commands.valueOf(command.toUpperCase());
            if (com == Commands.EXIT) return;
            try {
                switch (com) {
                    case CREATE:
                        String firstName = prompt("Имя: ");
                        String lastName = prompt("Фамилия: ");
                        String phone = prompt("Номер телефона: ");
                        userController.saveUser(new User(firstName, lastName, phone));
                        break;
                    case READ:
                        String id = prompt("id: ");
                        User user = userController.readUser(id);
                        System.out.println(user);
                        break;
                    case LIST:
                        List<User> lst = userController.readList();
                        lst.forEach(i -> System.out.println(i + "\n"));
                        break;
                    case UPDATE:
                        String numId = prompt("Какой контакт редактировать? Введите номер id: ");
                        userController.idPresenceValidation(numId);
                        userController.updateUser(numId, createAGuy());
                        break;
                    case DELETE:
                        String deleteId = prompt("Какой контакт удалить? Введите номер id: ");
                        userController.idPresenceValidation(deleteId);
                        userController.deleteUser(deleteId);
                        userController.readList()
                                .forEach(i -> System.out.println(i + "\n"));
                        break;
                }
            } catch (Exception e) {
                System.out.println("Oopsie!\n"+ e.getMessage()); ;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User createAGuy() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        User newGuy = new User(firstName, lastName, phone);
        return newGuy;
    }
}
