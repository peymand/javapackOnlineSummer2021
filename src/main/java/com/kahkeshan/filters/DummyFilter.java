package com.kahkeshan.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = {"/admin/*"})
public class DummyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String role = (String) request.getSession().getAttribute("role");
        System.out.printf("%s logged in %d with ip %d");
        if(role == null || !role.equals("admin")){
            response.sendRedirect("/home.jsp");
        }else{
            filterChain.doFilter(request, response);
        }

    }

    @Override
    public void destroy() {

    }
}
