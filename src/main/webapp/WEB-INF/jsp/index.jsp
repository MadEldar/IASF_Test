<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>

<%--${students}--%>

<div class="container">
    <div class="row">
        <h3 class="col-10">Student list</h3>
        <a href="/create" class="btn btn-primary">Create</a>
        <table class="table mt-4">
            <tr>
                <th>ID</th>
                <th>Full name</th>
                <th>Gender</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Date of Birth</th>
                <th>Hometown</th>
            </tr>
                <c:forEach var="s" items="${students}">
                    <tr>
                        <td>${s.id}</td>
                        <td>${s.fullname}</td>
                        <td>${s.gender}</td>
                        <td>${s.email}</td>
                        <td>${s.phone}</td>
                        <td>${s.dob}</td>
                        <td>${s.hometown}</td>
                    </tr>
                </c:forEach>
        </table>
    </div>
</div>




<%--${message}--%>

<%--<form action="login" method="post">--%>
<%--    <input type="text" name="username">--%>
<%--    <input type="password" name="password">--%>
<%--    <input type="submit" value="LOGIN">--%>
<%--</form>--%>

</body>
</html>
