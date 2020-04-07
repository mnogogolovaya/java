<%-- 
    Document   : listReaders
    Created on : Feb 12, 2020, 2:49:08 PM
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
        <h1>Список читателей</h1>
        <c:forEach var="subject" items="${listSubjects}" varStatus="status">
            <li>${subject.id}. ${subject.subjectName}. ${subject.hours}</li>
        </c:forEach>
    </body>
</html>
