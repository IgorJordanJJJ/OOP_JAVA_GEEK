package personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user, String sign);

    void updateUser(User user, String sign);
    void delete(String id, String sign);
}
