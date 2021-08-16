package com.kahkeshan.ui.controllers;

import com.kahkeshan.ui.models.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/WEB-INF/list.jsp")
public class list extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.getWriter().print("<html>\n" +
                "<head>\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "\n" +
                "        <table border=\"1px solid black\">\n" +
                "            <tr>\n" +
                "                <th>ID</th>\n" +
                "                <th>Name</th>\n" +
                "                <th>Family</th>\n" +
                "                <th>College</th>\n" +
                "                <th>Action</th>\n" +
                "            </tr>");
        ArrayList<Student> students = (ArrayList<Student>) req.getAttribute("allSts");
        for (int i = 0; i < students.size(); i++) {
            resp.getWriter().print(String.format("<tr>\n" +
                    "                    <td>${i.index + 1}</td>\n" +
                    "                    <td>%s</td>\n" +
                    "                    <td>${st.family}</td>\n" +
                    "                    <td>${st.college}</td>\n" +
                    "                    <td><a href=\"/st-delete.do?id=${i.index + 1}\">Del</a> , <a href=\"\">Edit</a></td>\n" +
                    "                </tr>",students.get(i).getName()));
        }
    }
}
