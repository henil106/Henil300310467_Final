<%--
  Created by IntelliJ IDEA.
  User: Henil Harshad Shah
  Date: 2020-12-12
  Time: 4:57 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student Record</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        h1 {
            text-align:center;
        }

    </style>
</head>
<body>
<p><font color="red">${errorMessage}</font></p>

<h1>Log In</h1>
<div class="container">
    <form action="" method="POST">

        <fieldset class="form-group">
            <label>Student Number :</label>
            <input name="number" type="text" class="form-control" />

            </br>

            <label>Student Name :</label>
            <input name="name" type="text" class="form-control"/>

            <br>

            <label>Student GPA :</label>
            <input name="gpa" type="text" class="form-control"/>

        </fieldset>
        <input class="btn btn-success" type="submit" />
    </form>
</div>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
