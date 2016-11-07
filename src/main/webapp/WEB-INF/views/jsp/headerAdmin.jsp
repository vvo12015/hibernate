<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var='projectName' scope="application" value='Ресторан у Валентина'/>
<html>
    <head>
        <title><c:out value='${projectName}'/></title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap-theme.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/styleAdmin.css" />" rel="stylesheet">

        <script src="<c:url value="/resources/js/jquery.min.js" />"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
        <script src="<c:url value="/resources/js/docs.min.js" />"></script>
        <script src="<c:url value="/resources/js/adminJQuery.js" />"></script>
    </head>

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
              <li><a href="menu">Меню</a></li>
              <li><a href="dish_admin">Страви</a></li>
              <li><a href="employee_admin">Працівниками</a></li>
              <li><a href="stock">Склад</a></li>
              <li><a href="orders">Історія Замовлень</a></li>
              <li class="dropdown">
                  <a href="index_admin" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Сторінка гостя<span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="schema_restaurant">Схема ресторану</a></li>
                    <li><a href="employees">Наші офіціанти</a></li>
                    <li><a href="contacts">Контакти</a></li>
                  </ul>
              </li>
            </ul>
          </div>
        </div>
</nav>
