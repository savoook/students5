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
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Студенты</title>
    <link rel="stylesheet" href="../../resourses/css/my_style.css">
    <script src="../../resourses/js/functions.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>


    <%--    <script src="../../resourses/lib/jquery-ui-1.12.1/jquery-ui.js"></script>--%>
    <%--    <link rel="stylesheet" href="../../resourses/lib/jquery-ui-1.12.1/jquery-ui.css">--%>
    <%--    <script src="../../resourses/lib/jquery-ui-1.12.1/jquery-ui.js"></script>--%>

    <%--    <script>--%>
    <%--        $(function () {--%>
    <%--            $("#date").datepicker();--%>
    <%--        });--%>
    <%--    </script>--%>
</head>
<body>
<h2>Система управления студентами и их успеваемостью</h2>
<div>
    <c:choose>
        <c:when test="${isLogin eq 1}">
            <a href="/logout" class="login">Logout</a>
        </c:when>
        <c:otherwise>
            <a href="/login" class="login">Login</a>
        </c:otherwise>
    </c:choose>
</div>
<div>
    <a href="/" class="main">На главную</a>
</div>
<br>
<div>
    <a href="javascript:history.back()" class="back">Назад</a>
</div>
<br>
<div class="container">
    <input type="submit" onclick="studentProgress()" value="Просмотреть успеваемость выбранного студента">
    <form action="/progress" id="ProgStForm" method="get">
        <input type="hidden" name="idSt" id="idSt">
    </form>
    <c:if test="${role eq 'admin'}">


        <input type="submit" onclick="modifyStudent()" value="Модицицировать выбранного студента...">
        <form action="/studentsModify" id="studentsModifyForm">
            <input type="hidden" id="iDmodifSt" name="iDmodifSt">
        </form>

        <form action="/create-students" method="get">
            <input type="submit" name="create_student" id="create_student" value="Создать студента...">
        </form>

        <input type="button" onclick="deleteStudent()" value="Удалить выбранного студента...">
        <form action="/studentsDelete" id="studentsDeleteForm">
            <input type="hidden" id="idsDeleteStudents" name="idsDeleteStudents">
        </form>
    </c:if>
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
                <th>Дата поступления</th>

                <%--                    <th><f:formatDate value="${s.date}" pattern="yy/MMM/dd"></f:formatDate></th>--%>

            </tr>
            <c:forEach items="${students}" var="s">
                <tr>
                    <td><input type="checkbox" value="${s.id}"></td>
                    <td>${s.surname}</td>
                    <td>${s.name}</td>
                    <td>${s.group}</td>
                        <%--                    <td><f:formatDate value="${s.data}" pattern="yy-MMM-dd"></f:formatDate></td>--%>
                    <td>${s.data}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</div>
</body>
</html>
