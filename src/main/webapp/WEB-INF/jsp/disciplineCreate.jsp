<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 09.09.2019
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../../resourses/css/style.css">
    <link rel="stylesheet" href="../style.css">
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
    <h2>Для того, чтобы создать новую дисциплину, заполните все поля и нажмите кнопку "Создать"</h2>
    <label for="nameDiscipline">Название</label>
    <form action="/disciplineCreate" method="post">
        <input type="text" id="nameDiscipline" name="secondName" placeholder="Введите дисциплину" required autofocus>


        <input type="submit" value="Создать">

    </form>
</div>
</body>
</html>