<%-- 
    Document   : showNewReader
    Created on : Feb 17, 2020, 10:49:11 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавление Предмета</title>
    </head>
    <body>
        <h1>Добавление Предмета</h1>
        <p id="info">${info}</p>
        <form action="addSubject" method="POST">
            Название предмета: <input type="text" name="subjectName" value="${subjectName}"><br>
            Количесвто часов: <input type="text" name="hours" value="${hours}"><br>
            <button type="submit">Добавить</button>
        </form>
    </body>
</html>
