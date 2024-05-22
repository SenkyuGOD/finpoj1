package edu.training.web.newsproject.dao;

import edu.training.web.newsproject.beans.User;
import edu.training.web.newsproject.beans.UserRegInfo;

public interface RegDao {

    boolean addUser(User user);


    boolean updateUser(User user);


    boolean deleteUser(String username);

}
