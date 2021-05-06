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
<div class="container">
    <div class="row">
        <h3 class="col-10">Create new student</h3>
        <a href="/" class="col-2 btn btn-primary my-4">Back to list</a>
        <form action="/create" method="post" class="col-8 offset-2">
            <div class="col-12 form-group">
                <label for="full-name">Full name</label>
                <input type="text" id="full-name" name="fullName" placeholder="Full name" class="form-control">
            </div>
            <div class="col-12 form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" placeholder="Password" class="form-control">
            </div>
            <div class="col-12 form-group">
                <label for="confirm-password">Confirm password</label>
                <input type="password" id="confirm-password" name="confirmPassword" placeholder="Confirm password" class="form-control">
            </div>
            <div class="col-12 form-group">
                <label for="gender">Gender</label>
                <select name="gender" id="gender" class="form-control">
                    <option value="Male" aria-checked="true">Male</option>
                    <option value="Female">Female</option>
                </select>
            </div>
            <div class="col-12 form-group">
                <label for="email">Email</label>
                <input type="text" id="email" name="email" placeholder="Email" class="form-control">
            </div>
            <div class="col-12 form-group">
                <label for="phone">Phone</label>
                <input type="text" id="phone" name="phone" placeholder="Phone" class="form-control">
            </div>
            <div class="col-12 form-group">
                <label for="hometown">Hometown</label>
                <input type="text" id="hometown" name="hometown" placeholder="Hometown" class="form-control">
            </div>
            <button class="btn btn-primary" type="submit">Submit</button>
        </form>
    </div>
</div>
</body>
</html>
