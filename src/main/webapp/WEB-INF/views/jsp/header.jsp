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
        <script type="text-javascript">
            <%@include file="js/jquery.min.jsp"%>
            <%@include file="js/bootstrap.jsp"%>
            <%@include file="js/bootstrap.min.jsp"%>
        </script>

    </head>
    <%@include file="navigationBar.jsp"%>
