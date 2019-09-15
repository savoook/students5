<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 23.08.2019
  Time: 20:37
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
    <link rel="stylesheet" href="../../resources/css/style.css">
    <script src="../../resources/js/functions.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
    <a href="#" class="logout">Logout</a>
</div>
<div>
    <a href="../index.html" class="first">На главную</a>
</div>
<div>
    <a href="#" class="back">Назад</a>
</div>
<div class="boxSite">
    <div class="box">Система управления студентами и их успеваемостью</div>

    <div class="firstRow">
        <div class="table">
            <div class="table-row">
                <div class="table-cellH checkbox"></div>
                <div class="table-cellH secondName">Наименование дисциплины</div>
            </div>

            <c:forEach items="${disciplines}" var="d">
                <div class="table-row">
                    <div class="table-cell checkbox">
                        <fieldset>
                            <input type="checkbox">
                        </fieldset>
                    </div>
                    <div class="table-cell">${d.discipline}</div>
                </div>
            </c:forEach>

        </div>
    </div>

    <div class="secondRow">
        <div class="admin-bottom">

            <form action="/create-discipline" method="get">
                <input type="submit" value="Создать дисциплину...">
            </form>

            <input type="submit" onclick="modifingDiscipline()" value="Модифицировать дисциплину">
            <form action="#"></form>

            <form action="#">
                <button>Удалить выбранную дисциплину</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>