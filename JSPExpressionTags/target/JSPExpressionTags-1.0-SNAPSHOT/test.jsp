<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Zamin
  Date: 29/04/2022
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test JSP</title>
</head>
<body>
<h1>JSP Expressions</h1>
<p>JSP Expression tags allow you to directly put Java Expressions into an HTML file
</p>
<p>Here are a few examples: </p>
<br>

<!--regular html comment tags-->
<%--JSP comments--%>

<p> Calling a method: <%= Math.addExact(2, 3)%>
</p>

<p>Evaluating a boolean: <%="bob".length() < 3 %>
</p>

<p>Math expression: <%=(500.6 * 7 - 50)%>
</p>
<p> Java object: <%=new Date()%>
</p>
</body>
</html>
