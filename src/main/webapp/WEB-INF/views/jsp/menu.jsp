<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <%@include file="headerAdmin.jsp"%>
    <c:url var="formUrl" value="/menu" />
    <c:forEach var="menu" items="${listMenu}">
        <div class="row">
            <form id="myForm${menu.name}" action="${formUrl}" class="form-inline" role="form" method="post">
                <div class="col-md-1"></div>
                <div class="col-md-3">
                  <div class="form-group">
                    <label class="sr-only" for="menuName">Назва меню</label>
                    <input type="text" name="name" class="form-control" id="menuName" value="${menu.name}">
                    <input type="hidden" name="id" value="${menu.id}">
                    <input type="hidden" name="photo" value="${menu.photo}">
                  </div>
                </div>
                <div class="col-md-2">
                    <select multiple name="dishes" class="mySelect" id="dishList${menu.name}">
                        <c:forEach var="dish" items="${menu.dishes}" varStatus="i">
                            <option>${dish.name}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="col-md-2">
                  <button type="button" class="btn btn-default" id="addDishIn${menu.name}">Додати страву</button>
                    <select class="mySelect" id="dishListForAddIn${menu.name}">
                        <c:forEach var="dish" items="${dishList}">
                            <c:set var="isNotInMenu">true</c:set>
                            <c:forEach var="dishInMenu" items="${menu.dishes}">
                                <c:if test = "${dishInMenu.name == dish.name}">
                                    <c:set var="isNotInMenu">false</c:set>
                                </c:if>
                            </c:forEach>
                            <c:if test = "${isNotInMenu}">
                                <option>${dish.name}</option>
                            </c:if>
                        </c:forEach>
                     </select>
                  <button type="button" name="delete" class="btn btn-default" id="delDishIn${menu.name}">Видалити страву</button>
                </div>
                <div class="col-md-2">
                  <button type="submit" id="saveMenu${menu.name}" name="save" value="true" class="btn btn-default">Зберегти меню</button>
                  <button type="submit" name="delete" value="true" class="btn btn-default">Видалити меню</button>
                </div>
            </form>
        </div>
    </c:forEach>

    <%@include file="footer.jsp"%>
</html>

