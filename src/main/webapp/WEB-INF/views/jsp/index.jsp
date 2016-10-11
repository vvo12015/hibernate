<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <%@include file="header.jsp"%>
         <div class="container-fluid">
            <div class="row">
                <div class="col-sm-3 col-md-2 sidebar">
                  <ul class="nav nav-sidebar">
                    <li class="active"><a href="http://bootstrap-3.ru/examples/dashboard/#">Overview</a></li>
                    <li><a href="http://bootstrap-3.ru/examples/dashboard/#">Reports</a></li>
                    <li><a href="http://bootstrap-3.ru/examples/dashboard/#">Analytics</a></li>
                    <li><a href="http://bootstrap-3.ru/examples/dashboard/#">Export</a></li>
                  </ul>
                </div>
                <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                    <h1>Hello restaurant!!!!! It is now: ${currentTime}</h1>
                    <a href="employees">Show all employees</a><br>
                    <a href="dish?id=1">Dish</a><br>
                    <a href="schema_restaurant">Schema restaurant</a><br>
                    <a href="contacts">Contacts</a><br>
                    <a href="index_admin">Сторінка адміністратора</a>
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-4"><p id="nameSite">Список меню</p></div>
                            <div class="col-lg-8"><p id="nameSite">Вміст меню</p></div>
                        </div>
                    </div>
                </div>
            </div>
         </div>
    </body>
    <%@include file="footer.jsp"%>
</html>