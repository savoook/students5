<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="resources/lib/jquery-ui-1.12.1/jquery-ui.css">
    <link rel="stylesheet" href="resources/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="resources/lib/jquery-ui-1.12.1/jquery-ui.js"></script>
</head>
<body>

<div class="boxSite">
    <div class="box">Система управления студентами и их успеваемостью</div>
    <h2>Вход в систему: </h2>
    form
    <p><label for="login">Введите логин</label>
        <input type="text" id="login" name="login" placeholder="Ваш логин" required autofocus></p>
    <p><label for="password">Введите пароль</label>
        <input type="text" id="password" name="password" placeholder="Ваш пароль" required autofocus></p>
    <p><label for="role">Выберите роль</label>
        <select id="role" name="role">
            <option value="admin">Администратор</option>
            <option value="student">Студент</option>
        </select></p>

    <input type="submit" value="Войти" class="buttonModify">

</div>
</body>
</html>