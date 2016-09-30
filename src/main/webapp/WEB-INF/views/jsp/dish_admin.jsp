<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title></title>
    </head>
    <body>
        <table style="align-items: center">
             <tr>
                <th>Name</th>
                <th>Weight</th>
                <th>Price</th>
             </tr>
             <tr>
                <td>${dish.name}</td>
                <td>${dish.weight}</td>
                <td>${dish.price}</td>
             </tr>
        </table>
    </body>
</html>