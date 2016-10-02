<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <%@include file="header.jsp"%>
    <body>
            <table style="align-items: center">
                 <tr>
                    <th>Name</th>
                    <th>Weight</th>
                    <th>Price</th>
                 </tr>
                 <tr>
                     <c:forEach  var="dish" items="${dishes}">
                        <tr>
                            <td>${dish.name}</td>
                            <td>${dish.weight}</td>
                            <td>${dish.price}</td>
                        </tr>
                      </c:forEach>
                 </tr>
            </table>
        </body>
    <%@include file="footer.jsp"%>
</html>

