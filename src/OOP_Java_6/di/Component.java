package OOP_Java_6.di;

import OOP_Java_6.model.INoteController;
import OOP_Java_6.model.IRepository;
import OOP_Java_6.model.IStorage;
import OOP_Java_6.views.NoteView;

public class Component {

    public IStorage storage;
    public IRepository repository;
    public INoteController noteController;
    public NoteView noteView;

    public Component() {

        storage = Module.provideStorage();
        repository = Module.provideRepository(storage, Module.provideMapper());
        noteController = Module.provideNoteController(repository, Module.provideValidator());
        noteView = Module.provideView(noteController);
    }
}
