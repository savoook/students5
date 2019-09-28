<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<%@ page isELIgnored="false" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>Title</title>--%>
<%--    <link rel="stylesheet" href="../../resources/css/style.css">--%>
<%--    <script src="../../resources/js/functions.js"></script>--%>
<%--    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>--%>
<%--</head>--%>
<%--<body>--%>
<%--<nav class="top-menu">--%>
<%--    <ul class="menu-main">--%>
<%--        <li class="left-item"><a href="#">Logout</a></li>--%>
<%--        <li class="right-item"><a href="../../index.jsp" class="first">На главную</a></li>--%>
<%--        <li class="right-item"><a href="javascript:history.back()" title="Вернуться на предыдущую страницу">Назад</a>--%>
<%--        </li>--%>
<%--    </ul>--%>
<%--    <div class="box">Система управления студентами и их успеваемостью</div>--%>
<%--</nav>--%>
<%--<div class="boxSite">--%>
<%--    <span>Выбрать семестр</span>--%>
<%--    <form action="/term" method="post"></form>--%>
<%--    <select name="semestr" id="#multipleSelect">--%>
<%--        <c:forEach items="${semestrs}" var="sem">--%>
<%--            <option name="idSem" value="${sem.id}">${sem.semestr}</option>--%>
<%--        </c:forEach>--%>
<%--    </select>--%>
<%--    <form action="/getDiscinSem" method="get" id="ChoiseSemForm">--%>
<%--        <input type="submit" value="Выбрать" class="buttonModify" onclick="choiseSem()" id="idChoiseSem">--%>
<%--    </form>--%>

<%--    <p>Длительность семестра: ${selectedTerm.duration}</p>--%>
<%--    <div class="firstRow">--%>
<%--        <div class="table">--%>
<%--            <div class="tableName">Список дисциплин семестра--%>
<%--                <div class="table-row">--%>
<%--                    <div class="table-cellH " style="height: auto">Наименование дисциплины</div>--%>
<%--                </div>--%>
<%--                <div class="table-row">--%>
<%--                    <c:forEach items="${disciplinesInSemestr}" var="ds">--%>
<%--                        <div class="table-cell" style="height: auto">"${ds.discipline}"</div>--%>
<%--                    </c:forEach>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--    <div class="secondRow">--%>


<%--        <form action="/create-semestr" method="get">--%>
<%--            <input type="submit" value="Создать семестр" class="buttonModify">--%>
<%--        </form>--%>
<%--        <form action="/modify-semestrs" id="modifSemForm">--%>
<%--            <input type="submit" onclick="modifingSemestr()" value="Модифицировать семестр" class="buttonModify">--%>
<%--            <input type="hidden" name="idModifSem" id="idModifSem">--%>
<%--        </form>--%>
<%--        <form action="/delete-semestr" method="get" id="deleteSemForm">--%>
<%--            <input type="submit" value="Удалить семестр" onclick="deleteSemestr()" class="buttonModify">--%>

<%--            <input type="hidden" name="idsDeleteSem" id="idsDeleteSem">--%>
<%--        </form>--%>
<%--    </div>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>