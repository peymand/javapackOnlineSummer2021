<%--
  Created by IntelliJ IDEA.
  User: peyma
  Date: 7/26/2021
  Time: 5:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Hi, ${name}!
    This is registration page! <br/>  <br/>
    <form method="post" action="/save-student.mvc">

        Name: <input type="text" name="name"/> <br/> <br/>
        Family: <input type="text" name="family"/> <br/> <br/>
        College : <input type="text" name="college"/> <br/> <br/>

        <input type="submit" value="Save"/>

    </form>
</body>
</html>
