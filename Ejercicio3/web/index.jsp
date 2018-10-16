<%-- 
    Document   : index
    Created on : Oct 16, 2018, 5:06:36 AM
    Author     : Marce
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso de notas</title>
    </head>
    <body>
        <h1>Ingrese notas</h1>
        
        <form action="agregarNota.do" method="post">
            <input type="number" name="nota" placeholder="Ingrese nota: " required>
            <input type="submit" value="Registrar">
        </form>
        <br>
        <a href="estadisticas.jsp" >Ver estadisticas</a>
    </body>
</html>
