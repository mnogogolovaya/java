<%-- 
    Document   : listBooks
    Created on : Feb 12, 2020, 3:17:34 PM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Список людей</h1>
        <c:forEach var="person" items="${listPersons}">
            <li>${person.firstName}. ${person.secondName}. ${person.status}</li>
        </c:forEach>
    </body>
</html>
