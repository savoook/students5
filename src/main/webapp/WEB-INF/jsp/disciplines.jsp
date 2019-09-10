<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 23.08.2019
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Дисциплины</title>
    <link rel="stylesheet" href="../../resourses/css/style.css">
</head>
<body>
<div>
    <a href="/logout" class="logout">Logout</a>
</div>
<div>
    <a href="../index.jsp" class="first">На главную</a>
</div>
<div>
    <a href="#" class="back">Назад</a>
</div>
<div class="boxSite">
    <div class="box">Система управления студентами и их успеваемостью</div>

    <c:forEach items="${disciplines}" var="d">
        <div class="firstRow">
            <div class="table">
                <div class="table-row">
                    <div class="table-cellH checkbox"></div>
                    <div class="table-cellH secondName">${d.discipline}</div>
                </div>
            </div>
        </div>
    </c:forEach>

    <div class="secondRow">
        <div class="admin-bottom">

            <form action="/disciplineCreate">
                <input type="submit" value="Создать дисциплину...">
            </form>
            <form action="#">
                <button>Модифицировать дисциплину...</button>
            </form>
            <form action="#">
                <button>Удалить выбранную дисциплину</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>