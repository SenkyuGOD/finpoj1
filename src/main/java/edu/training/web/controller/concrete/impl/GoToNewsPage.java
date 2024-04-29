package edu.training.web.controller.concrete.impl;

import edu.training.web.bean.News;
import edu.training.web.controller.concrete.Command;
import edu.training.web.service.InfoService;
import edu.training.web.service.ServiceProvider;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class GoToNewsPage implements Command {
    private final InfoService infoService = ServiceProvider.getInstance().getInfoService();
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<News> mainNews  = infoService.lastNews();
        request.setAttribute("mainNews", mainNews);
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/news1.jsp");
        dispatcher.forward(request, response);
    }
}
