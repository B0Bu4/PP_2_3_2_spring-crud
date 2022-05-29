package crud.dao;

import crud.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> getAllUsers();

    User saveUser(User user);

    User findUser(Long id);

    void removeUserById(Long id);

}
