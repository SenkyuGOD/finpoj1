package edu.training.web.newsproject.service.impl;

import edu.training.web.newsproject.beans.AuthInfo;
import edu.training.web.newsproject.beans.User;
import edu.training.web.newsproject.beans.UserRegInfo;
import edu.training.web.newsproject.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User signIn(AuthInfo authInfo) {
        if (authInfo.getLogin().equals("admin")) {
            return new User(1, "Senkyu", "admin");
        } else {
            return new User(2, "Clown", "user");
        }
    }

    @Override
    public boolean registration(UserRegInfo regInfo) {
        if (regInfo.getEmail().equals(null) || regInfo.getPassword().equals(null)) {
            return false;
        }
        return true;
    }
    @Override
    public User getInfo(AuthInfo authInfo) {
        User user = new User();
        user.setUsername(authInfo.getLogin());
        if(authInfo.getPassword().equals("admin")) {
            user.setRole("admin");
        } else {
            user.setRole("user");
        }
        return user;
    }
}
