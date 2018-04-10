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
    <title>Register</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <script src="js/registerController.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>

<body ng-app="myApp">

<div class="container" ng-controller="registercontroller">
    <h2>Register</h2>
    <div class="form-group">
        First Name:  <input type="text" class="form-control" name="firstName" ng-model="firstName" required placeholder="First Name"><br><br>
        Last Name:   <input type="text" class="form-control" name="lasttName"  ng-model="lastName" required placeholder="Last Name"><br><br>
        Email:       <input type="email" class="form-control" name="email"  ng-model="email" required placeholder="email"><br><br>
        Username:    <input type="text" class="form-control" name="username"  ng-model="username" required placeholder="username"><br><br>
        Password:    <input type="password" class="form-control" name="password"  ng-model="password" required placeholder="password"><br><br>
        <button id="registerButton" class="btn btn-primary" ng-click="registerFunction(firstName,lastName,username,password,email)">Register</button><br><br>
        <a href="login.jsp">Do you have an account?Go to Sing In!</a>
    </div>
</div>

</body>
</html>
