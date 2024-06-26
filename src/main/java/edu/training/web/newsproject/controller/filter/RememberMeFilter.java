package edu.training.web.newsproject.controller.filter;

import edu.training.web.newsproject.beans.User;
import edu.training.web.newsproject.service.ServiceException;
import edu.training.web.newsproject.service.ServiceProvider;
import edu.training.web.newsproject.service.UserService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class RememberMeFilter extends HttpFilter implements Filter {
    private static final long serialVersionUID = 1L;

    private final UserService userService = ServiceProvider.getInstance().getUserService();

    public RememberMeFilter() {
        super();
    }

    public void destroy() {
        super.destroy();
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        try {
            HttpSession session = ((HttpServletRequest) request).getSession(false);

            if (session == null || session.getAttribute("user") == null) {
                Cookie[] cookies = ((HttpServletRequest) request).getCookies();

                if (cookies != null) {
                    for (Cookie c : cookies) {
                        if (c.getName().equals("remember-me")) {
                            String token = c.getValue();
                            User user = userService.rememberMe(token);

                            session.setAttribute("user", user);
                        }
                    }
                }
            }
            chain.doFilter(request, response);

        } catch (ServiceException e) {
            ((HttpServletResponse) response)
                    .sendRedirect("MyController?command=go_to_index_page&authError=Wrong login or password!");
        }

    }

    public void init(FilterConfig fConfig) throws ServletException {

    }
}
