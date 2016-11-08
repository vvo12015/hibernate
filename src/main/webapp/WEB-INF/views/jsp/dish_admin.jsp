<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <%@include file="headerAdmin.jsp"%>
    <c:url var="formUrl" value="/dish_admin" />
    <c:forEach var="dish" items="${dishList}">
        <div class="row">
            <form id="myForm_dish${dish.id}" action="${formUrl}" class="form-inline" role="form" method="post">
                <div class="col-md-1"></div>
                <div class="col-md-3">
                  <div class="form-group">
                    <label class="sr-only" for="dishName">Назва меню</label>
                    <input type="text" name="name" class="form-control" id="dishName" value="${dish.name}">
                    <input type="hidden" name="id" value="${dish.id}">
                    <input type="hidden" name="photo" value="${dish.photo}">
                  </div>
                </div>
                <div class="col-md-2">
                    <select multiple name="ingredients" class="mySelect" id="list_dish${dish.id}">
                        <c:forEach var="ingredient" items="${dish.ingredients}" varStatus="i">
                            <option>${ingredient.name}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="col-md-2">
                  <button type="button" class="btn btn-default" id="addIngredientIn_dish${dish.id}">Додати страву</button>
                    <select class="mySelect" id="listForAddIn_dish${dish.id}">
                        <c:forEach var="ingredient" items="${ingredientList}">
                            <c:set var="isNotInDish">true</c:set>
                            <c:forEach var="ingredientInDish" items="${dish.ingredients}">
                                <c:if test = "${ingredientInDish.name == ingredient.name}">
                                    <c:set var="isNotInDish">false</c:set>
                                </c:if>
                            </c:forEach>
                            <c:if test = "${isNotInDish}">
                                <option>${ingredient.name}</option>
                            </c:if>
                        </c:forEach>
                     </select>
                  <button type="button" name="delete" class="btn btn-default" id="delIngredientIn_dish${dish.id}">Видалити страву</button>
                </div>
                <div class="col-md-2">
                  <button type="submit" id="saveDish_dish${dish.id}" name="save" value="true" class="btn btn-default">Зберегти меню</button>
                  <button type="submit" name="delete" value="true" class="btn btn-default">Видалити меню</button>
                </div>
            </form>
        </div>
    </c:forEach>

    <%@include file="footer.jsp"%>
</html>

