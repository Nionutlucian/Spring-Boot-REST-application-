<%--
  Created by IntelliJ IDEA.
  User: Nicolescu
  Date: 3/31/2018
  Time: 5:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <script src="js/loginController.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body ng-app="myApp">

<div class="container" ng-controller="logincontroller">
    <h2>Login</h2>
    <div class="form-group">

        Username:    <input type="text" class="form-control" name="username"  ng-model="username" required placeholder="username"><br><br>
        Password:    <input type="password" class="form-control" name="password"  ng-model="password" required placeholder="password"><br><br>
    <button class="btn btn-primary" id="registerButton" ng-click="loginFunction(username,password)">Login</button><br><br>
    <a href="register.jsp">You don`t have an account?Go to Sing Up!</a>
    </div>
</div>

</body>
</html>
