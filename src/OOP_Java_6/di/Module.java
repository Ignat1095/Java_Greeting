package OOP_Java_6.di;

import OOP_Java_6.controllers.NoteController;
import OOP_Java_6.model.FileStorage;
import OOP_Java_6.model.IMapper;
import OOP_Java_6.model.INoteController;
import OOP_Java_6.model.IRepository;
import OOP_Java_6.model.IStorage;
import OOP_Java_6.model.IValidator;
import OOP_Java_6.model.MapperIml;
import OOP_Java_6.model.RepositoryImpl;
import OOP_Java_6.views.NoteView;

public class Module {

    public static IStorage provideStorage() {
        return new FileStorage("notes.txt");
    }

    public static IMapper provideMapper() {
        return new MapperIml();
    }

    public static IValidator provideValidator() {
        return new MapperIml();
    }

    public static IRepository provideRepository(
            IStorage storage,
            IMapper mapper
    ) {
        return new RepositoryImpl(mapper, storage);
    }

    public static INoteController provideNoteController(
            IRepository repository,
            IValidator validator
    ) {
        return new NoteController(repository, validator);
    }

    public static NoteView provideView(
            INoteController controller
    ) {
        return new NoteView(controller);
    }
}
