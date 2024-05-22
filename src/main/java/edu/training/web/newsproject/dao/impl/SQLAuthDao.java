package edu.training.web.newsproject.dao.impl;

import edu.training.web.newsproject.beans.AuthInfo;
import edu.training.web.newsproject.beans.User;
import edu.training.web.newsproject.dao.AuthDao;

import java.util.Optional;

public class SQLAuthDao implements AuthDao {
    @Override
    public Optional<User> getUserByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public boolean userExists(String username) {
        return false;
    }

    @Override
    public User checkToken(String token) {
        return null;
    }

    @Override
    public Optional<User> signIn(AuthInfo authInfo) {
        return Optional.empty();
    }
}
