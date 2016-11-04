<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <%@include file="headerAdmin.jsp"%>
    <c:url var="urlListMenu" value="http://localhost:8080/restaurant/listMenu" />
    <c:import var="listMenu" url="http://localhost:8080/restaurant/listMenu"/>
    <json:parse json="${dataJson}" var="listMenu" />
    <c:url var="urlForm" value="/editMenu" />
    <table id="menu">
        <tr><td>Id</td><td>Назва</td><td>Фото</td><td>Страви</td></tr>
        <tr><td>${listMenu.node[1].id}</td><td>${listMenu.node[1].name}</td><td>${listMenu.node[1].photo}</td><td>Страви</td></tr>
    </table>

    <%@include file="footer.jsp"%>
</html>

