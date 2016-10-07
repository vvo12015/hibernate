<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var='projectName' scope="application" value='Ресторан у Валентина'/>
<html>
    <head>
        <title><c:out value='${projectName}'/></title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap-theme.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">


        <script src="<c:url value="/resources/js/jquery.min.js" />"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
        <script src="<c:url value="/resources/js/docs.min.js" />"></script>
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
              <li><a href="schema_restaurant">Схема ресторану</a></li>
              <li><a href="employees">Наші офіціанти</a></li>
              <li><a href="contacts">Контакти</a></li>
              <li class="dropdown">
                  <a href="index_admin" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Сторінка адміністратора<span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="menu">Управління меню</a></li>
                    <li><a href="dish_admin">Управління стравами</a></li>
                    <li><a href="employee_admin">Управління працівниками</a></li>
                    <li><a href="stock">Склад</a></li>
                    <li><a href="orders">Історія замовлень</a></li>
                  </ul>
              </li>
            </ul>
          </div>
        </div>
</nav>
