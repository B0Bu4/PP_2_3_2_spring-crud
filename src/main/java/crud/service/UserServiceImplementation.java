package crud.service;

import crud.dao.UserDao;
import crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImplementation(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public User findUser(Long id) {
        return userDao.findUser(id);
    }

    @Override
    public void removeUserById(Long id) {
        userDao.removeUserById(id);
    }
}
