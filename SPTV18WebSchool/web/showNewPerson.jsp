<%-- 
    Document   : addBook
    Created on : Feb 17, 2020, 8:39:50 AM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавление Ученика</title>
    </head>
    <body>
        <h1>Добавление книги</h1>
        <p id="info">${info}</p>
        <form action="addPerson" method="POST">
            Имя: <input type="text" name="firstName" value="${firstName}"><br>
            Фамилия: <input type="text" name="secondName" value="${secondName}"><br>
            Ученик/Учитель: <input type="text" name="status" value="${status}"><br>
            <button type="submit">Добавить</button>
        </form>
    </body>
</html>
