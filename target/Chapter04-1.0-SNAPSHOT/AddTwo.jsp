<%-- 
    Document   : AddTwo
    Created on : Mar 3, 2021, 4:17:00 PM
    Author     : Ryan
--%>
<%@page import="com.taylor.SumModel"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=New+Tegomin&display=swap" rel="stylesheet">
        <title>Servlet Addition</title>
        <link href="css/mainStyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="containor">
        <h1>Basic Addition Servlet Assignment</h1>
        <p>Please enter two numbers and click the Submit button</p>
        <form action="SumHandler" method="POST">
            <label for="firstNumber">First Number:</label>
            <input type="text" name="firstNumber" /> <span class="error" style="color:red;">${fn:escapeXml(sumModel["errorFirstNumber"])}</span>
            <br />
            <label for="secondNumber">Second Number:</label>
            <input type="text" name="secondNumber" /> <span class="error" style="color:red;">${fn:escapeXml(sumModel["errorSecoundNumber"])}</span>
            <br />	
            <input type="submit" value="Submit" />
        </form>
        <h3>${fn:escapeXml(sumModel["answer"])}</h3>
        </div>

        <p>do it</p>

    </body>
</html>
