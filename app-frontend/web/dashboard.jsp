<%--
  Created by IntelliJ IDEA.
  User: Nicolescu
  Date: 3/31/2018
  Time: 6:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="js/loginController.js"></script>
    <link rel="stylesheet" href="/path/to/jquery.bxslider.css">
    <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
    <link rel="stylesheet" type="text/css" href="css/styles.css">


    <script>
        $(document).ready(function(){
            $('.slider').bxSlider();
        });
    </script>
</head>

<body ng-app="myApp">

<div ng-controller="logincontroller">
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/dashboard.jsp">Dashboard</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="/dashboard.jsp">Home</a></li>

            <li><a href="/dosar.jsp">Creare dosar</a></li>
            <li><a href="/document.jsp">Creare document</a></li>
            <li><a href="/vizualizare.jsp">Vizualizare documente</a></li>
            <li><a href="">    </a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>

            <li><a href="">{{userLogin.firstName}}  {{userLogin.lastName}}</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="" ng-click="logoutFunction()"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
        </ul>
    </div>
</nav>
</div>

<div class="slider">
    <div><img src="img/1.jpg"></div>
    <div><img src="img/f.jpg"></div>
    <div><img src="img/too_many_documents.png"></div>
</div>

</body>
</html>
