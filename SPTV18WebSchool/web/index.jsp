<%-- 
    Document   : index.jsp
    Created on : Mar 5, 2020, 8:33:47 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Сетевая библиотека группы SPTV18</title>
    </head>
    <body>
        <h1>Сетевая библиотека</h1>
        <p>${info}</p><br>
        <a href="showNewPerson">Добавить Человека</a><br>
        <a href="showNewSubject">Добавить Предмет</a><br>
        <a href="showNewJournal">Добавить журнал</a>
            <hr width="150px" align="left">
        <a href="listPersons">Список людей</a><br>
        <a href="listSubjects">Список предметов</a><br>
        <a href="listJournals">Список журналов</a>
            <!--<hr width="150px" align="left">
        <a href=""></a><br>
        <a href=""></a><br>-->
    </body>
</html>
