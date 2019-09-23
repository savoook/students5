<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 23.08.2019
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Семестры</title>
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
    <div class="choice">Выбрать семестр
        <select name="terms" id="">
            <option value="Семестр1">Семестр1</option>
            <option value="Семестр2">Семестр2</option>
            <option value="Семестр3">Семестр3</option>
            <option value="Семестр4">Семестр4</option>
        </select>
    </div>
    <div class="1">Длительность семестра:24 недели
    </div>
    <div class="1">Список дисциплин семестра
    </div>
    <div class="buttonsColumn">
        <input type="button" name="create_term" id="create_term" value="Создать семестр...">
        <br>
        <input type="button" name="modyfy_term" id="modyfy_term" value="Модицицировать текущий семестр...">
        <br>
        <input type="button" name="delete_term" id="delete_term" value="Удалить текущий семестр...">
    </div>
    <div>
        <table>
            <th>Наименование дисциплины</th>
            <tr>
                <td>Математика</td>
            </tr>
            <tr>
                <td>Химия</td>
            </tr>
            <tr>
                <td>Физика</td>
            </tr>
        </table>
    </div>
</div>
</body>
</html>