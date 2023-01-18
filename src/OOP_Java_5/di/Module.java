package OOP_Java_5.di;

import OOP_Java_5.controllers.UserController;
import OOP_Java_5.model.FileOperation;
import OOP_Java_5.model.FileOperationImpl;
import OOP_Java_5.model.Mapper;
import OOP_Java_5.model.Repository;
import OOP_Java_5.model.RepositoryAlternativeFile;
import OOP_Java_5.model.UserMapperAlternative;
import OOP_Java_5.views.ViewUser;

public class Module {

    public static FileOperation provideFileOPeration() {
        return new FileOperationImpl("users.txt");
    }

    public static Mapper provideMapper() {
        return new UserMapperAlternative();
    }

    public static Repository provideRepository(
            FileOperation fileOperation,
            Mapper mapper
    ) {
        return new RepositoryAlternativeFile(mapper ,fileOperation);
    }

    public static UserController provideUserController(
            Repository repository
    ) {
        return new UserController(repository);
    }

    public static ViewUser provideViewUser(
            UserController controller
    ) {
        return new ViewUser(controller);
    }
}
