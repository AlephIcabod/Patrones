<%-- 
    Document   : consultaindividual
    Created on : 28/11/2017, 08:15:34 AM
    Author     : Aleph-Icabod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Búsqueda</title>
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <form method="POST" action="Buscar">
            Id <input type="text" name="id" />
            <input type="submit" value="Buscar" />
        </form>       
    </body>
</html>
