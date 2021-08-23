package com.kahkeshan.ui.controllers;

import com.kahkeshan.biz.StudentService;
import com.kahkeshan.data.entities.Student;
import com.kahkeshan.listeners.ContextListener;
import com.kahkeshan.ui.models.StudentDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list.do")
public class StudentListController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentService service = (StudentService) ContextListener.ap.getBean("studentService");
        try {
            List<StudentDTO> students =  service.getAll();
            req.setAttribute("allSts", students);
            req.getRequestDispatcher("/WEB-INF/list.jsp").forward(req,resp);

        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect("/error.jsp");
        }
    }
}
