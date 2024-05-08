package edu.training.web.newsproject.controller.concrete.impl;

import edu.training.web.newsproject.beans.AuthInfo;
import edu.training.web.newsproject.beans.User;
import edu.training.web.newsproject.controller.concrete.Command;
import edu.training.web.newsproject.service.ServiceProvider;
import edu.training.web.newsproject.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class DoAuth implements Command {
    private final UserService userService = ServiceProvider.getInstance().getUserService();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("login");
        String password = request.getParameter("password");
        System.out.println(username + " " + password);
        User user = userService.signIn(new AuthInfo(username, password));

        if (user != null) {
            HttpSession session = (HttpSession) request.getSession(true);
            session.setAttribute("user", user);

            response.sendRedirect("MyController?command=go_to_user_index_page");

        } else {
            response.sendRedirect("MyController?command=go_to_auth_page&Info=Wrong login or password!");
        }
    }
}
