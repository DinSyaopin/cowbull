package service;

import dao.UserDao;
import dao.UserDaoImpl;
import model.Score;
import model.User;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDaoImpl();

    public UserService() {
    }

    public User findById(long id) {
        return userDao.findById(id);
    }

    public void save(User user) {
        userDao.save(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(User user) {
        userDao.delete(user);
    }

    public Score findScoreById(long id) {
        return userDao.findScoreById(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }
}
