package OOP_Java_6.views;

import OOP_Java_6.model.INoteController;
import OOP_Java_6.model.Note;

import java.util.List;
import java.util.Scanner;

public class NoteView {

    private final INoteController noteController;

    public NoteView(INoteController noteController) {
        this.noteController = noteController;
    }

    public void run() {
        Intentions intention = Intentions.NONE;

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
            intention = Intentions.valueOf(command.toUpperCase());
            if (intention == Intentions.EXIT) return;
            try {
                switch (intention) {
                    case CREATE:
                        String header = prompt("Введите заголовок: ");
                        String text = prompt("Введите текст: ");
                        noteController.saveNote(new Note(header, text));
                        break;
                    case READ:
                        String id = prompt("Идентификатор записки: ");
                        Note note = noteController.readNote(id);
                        System.out.println(note);
                        break;
                    case LIST:
                        List<Note> lst = noteController.readList();
                        lst.forEach(i -> System.out.println(i + "\n"));
                        break;
                    case UPDATE:
                        String numId = prompt("Какую записку редактировать? Введите номер ID: ");
                        noteController.idPresenceValidation(numId);
                        noteController.updateNote(numId, createNote());
                        break;
                    case DELETE:
                        String deleteId = prompt("Какой контакт удалить? Введите номер ID: ");
                        noteController.idPresenceValidation(deleteId);
                        noteController.deleteNote(deleteId);
                        noteController.readList()
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

    private Note createNote() {
        String header = prompt("Заголовок: ");
        String text = prompt("Текст: ");
        return new Note(header, text);
    }
}
