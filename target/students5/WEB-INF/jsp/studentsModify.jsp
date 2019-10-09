<%--
  Created by IntelliJ IDEA.
  User: Savok
  Date: 16.09.2019
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../../resourses/css/style.css">
</head>
<body>
<div>
    <c:choose>
        <c:when test="${isLogin eq 1}">
            <a href="/logout" class="login">Logout</a>
        </c:when>
        <c:otherwise>
            <a href="/login" class="login">Login</a>
        </c:otherwise>
    </c:choose>
</div>
<div>
    <a href="/" class="first">На главную</a>
</div>
<div>
    <a href="javascript:history.back()" class="back">Назад</a>
</div>
<div class="boxSite">
    <form action="/studentsModify" method="post">
        <div class="box">Система управления студентами и их успеваемостью</div>
        <h2>Для того, чтобы модифицировать студента, введите новое значение полей и нажмите кнопку "Изменить"</h2>
        <p><label for="surnameStudent">Фамилия</label>
            <input type="text" id="surnameStudent" name="newSurname" placeholder="${student.surname}" required
                   autofocus></p>
        <p><label for="nameStudent">Имя</label>
            <input type="text" id="nameStudent" name="newName" placeholder="${student.name}" required autofocus></p>
        <p><label for="groupStudent">Группа</label>
            <input type="text" id="groupStudent" name="newGroup" placeholder="${student.group}" required autofocus>
        </p>
        <p><label for="dataStudent">Дата</label>
            <input type="text" id="dataStudent" name="newData" placeholder="${student.data}" required autofocus></p>

        <input type="hidden" name="idSt" value="${student.id}">

        <button class="buttonModify">Изменить</button>
    </form>
</div>
</body>
</html>
