<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: peyma
  Date: 8/7/2021
  Time: 5:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    welcome ${name}! <br/>

    <a href="/register.do">Register</a> <br/>
    <a href="/list.do">List of Registration</a> <br/>

    <c:if test="${role == 'admin'}">
        <a href="/admin/page.do">Admin Page</a> <br/>
    </c:if>

    <c:if test="${role eq 'admin'  || role eq 'user'}">
        <a href="/user/page.do">User Page</a>

    </c:if>

</body>
</html>
