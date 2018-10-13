<%-- 
    Document   : index
    Created on : Oct 12, 2018, 11:06:01 PM
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

        <input type="text" id="n1" />
        <select id="operacion" onchange="calcular()">
            <option>+</option>
            <option>-</option>
            <option>*</option>
            <option>/</option>
        </select>
        <input type="text" id="n2" />
        <br>

        <div id="resultado"></div>


        <script src="js/JQuery.js"></script>
        <script>



            function calcular() {

                var num1 = $("#n1").val();
                var num2 = $("#n2").val();
                var op = $("#operacion").val();
                num1 = parseInt(num1);//Number tambien sirve
                num2 = parseInt(num2);

                var res = null;

                //var res = num1 + num2;

/*
                switch (op) {
                    case "+":
                        res = num1 + num2;
                        break;
                    case "-":
                        res = num1 - num2;
                        break;
                    case "*":
                        res = num1 * num2;
                        break;
                    case "/":
                        res = num1 / num2;
                        break;
                    default:
                        break;
                }*/
                
                
                
                 if (op==="+") {
                 res = num1 + num2;
                 } else if (op==="-") {
                 res = num1 - num2;
                 } else if (op==="*") {
                 res = num1 * num2;
                 } else if (op==="/") {
                 res = num1 / num2;
                 }
                 

                $("#resultado").html(res);

                /*
                 *                 if (op.equals("+")) {
                 res = num1 + num2;
                 } else if (op.equals("-")) {
                 res = num1 - num2;
                 } else if (op.equals("*")) {
                 res = num1 * num2;
                 } else if (op.equals("/")) {
                 res = num1 / num2;
                 }
                 * 
                 */




            }






        </script>






    </body>
</html>
