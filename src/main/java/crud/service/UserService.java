package crud.service;

import crud.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getAllUsers();

    User saveUser(User user);

    User findUser(Long id);

    void removeUserById(Long id);
}
