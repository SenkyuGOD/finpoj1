package edu.training.web.newsproject.dao.impl;

import edu.training.web.newsproject.beans.User;
import edu.training.web.newsproject.dao.RegDao;

public class SQLRegDao implements RegDao {
    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(String username) {
        return false;
    }
}
