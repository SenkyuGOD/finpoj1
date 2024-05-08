package edu.training.web.newsproject.controller.concrete.impl;

import edu.training.web.newsproject.controller.concrete.Command;
import edu.training.web.newsproject.service.InfoService;
import edu.training.web.newsproject.service.ServiceProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class GoToProfilePage implements Command {
    private final InfoService UserService = ServiceProvider.getInstance().getInfoService();
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
