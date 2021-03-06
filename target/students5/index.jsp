<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Система управления</title>
    <link rel="stylesheet" href="resourses/css/style.css">
</head>
<body>

<div class="boxSite">
    <div class="box">Система управления студентами и их успеваемостью</div>
    <span>
        <a href="/students" class="students">Студенты</a>
    </span>
    <span>
        <a href="/disciplines" class="disciplines">Дисциплины</a>
    </span>
    <span>
        <a href="/terms" class="semestrs">Семестры</a>
    </span>

</div>
<span>
        <c:choose>
                <c:when test="${isLogin eq 1}">
                    <a href="/logout" class="login">Logout</a>
                </c:when>
                <c:otherwise>
                    <a href="/login" class="login">Login</a>
                </c:otherwise>
        </c:choose>
    </span>
</body>
</html>
