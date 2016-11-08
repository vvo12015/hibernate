<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <%@include file="headerAdmin.jsp"%>
    <body>
    <div class="row">
        <div class="col-md-2">
            <h2>First Name</h2>
        </div>
        <div class="col-md-2">
            <h2>Last Name</h2>
        </div>
        <div class="col-md-2">
            <h2>PhoneNumber</h2>
        </div>
        <div class="col-md-2">
            <h2>Position</h2>
        </div>
        <div class="col-md-2">
            <h2>Salary</h2>
        </div>
        <div class="col-md-2">
        </div>
    </div>
    <c:url var="formUrl" value="/employee_admin" />
       <c:forEach var="employee" items="${employeeList}">
           <div class="row">
               <form id="myForm_employee${employee.id}" action="${formUrl}" class="form-inline" role="form" method="post">
                   <div class="col-md-2">
                     <div class="form-group">
                       <label class="sr-only" for="employeeName">Назва меню</label>
                       <input type="text" name="name" class="form-control" id="employeeName" value="${employee.name}">
                       <input type="hidden" name="id" value="${employee.id}">
                     </div>
                   </div>
                   <div class="col-md-2">
                    <input type="text" name="surName" class="form-control" id="employeeSurName" value="${employee.surName}">
                   </div>
                   <div class="col-md-2">
                    <input type="text" name="phoneNumber" class="form-control" id="phoneNumber"
                        value="${employee.phoneNumber}">
                  </div>
                   <div class="col-md-2">
                       <select class="mySelect" id="position" name="position" value="${employee.position}">
                           <c:forEach var="position" items="${positionList}">
                               <option>${position}</option>
                           </c:forEach>
                        </select>
                   </div>
                   <div class="col-md-2">
                        <input type="text" name="salary" class="form-control" id="phoneNumber" value="${employee.salary}">
                   </div>
                   <div class="col-md-2">
                     <button type="submit" name="save" value="true" class="btn btn-default">Зберегти</button>
                     <button type="submit" name="delete" value="true" class="btn btn-default">Видалити</button>
                   </div>
               </form>
           </div>
       </c:forEach>
    </body>
    <%@include file="footer.jsp"%>
</html>

