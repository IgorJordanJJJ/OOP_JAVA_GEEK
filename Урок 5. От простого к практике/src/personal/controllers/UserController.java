package personal.controllers;

import personal.model.Repository;
import personal.model.User;

import java.util.List;

public class UserController {

    private final Validat valid = new Validat();
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user, String sign) {
        valid.validate(user);
        repository.CreateUser(user , sign);
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

    public List<User> allUsers() {
        return repository.getAllUsers();

    }
    public void updateUser(User user, String sign){
        valid.validate(user);
        repository.updateUser(user, sign);
    }

    public void delete(String id, String sign) {
        repository.delete(id, sign);
    }



}
