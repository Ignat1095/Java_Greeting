package OOP_Java_5.controllers;

import OOP_Java_5.model.Repository;
import OOP_Java_5.model.User;

import java.util.List;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) throws Exception {
        validateUser(user);
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }

    public List<User> readList() {
        List<User> result = repository.getAllUsers();
        return result;
    }

    public void updateUser(String idNumber, User newGuy) throws Exception {
        idPresenceValidation(idNumber);
        newGuy.setId(idNumber);
        validateUserId(newGuy);
        repository.updateUser(newGuy);
    }

    public void deleteUser(String idNumber) throws Exception {
        idPresenceValidation(idNumber);
        repository.deleteUser(
                readUser(idNumber)
        );
    }

    private void validateUser(User user) throws Exception {
        if (user.getFirstName().contains(" "))
            throw new Exception("User name has unacceptable characters");
        if (user.getLastName().contains(" "))
            throw new Exception("User lastname has unacceptable characters");
    }

    private void validateUserId(User user) throws Exception {
        if (user.getId().isEmpty())
            throw new Exception("User has no id");
        validateUser(user);
    }

    public void idPresenceValidation(String inputId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User u : users) {
            if (u.getId().equals(inputId))
                return;
        }
        throw new Exception("No such ID here");
    }
}
