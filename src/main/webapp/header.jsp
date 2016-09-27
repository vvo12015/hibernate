<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>HTTP Header Request Example</title>
    </head>
    <body>
        <h2>HTTP Header Request Example</h2>
        <table>
            <tr bgcolor="#949494">
                <th>Header Name</th>
                <th>Header Value</th>
            </tr>
            <c:forEach items="${header.keySet()}" var="headerName">
                <tr>
                    <td><c:out value="${headerName}"/></td>
                    <td><c:out value="${header.get(headerName)}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>