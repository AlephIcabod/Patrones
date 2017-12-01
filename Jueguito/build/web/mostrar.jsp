
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! int cant=30; %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos</title>
    </head>
    <body>
        <h1>Ejemplo</h1>
        <h2>Bienvenido <%= request.getParameter("nombre")%></h2>
        <h3>Te gustaria jugar?? 
            <a href="index.jsp">No</a>
            <a href="Juego">Si</a>
        </h3> 
    </body>
</html>
