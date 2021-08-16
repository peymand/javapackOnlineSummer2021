package com.kahkeshan.ui.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login.do")
public class LoginController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name =  req.getParameter("name");
        String role =  req.getParameter("role");
        req.getSession().setAttribute("name",name);
        req.getSession().setAttribute("role",role);



        req.getRequestDispatcher("/WEB-INF/welcome.jsp").forward(req,resp);

    }
}
