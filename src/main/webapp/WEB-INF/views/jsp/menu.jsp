<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <%@include file="headerAdmin.jsp"%>
   <table id="menu">
       <tr><td>Id</td><td>Назва</td><td>Фото</td><td>Страви</td></tr>
   </table>
   <script type="text/javascript">
   $(function(){
       $.getJSON('listMenu', function(data) {
                row = "";
               for(var i=0;i<data.length;i++){
                   row += '<tr><td>' + data[i].id + '</td><td>' + data[i].name +
                                                  '</td><td>' + data[i].photo + '</td>';
                   row += '<td>';

                   for(var j=0;j<data[i].dishes.length;j++){
                        row += data[i].dishes[j].name + "|";
                   }

                   row += '</td></tr>';
                   $('#menu').append(row);
               }
       });
   });
   </script>
    <%@include file="footer.jsp"%>
</html>

