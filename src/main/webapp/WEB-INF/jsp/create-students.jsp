<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../../resourses/css/style.css">
    <link rel="stylesheet" href="../../resourses/lib/jquery-ui-1.12.1/jquery-ui.css">
</head>
<body>
<div>
    <a href="#" class="logout">Logout</a>
</div>
<div>
    <a href="index.jsp" class="first">На главную</a>
</div>
<div>
    <a href="javascript:history.back()" title="Вернуться на предыдущую страницу" class="back">Назад</a>
</div>
<div class="boxSite">
    <div class="box">Система управления студентами и их успеваемостью</div>
    <h2>Для создания студента заполните все поля и нажмите кнопку "Создать"</h2>
    <p><label for="secondName">Фамилия</label>
    <form action="/create-students" method="post">
        <input type="text" id="secondName" name="surname" placeholder="Введите фамилию" required autofocus>
    </p>
    <p><label for="name">Имя</label>
        <input type="text" id="name" name="name" placeholder="Введите имя" required></p>
    <p><label for="group">Группа</label>
        <input type="text" id="group" name="group" required></p>
    <p><label for="date">Дата поступления</label>
        <input type="text" id="date" name="date" required></p>


    <input type="submit" value="Создать" class="buttonModify">
    </form>
</div>
</body>
</html>
