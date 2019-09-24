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
    <a href="#" class="logout">Logout</a>
</div>
<div>
    <a href="/index.jsp" class="first">На главную</a>
</div>
<div>
    <a href="#" class="back">Назад</a>
</div>
<div class="boxSite">
    <div class="box">Система управления студентами и их успеваемостью</div>
    <h2>Для того, чтобы модифицировать дисциплину, введите новое значение поля и нажмите кнопку "Создать"</h2>
    <p><label for="nameDiscipline">Название</label>
        <input type="text" id="nameDiscipline" name="secondName" placeholder="${discipline.discipline}" required autofocus></p>
    <form action="#">
        <button class="buttonModify">Применить</button>
    </form>
</div>
</body>
</html>
