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
              <li><a href="schema_restaurant">Схема ресторану</a></li>
              <li><a href="employees">Наші офіціанти</a></li>
              <li><a href="contacts">Контакти</a></li>
              <li><a href="index_admin">Сторінка адміністратора</a></li>
              <li class="dropdown">
                  <a href="http://twbs.docs.org.ua/examples/theme/#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Спадне меню <span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="http://twbs.docs.org.ua/examples/theme/#">Дія</a></li>
                    <li><a href="http://twbs.docs.org.ua/examples/theme/#">Інша дія</a></li>
                    <li><a href="http://twbs.docs.org.ua/examples/theme/#">Щось ще тут</a></li>
                    <li class="divider"></li>
                    <li class="dropdown-header">Навігаційний заголовок</li>
                    <li><a href="http://twbs.docs.org.ua/examples/theme/#">Відокремлений лінк</a></li>
                    <li><a href="http://twbs.docs.org.ua/examples/theme/#">Ще один відокремлений лінк</a></li>
                  </ul>
              </li>
            </ul>
          </div>
        </div>
</nav>