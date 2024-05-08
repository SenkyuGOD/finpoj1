package edu.training.web.newsproject.service;

import edu.training.web.newsproject.beans.AuthInfo;
import edu.training.web.newsproject.beans.User;
import edu.training.web.newsproject.beans.UserRegInfo;

public interface UserService {
    User signIn(AuthInfo authInfo);

    boolean registration(UserRegInfo regInfo);

    User getInfo(AuthInfo authInfo);
}
