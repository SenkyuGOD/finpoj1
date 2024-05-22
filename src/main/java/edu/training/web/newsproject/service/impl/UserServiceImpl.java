package edu.training.web.newsproject.service.impl;

import edu.training.web.newsproject.beans.AuthInfo;
import edu.training.web.newsproject.beans.User;
import edu.training.web.newsproject.beans.UserRegInfo;
import edu.training.web.newsproject.dao.AuthDao;
import edu.training.web.newsproject.dao.DaoException;
import edu.training.web.newsproject.dao.DaoProvider;
import edu.training.web.newsproject.service.ServiceException;
import edu.training.web.newsproject.service.UserService;

import java.util.Optional;

public class UserServiceImpl implements UserService {
    private AuthDao daoProvider = DaoProvider.getInstance().getAuthDao();
    @Override
    public Optional<User> signIn(AuthInfo authInfo) throws  ServiceException{

        return daoProvider.signIn(authInfo);
    }
    @Override
    public User rememberMe(String token) throws ServiceException {
        return daoProvider.checkToken(token);
    }

    @Override
    public boolean registration(UserRegInfo regInfo) throws ServiceException {
       try {
           if(regInfo.getEmail() == null || regInfo.getEmail().trim().equals("")) {
               return false;
           } else {
               return true;
           }
       } catch (Exception e) {
           throw new ServiceException(e);
       }
    }
    @Override
    public User getInfo(AuthInfo authInfo) {
        User user = new User();
        user.setUsername(authInfo.getUsername());
        if(authInfo.getPassword().equals("admin")) {
            user.setRole("admin");
        } else {
            user.setRole("user");
        }
        return user;
    }


}
