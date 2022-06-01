package crud.dao;

import crud.model.User;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getAllUsers() {
        Query query = entityManager.createQuery("SELECT e FROM User e");
        return (List<User>) query.getResultList();
    }

    @Override
    public User saveUser(User user) {
        entityManager.merge(user);
        return user;
    }

    @Override
    public User findUser(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void removeUserById(Long id) {
        entityManager.createQuery("DELETE FROM User u WHERE u.id=:id").setParameter("id", id)
                .executeUpdate();
    }
}
