package dao;

import model.Score;
import model.User;

import java.util.List;

public interface UserDao {
    User findById(long id);
    void save(User user);
    void update(User user);
    void delete(User user);
    Score findScoreById(long id);
    List<User> findAll();
}
