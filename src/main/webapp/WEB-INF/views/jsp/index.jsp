<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <%@include file="header.jsp"%>
    <body>
        <h1>Hello restaurant!!!!! It is now: ${currentTime}</h1>
        <a href="employees">Show all employees</a><br>
        <a href="dish?id=1">Dish</a><br>
        <a href="schema_restaurant">Schema restaurant</a><br>
        <a href="contacts">Contacts</a><br>
        <a href="index_admin">Сторінка адміністратора</a>
    </body>
    <%@include file="footer.jsp"%>
</html>