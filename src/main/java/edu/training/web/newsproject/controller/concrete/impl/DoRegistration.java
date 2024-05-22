package edu.training.web.newsproject.controller.concrete.impl;

import edu.training.web.newsproject.controller.concrete.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;

public class DoRegistration implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("username " + request.getParameter("username"));
        System.out.println("password " + request.getParameter("password"));
        System.out.println("confirm_password " + request.getParameter("confirm_password"));


        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}
