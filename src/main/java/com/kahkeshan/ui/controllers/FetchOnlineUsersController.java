package com.kahkeshan.ui.controllers;

import com.kahkeshan.listeners.CustomSessionListener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/fetch-online-users.do")
public class FetchOnlineUsersController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print(CustomSessionListener.counter);
    }
}
