package service;

import model.Score;
import model.User;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();
        User user = new User("user1", "qwerty");
        userService.save(user);
        Score score = new Score(user.getId(), "1234");
        user.addScore(score);
        score.setUser(user);
    }
}
