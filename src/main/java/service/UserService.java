package service;

import dao.UserDao;
import dao.UserDaoImpl;

public class UserService {
    private UserDao userDao = new UserDaoImpl();

    public UserService() {
    }


}
