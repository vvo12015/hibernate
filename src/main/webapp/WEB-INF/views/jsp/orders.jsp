<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title></title>
    </head>
    <body>
        <table style="align-items: center">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Position</th>
                <th>Salary</th>
            </tr>
            <c:forEach  var="orders" items="${orders}">
                <tr>
                    <td>${orders.waiterName}</td>
                    <td>${orders.tableNumber}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>