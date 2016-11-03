<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <%@include file="header.jsp"%>
    <body>
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6 dish-list">
                <div class="thumbnail">
                    <img scr="<c:url value="${dish.photo}"/>" alt="dish.photo">
                    <div class="caption">
                        <h3>Вага - ${dish.weight}</h3>
                        <h3>Ціна - ${dish.price}$</h3>
                        <h2>Інгредієнти</h2>
                        <ul>
                            <c:forEach items="${dish.ingredients}" var="ingredient">
                                <li><c:out value="${ingredient.name}"/></li>
                            </c:forEach>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-md-3"></div>
        </div>
    </body>
    <%@include file="footer.jsp"%>
</html>
