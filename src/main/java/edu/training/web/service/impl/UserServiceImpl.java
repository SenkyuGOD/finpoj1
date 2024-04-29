package edu.training.web.service.impl;

import edu.training.web.bean.AuthInfo;
import edu.training.web.bean.Profile;
import edu.training.web.bean.User;
import edu.training.web.bean.UserRegInfo;
import edu.training.web.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User signIn(AuthInfo authInfo) {
        return null;
    }

    @Override
    public boolean registration(UserRegInfo regInfo) {
        return false;
    }

    @Override
    public boolean blockUser(int id) {
        return false;
    }

    @Override
    public Profile userProfile(int id) {
        return null;
    }
}
