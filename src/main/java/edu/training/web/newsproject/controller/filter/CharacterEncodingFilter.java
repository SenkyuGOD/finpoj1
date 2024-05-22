package edu.training.web.newsproject.controller.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

public class CharacterEncodingFilter extends HttpServlet implements Filter {

    public CharacterEncodingFilter() {
        super();
    }

    public void destroy() {

    }


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        chain.doFilter(request, response);
    }


    public void init(FilterConfig fConfig) throws ServletException {
    }
}
