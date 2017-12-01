<%-- 
    Document   : entrada
    Created on : 27/11/2017, 08:15:13 AM
    Author     : Aleph-Icabod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp" />
         <form method="POST" action="Operacion">
            ID <input type="text" name="id">
            Texto <input type="text" name="texto">
            <input type="submit"value="Ingresar"/>
        </form>
    </body>
</html>
