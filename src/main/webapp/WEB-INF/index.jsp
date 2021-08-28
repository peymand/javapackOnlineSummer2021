<%@ page import="com.kahkeshan.listeners.CustomSessionListener" %>
<%--<%@ page session="false" %>--%>
<html>
<head>
    <script src="/js/main.js">

    </script>
</head>
<body onload="updateOnlineUsers()">
<h2>Welcome to Student Site!!!</h2>

Online Users: <p id="onlineUsers"><%= CustomSessionListener.counter %></p>
<form action="/login.mvc" method="post">
    Name: <input type="text" name="name"/> <br/>
    Role: <input type="text" name="role"/> <br/>
    <input type="submit" value="login"/>
</form>
</body>
</html>
