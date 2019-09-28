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
    <link rel="stylesheet" href="../../resourses/css/style.css">
    <script src="../../resourses/js/functions.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
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
                            <input type="checkbox" value="${d.id}">
                        </fieldset>
                    </div>
                    <div class="table-cell">${d.discipline}</div>
                </div>
            </c:forEach>

        </div>
    </div>

    <div class="secondRow">
        <div class="admin-bottom">

            <form action="/disciplineCreate" method="get">
                <input type="submit" value="Создать дисциплину...">
            </form>

            <input type="submit" onclick="modifyDiscipline()" value="Модифицировать дисциплину">
            <form action="/disciplineModify" id="modifDiscForm">
                <input type="hidden" name="idModifDisc" id="idModifDisc">
            </form>


            <input type="submit" onclick="deleteDiscipline()" value="Удалить выбранную дисциплину">
            <form action="/disciplineDelete" id="idsDeleteForm">
                <input type="hidden" name="idsDeleteDisc" id="idsDeleteDisc">
            </form>
        </div>
    </div>
</div>
</body>
</html>