<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Scriptlet tags</title>
</head>
<body>
<h1><%=" JSP - Scriptlet tags" %>
</h1>
<br/>
<p>These are how you inject multiple lines of Java code into the JSP to do things like if statements, call methods, or
    whatever you need.</p>

<%
    double myTestScore = 100.0;
    myTestScore = myTestScore - 50;
%>
<%
    if (1 + 1 !=2) {%>
<p>One plus one is indeed equal to two</p>
<% } else {%>
<p>Never mind. I made it on purpose</p>
<%}%>
<p>My real test score:<%=myTestScore%>
</p>
<ul>
    <%
        for (int i=0;i<25;i++){ %>
<li>Listing # <%= i %></li>
    <%  }%>

</ul>

</body>
</html>