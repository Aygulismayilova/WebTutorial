<%--
  Created by IntelliJ IDEA.
  User: Zamin
  Date: 22/04/2022
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person Page</title>
</head>
<body>
<div style="font-size: 30px">
    <%--    If this JSP was sent an error variable, show it.--%>
    <h5 style="color: red">${error}</h5>
    <hr>
    <h5>Person:</h5>
    <%--    Show the person information if a person was provided--%>
    <h1>${person.firstName} ${person.lastName}${person.age}</h1>

</div>


</body>
</html>
