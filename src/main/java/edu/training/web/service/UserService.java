package edu.training.web.service;

import edu.training.web.bean.AuthInfo;
import edu.training.web.bean.Profile;
import edu.training.web.bean.User;
import edu.training.web.bean.UserRegInfo;

public interface UserService {
    User signIn(AuthInfo authInfo);

    boolean registration(UserRegInfo regInfo);

    boolean blockUser(int id);

    Profile userProfile(int id);

}
