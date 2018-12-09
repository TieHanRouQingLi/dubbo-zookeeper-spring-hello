<%@page import="com.ics.SayHello" %>
<%--
  Created by IntelliJ IDEA.
  User: lhj
  Date: 2018/12/8
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%SayHello sayHello = new SayHello();%>
<%=sayHello.sayHello("xiatian")%>

</body>
</html>
