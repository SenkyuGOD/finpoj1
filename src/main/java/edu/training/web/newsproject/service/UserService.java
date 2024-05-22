package edu.training.web.newsproject.service;

import edu.training.web.newsproject.beans.AuthInfo;
import edu.training.web.newsproject.beans.User;
import edu.training.web.newsproject.beans.UserRegInfo;

import java.util.Optional;

public interface UserService {
    Optional<User> signIn(AuthInfo authInfo) throws ServiceException;

    boolean registration(UserRegInfo regInfo) throws ServiceException;

    User getInfo(AuthInfo authInfo) throws ServiceException;

    User rememberMe(String token) throws ServiceException;
}
