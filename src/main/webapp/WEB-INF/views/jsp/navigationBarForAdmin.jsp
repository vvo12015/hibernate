<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-default">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index"><c:out value='${projectName}'/></a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li><a href="menu">Управління меню</a></li>
              <li><a href="dish_admin">Управління стравами</a></li>
              <li><a href="employee_admin">Управління працівниками</a></li>
              <li><a href="stock">Склад</a></li>
              <li><a href="orders">Історія замовлень</a></li>
            </ul>
          </div>
        </div>
</nav>