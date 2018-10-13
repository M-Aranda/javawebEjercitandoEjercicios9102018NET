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
@WebServlet(name = "CalcularServlet", urlPatterns = {"/calcular.do"})
public class CalcularServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        int num1 = Integer.parseInt(request.getParameter("n1"));
        int num2 = Integer.parseInt(request.getParameter("n2"));
        String op = request.getParameter("operacion");
        int res = 0;

        if (op.equals("+")) {
            res = (num1 + num2);
            response.getWriter().print(res);
        } else if (op.equals("-")) {
            res = (num1 - num2);
            response.getWriter().print(res);
        } else if (op.equals("*")) {
            res = (num1 * num2);
            response.getWriter().print(res);
        } else if (op.equals("/")) {
            res = (num1 / num2);
            response.getWriter().print(res);
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
