<%-- 
    Document   : AddTwo
    Created on : Mar 3, 2021, 4:17:00 PM
    Author     : Ryan
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.taylor.SumModel" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
	String answer = (String) request.getAttribute("getAnswer");
        String errorFirstNumber = (String) request.getAttribute("errorFirstNumber");
        String errorSecoundNumber = (String) request.getAttribute("errorSecoundNumber");
	if(errorFirstNumber == null){
            errorFirstNumber = "";
        }
        if(answer == null){
            answer = "";
        }
        if(errorSecoundNumber == null){
            errorSecoundNumber = "";
        }
	
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Servlet Addition</title>
    </head>
    <body>
        <h1>Basic Addition Servlet Assignment</h1>
        <p>Please enter two numbers and click the Submit button</p>
        <form action="SumHandler" method="doPost">
            <label for="firstNumber">First Number:</label>
            <input type="text" name="firstNumber" /> <span style="color:red;"><%= errorFirstNumber %></span>
            <br />
            <label for="secondNumber">Second Number:</label>
            <input type="text" name="secondNumber" /> <span style="color:red;"><%= errorSecoundNumber %></span>
            <br />	
            <input type="submit" value="Submit" />
        </form>
        <h3><%=  answer %></h3>
    </body>
</html>
