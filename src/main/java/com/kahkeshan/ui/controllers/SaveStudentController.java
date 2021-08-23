package com.kahkeshan.ui.controllers;

import com.kahkeshan.biz.StudentService;
import com.kahkeshan.ui.models.StudentDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/save-student.do")
public class SaveStudentController  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name =  req.getParameter("name");
        String family =  req.getParameter("family");
        String college =  req.getParameter("college");
        StudentDTO student = new StudentDTO(name,family,college, null);

        StudentService service = new StudentService();
       try {

            service.save(student);
            resp.sendRedirect("/home.jsp");
        }catch (Exception e){
            resp.sendRedirect("/error.jsp");
        }
    }
}
