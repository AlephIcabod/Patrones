<%-- 
    Document   : muestraindividual
    Created on : 28/11/2017, 08:30:50 AM
    Author     : Aleph-Icabod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <h1>Resultado de la busqueda</h1>        
         <%out.println("<strong>Id: </strong>"+request.getParameter("id").toString());%>
        <% 
            out.println("<strong>Texto: </strong>"+request.getParameter("texto").toString()); 
        %>
        <a href='<% out.print("editar.jsp?id="+request.getParameter("id").toString()+"&texto="+request.getParameter("texto").toString());%>'>Editar</a>
        <form action="Eliminar" method="POST">
            <input type="hidden" name="id" value=<%out.println("'"+request.getParameter("id")+"'");%> />
            <input type="submit" value="Eliminar">
        </form>
        <!--form action="Editar">
            <input type="submit" value="Guardar cambios">
        </form-->
    </body>
</html>
