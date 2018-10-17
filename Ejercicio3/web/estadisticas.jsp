<%-- 
    Document   : estadisticas
    Created on : Oct 16, 2018, 5:11:59 AM
    Author     : Marce
--%>

<%@page import="model.DAO_Nota"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estadisticas</title>
    </head>
    <body>
        <%
        DAO_Nota dn= new DAO_Nota();
        
        
        %>
        
        
        <h1>Esta es la pagina de estadisticas</h1>
        <br>
        <table border="1">
            <thead>
                <tr>
                    <th>Cantidad de notas</th>
                    <th>Cantidad de rojos</th>
                    <th>Cantidad de azules</th>
                    <th>Nota mas alta</th>
                    <th>Nota mas baja</th>
                    <th>Cantidad de 70</th>
                    <th>Porcentaje de rojos</th>
                    <th>Porcentaje de azules</th>
                    <th>Promedio del curso</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%= dn.getCantNotas()%></td>
                    <td><%= dn.getCantRojos()%></td>
                    <td><%= dn.getCantAzules()%></td>
                    <td><%= dn.getNotaMasAlta()%></td>
                    <td><%= dn.getNotaMasBaja()%></td>
                    <td><%= dn.getCantSietes()%></td>
                    <td><%= dn.getPorcRojos()%></td>
                    <td><%= dn.getPorcAzules()%></td>
                    <td><%= dn.getCantNotas()%></td>

                </tr>
            </tbody>
        </table>

        
        <br>
        <a href="index.jsp">Volver</a>
    </body>
</html>
