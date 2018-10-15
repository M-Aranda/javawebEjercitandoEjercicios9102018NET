<%-- 
    Document   : index
    Created on : Oct 15, 2018, 9:55:56 AM
    Author     : Marce
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="puntos" action="calcularDistancia.do" method="POST">
            <input type="text" name="x1" placeholder="Coordenada x punto 1" required>
            <br>
            <input type="text" name="y1" placeholder="Coordenada y punto 1" required>
            <br>
            <input type="text" name="x2" placeholder="Coordenada x punto 2" required>
            <br>
            <input type="text" name="y2" placeholder="Coordenada y punto 2" required> 
            <br>
            <input type="submit" value="Calcular">
            <br>
        </form>
        
        <% 
        boolean distanciaSeCalculo;
        if(request.getSession().getAttribute("distancia")!=null){
            distanciaSeCalculo=true;
            %>
            
            <%= "La distancia entre los puntos es de "+request.getSession().getAttribute("distancia")%>
            
            <%request.getSession().removeAttribute("distancia");

        }else if(request.getSession().getAttribute("distancia")==null){
            distanciaSeCalculo=false;
        }
        

        


        %>

    </body>
</html>
