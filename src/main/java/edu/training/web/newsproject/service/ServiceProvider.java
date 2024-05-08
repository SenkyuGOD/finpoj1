package edu.training.web.newsproject.service;

import edu.training.web.newsproject.service.impl.InfoServiceImpl;
import edu.training.web.newsproject.service.impl.UserServiceImpl;

public class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();

    private final UserService userService = new UserServiceImpl();
    private final InfoService infoService = new InfoServiceImpl();


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
