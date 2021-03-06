<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <%@include file="headerAdmin.jsp"%>
    <body>
        <table style="align-items: center">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Position</th>
                <th>Salary</th>
            </tr>
            <c:forEach  var="employee" items="${employees}">
                <tr>
                    <td>${employee.name}</td>
                    <td>${employee.surName}</td>
                    <td>${employee.position}</td>
                    <td>${employee.salary}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
    <%@include file="footer.jsp"%>
</html>
