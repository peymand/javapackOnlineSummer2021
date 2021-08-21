<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.kahkeshan.data.entities.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: peyma
  Date: 7/26/2021
  Time: 7:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


        <table border="1px solid black">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Family</th>
                <th>College</th>
                <th>Action</th>
            </tr>

<%--            //JSTL  java standard tag lib--%>


                <c:forEach items="${allSts}" var="st" varStatus="i">

                <tr>
                    <td>${i.index + 1}</td>
                    <td>${st.name}</td>
                    <td>${st.family}</td>
                    <td>${st.college}</td>
                    <td><a href="/st-delete.do?id=${i.index + 1}">Del</a> , <a href="">Edit</a></td>
                </tr>

            </c:forEach>


        </table>


</body>
</html>
