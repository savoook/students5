<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 05.09.2019
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Студенты</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="../../resourses/lib/jquery-ui-1.12.1/jquery-ui.js"></script>
    <link rel="stylesheet" href="../../resourses/css/style.css">
    <link rel="stylesheet" href="../../resourses/lib/jquery-ui-1.12.1/jquery-ui.css">
    <script>
        $(function () {
            $("#date").datepicker();
        });
    </script>
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
    <input type="button" name="view_progress" id="view_progress" value="Просмотреть успеваемость выбранных студентов">
    <input type="button" name="modyfy_student" id="modyfy_student" value="Модицицировать выбранного студента..."
           onclick="document.location='studentsModify.jsp'">
    <input type="button" name="create_student" id="create_student" value="Создать студента...">
    <input type="button" name="delete_student" id="delete_student" value="Удалить выбранного студента...">
    <br>
    <br>
    <br>
    <div>
        <table>
            <caption>Список студентов</caption>
            <tr>
                <th>
                </th>
                <th>Фамилия</th>
                <th>Имя</th>
                <th>Группа</th>
                <th><f:formatDate value="${s.date}" pattern="yy/MMM/dd"></f:formatDate></th>

            </tr>
            <tr>
                <td><input type="checkbox"></td>
                <td>${}</td>
                <td>Иван</td>
                <td>23</td>
                <td>23.02.2000</td>
            </tr>
            <!--            <th>Имя</th>-->
            <tr>
                <td><input type="checkbox"></td>
                <td>Иванов</td>
                <td>Иван</td>
                <td>23</td>
                <td>23.02.2000</td>
            </tr>
            <!--            <th>Список студентов</th>-->
            <tr>
                <td><input type="checkbox"></td>
                <td>Иванов</td>
                <td>Иван</td>
                <td>23</td>
                <td>23.02.2000</td>
            </tr>
        </table>
    </div>
</div>
</div>
</body>
</html>
