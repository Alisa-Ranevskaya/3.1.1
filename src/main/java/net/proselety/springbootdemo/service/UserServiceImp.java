package net.proselety.springbootdemo.service;
import net.proselety.springbootdemo.dao.UserDao;
import net.proselety.springbootdemo.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void createUsersTable() {
        userDao.createUsersTable();
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Transactional
    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Transactional
    @Override
    public void updateUser(long id, User updatedUser){
        userDao.updateUser(id, updatedUser);
    }
}