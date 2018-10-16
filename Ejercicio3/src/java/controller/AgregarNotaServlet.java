package controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO_Nota;
import model.Nota;

/**
 *
 * @author Marce
 */
@WebServlet(urlPatterns={"/agregarNota.do"})
public class AgregarNotaServlet extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            response.setCharacterEncoding("UTF-8");
            
            DAO_Nota dn= new DAO_Nota();
            Nota n= new Nota();
            n.setValor(Integer.parseInt(request.getParameter("nota")));
            dn.create(n);
            
            response.sendRedirect("index.jsp");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgregarNotaServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgregarNotaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

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
