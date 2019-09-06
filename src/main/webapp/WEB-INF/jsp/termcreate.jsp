<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 05.09.2019
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Создание семестра</title>
    <link rel="stylesheet" href="../../resourses/css/my_style.css">
</head>
<body>
<h2>Система управления студентами и их успеваемостью</h2>
<div>
    <a href="/logout" class="logout">Logout</a>
</div>
<div>
    <a href="../index.jsp" class="main">На главную</a>
</div>
<br>
<div>
    <a href="#" class="back">Назад</a>
</div>
<br>
<div class="container">
    <div class="choice">Для создания семестра выберете следующие данные и нажмите кнопку "Создать".
        <br>
        <label for="duration">Длительность (в неделях)</label>
        <input type="text" name="duration" id="duration">
    </div>
    <div>Дисциплины семестра
        <select multiple name="disciplineChoise" id="disciplineChoise">
            <option value="1">Математика</option>
            <option value="2">Физика</option>
            <option value="3">Английский</option>
        </select>
    </div>
    <input type="button" name="create" id="create" value="Создать">
</div>
</body>
</html>