<%@ page import="java.util.*" %>
<!doctype html>
<html>
    <head>
        <title>Result : Toon you are</title>
        <meta charset="UTF-8">
        <meta name="viewport" width="screen-width, scale=1.0">
        <style>
            *{
                padding:0px;
                margin:0px;
                color: #333;
                font-family:"Century Gothic";
            }
            
            header{
                text-align:center;
                padding-top:50px;
            }
            
            header h1{
                font-size:100px;
                padding-bottom:10px;
            }
            
        </style>
    </head>
    <body>
        <header>
            <h1>Hey!</h1>
            <% 
            String a = new String(request.getAttribute("msg"));
            out.print("<h2>"+a+"</h2>");
            %>
        </header>
    </body>
</html>