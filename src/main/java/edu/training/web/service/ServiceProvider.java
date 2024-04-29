package edu.training.web.service;

import edu.training.web.service.impl.InfoServiceImpl;
import edu.training.web.service.impl.UserServiceImpl;

public class ServiceProvider {
    private static ServiceProvider instance = new ServiceProvider();

    private UserService userService = new UserServiceImpl();
    private InfoService infoService = new InfoServiceImpl();


    private ServiceProvider() {
    }

    public static ServiceProvider getInstance() {
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }

    public InfoService getInfoService() {
        return infoService;
    }
}
