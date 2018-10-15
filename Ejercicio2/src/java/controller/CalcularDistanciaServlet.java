package controller;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marce
 */
@WebServlet(urlPatterns={"/calcularDistancia.do"})
public class CalcularDistanciaServlet extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");

        int x1=Integer.parseInt(request.getParameter("x1"));
        int y1=Integer.parseInt(request.getParameter("y1"));
        int x2=Integer.parseInt(request.getParameter("x2"));
        int y2=Integer.parseInt(request.getParameter("y2"));
        /*
        La formula para el calculo de distancia entre 2 puntos es la raiz cuadrada
        de la suma del resultado de la resta del valor x2 con el x1, al cuadrado, junto
        con la resta de y2 e y1 al cuadrado
        */
        
        double distancia=Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );
        int dist=(int)distancia;
        request.getSession().setAttribute("distancia", dist);
        response.sendRedirect("index.jsp");
        
        
        }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
