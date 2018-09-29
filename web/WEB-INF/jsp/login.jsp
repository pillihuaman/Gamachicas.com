<%-- 
    Document   : login
    Created on : Sep 29, 2018, 4:46:40 PM
    Author     : zarmir
--%>
<%@taglib prefix="command" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>gamachicas</title>
    </head>
    <body>
        <h1>Welcome to Gamachicas</h1>
        <command:form>
            <command:label path="email">Email</command:label>
            <command:input path="email"/>
            <command:label path="password">password</command:label>
            <command:input path="password"/>
            <command:button>Enviar</command:button>
        </command:form>
     
                 
    </body>
</html>
