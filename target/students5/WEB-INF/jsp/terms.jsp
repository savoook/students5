<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../../resourses/css/style.css">
    <script src="../../resourses/js/functions.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<nav class="top-menu">
    <ul class="menu-main">
        <li class="left-item"><a href="#">Logout</a></li>
        <li class="right-item"><a href="/" class="first">На главную</a></li>
        <li class="right-item"><a href="javascript:history.back()" title="Вернуться на предыдущую страницу">Назад</a>
        </li>
    </ul>
    <div class="box">Система управления студентами и их успеваемостью</div>
</nav>
<div class="boxSite">
    <span>Выбрать семестр</span>
    <form action="/terms" method="get" id="">
    <select name="selectedTermId" id="selectedTermId">
        <c:forEach items="${terms}" var="t">
            <c:choose>
                <c:when test="${t.id eq selectedTerm.id}">
                    <option value="${t.id}" selected>${t.term}</option>
                </c:when>
                <c:otherwise>
                    <option value="${t.id}">${t.term}</option>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </select>
    <input type="submit" value="Выбрать" class="buttonModify" id="idChoiseSem">


    <p>Длительность семестра: ${selectedTerm.duration}</p>
    </form>
    <div class="firstRow">
        <div class="table">
            <div class="tableName">Список дисциплин семестра
                <div class="table-row">
                    <div class="table-cellH ">Наименование дисциплины</div>
                </div>
                <div class="table-row">
                    <c:forEach items="${disciplinesByTerm}" var="dt">
                        <div class="table-cell" style="height: auto">"${dt.discipline}"</div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
    <div class="secondRow">


        <form action="/create-semestr" method="get">
            <input type="submit" value="Создать семестр" class="buttonModify">
        </form>
        <form action="/modify-semestrs" id="modifSemForm">
            <input type="submit" onclick="modifingSemestr()" value="Модифицировать семестр" class="buttonModify">
            <input type="hidden" name="idModifSem" id="idModifSem">
        </form>
        <form action="/delete-semestr" method="get" id="deleteSemForm">
            <input type="submit" value="Удалить семестр" onclick="deleteSemestr()" class="buttonModify">

            <input type="hidden" name="idsDeleteSem" id="idsDeleteSem">
        </form>
    </div>
</div>
</body>
</html>