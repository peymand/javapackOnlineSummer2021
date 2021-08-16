package com.kahkeshan.ui.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.jmx.LoggerConfigAdminMBean;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeController extends HttpServlet {

    private static Logger logger = LogManager.getLogger(HomeController.class);

    @Override
    public void init() throws ServletException {
        this.getServletConfig();
    }

    public HomeController(){

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.debug("in home controller");
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req,resp);

    }

    @Override
    public void destroy() {

    }
}
