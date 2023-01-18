package OOP_Java_5.di;

import OOP_Java_5.controllers.UserController;
import OOP_Java_5.model.FileOperation;
import OOP_Java_5.model.Repository;
import OOP_Java_5.views.ViewUser;

public class Component {

    public FileOperation fileOperation;
    public Repository repository;
    public UserController userController;
    public ViewUser viewUser;

    public Component() {

        fileOperation = Module.provideFileOPeration();
        repository = Module.provideRepository(fileOperation, Module.provideMapper());
        userController = Module.provideUserController(repository);
        viewUser = Module.provideViewUser(userController);
    }
}
