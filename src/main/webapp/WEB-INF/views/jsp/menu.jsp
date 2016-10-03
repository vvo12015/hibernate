<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <%@include file="headerAdmin.jsp"%>
    <script type="text/javascript">
        $(document).ready(function(){
            $.ajax({
                type: 'GET',
                url: "<c:url value="/listMenu" />",
                headers : {
                    Accept : "application/json; charset=utf-8",
                    "Content-Type" : "application/json; charset=utf-8"
                },
                success: function(result){
                    var listMenu = $.parseJSON(result);
                    alert(listMenu[0].name);
                }
            });
        });
     </script>
    <body>
        <fieldset>
            <legend>Demo1</legend>
            <input type="button" value="Display Object" id="button1">
            <br>
            <div id="result1"></div>
        </fieldset>
    </body>
    <%@include file="footer.jsp"%>
</html>

