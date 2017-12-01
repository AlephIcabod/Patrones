<%-- 
    Document   : editar
    Created on : 28/11/2017, 09:04:14 AM
    Author     : Aleph-Icabod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar</title>
    </head>
    <body>
        <h1>Editar datos</h1>
        <jsp:include page="header.jsp"/>
        <form action="Editar">
            <% out.print("<label>Id: "+request.getParameter("id").toString()+"</label>");%>
            <input type="hidden" name="id" value='<% out.print(request.getParameter("id").toString());%>' >
            <input type="text" name="texto" value='<% out.print(request.getParameter("texto").toString());%>' />
            <input type="submit" value="Guardar cambios" />                        
        </form>
    </body>
</html>
