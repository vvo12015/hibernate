<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="uk">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="restaurant">
        <meta name="author" content="vrakin">
        <c:set var='projectName' scope="application" value='Ресторан у Валентина'/>
        <title><c:out value='${projectName}'/></title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap-theme.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
        <script src="<c:url value="/resources/js/jquery.min.js" />"></script>
        <script src="<c:url value="/resources/js/jquery.js" />"></script>
        <script src="<c:url value="/resources/js/myJquery.js" />"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
        <script src="<c:url value="/resources/js/docs.min.js" />"></script>
    </head>
    <body>
        <div class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                  <a class="navbar-brand" href="index">У Валентина</a>
                </div>
                <div class="navbar-collapse collapse">
                    <form class="navbar-form navbar-right">
                        <input type="text" class="form-control" placeholder="Назва страви">
                    </form>
                    <ul class="nav navbar-nav">
                        <li><a href="schema_restaurant">Схема ресторану</a></li>
                        <li><a href="employeeList">Наші офіціанти</a></li>
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
        </div>