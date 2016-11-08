<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <%@include file="headerAdmin.jsp"%>
    <body>
       <table style="align-items: center">
                    <div class="row">
                        <div class="col-md-2">
                            <h2>First Name</h2>
                        </div>
                        <div class="col-md-2">
                            <h2>Last Name</h2>
                        </div>
                        <div class="col-md-2">
                            <h2>Position</h2>
                        </div>
                        <div class="col-md-2">
                            <h2>Salary</h2>
                        </div>
                    </div>
                    <c:forEach  var="employee" items="${employees}">.
                        <div class="row">
                            <div class="col-md-2">
                                <input type="hidden" name="id" value="${employee.id}"
                            </div>
                            <div class="col-md-2">
                                <input type="text" name="name" value="${employee.name}"/>
                            </div>
                            <div class="col-md-2">
                                <input type="text" name="surname" value="${employee.surName}"/>
                            </div>
                            <div class="col-md-2">
                                <input type="text" name="position" value="${employee.position}"/>
                            </div>
                            <div class="col-md-2">
                                <input type="text" name="salary" value="${employee.salary}"/>
                            </div>
                            <div class="col-md-2">
                                <button type="submit" name="save">Зберегти</button>
                                <button type="submit" name="delete">Видалити</button>
                            </div>
                       </div>
                   </c:forEach>
       </table>
    </body>
    <%@include file="footer.jsp"%>
</html>

