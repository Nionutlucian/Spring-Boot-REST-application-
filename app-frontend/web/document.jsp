<%--
  Created by IntelliJ IDEA.
  User: Nicolescu
  Date: 4/1/2018
  Time: 12:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Creare document</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <script src="js/documentController.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body ng-app="myApp">


<div class="container" ng-controller="documentcontroller">
    <h2>Creare document</h2>
    <div class="form-group">
        Nume dosar:<select class="form-control" ng-model="numeDosar" ng-options="x.numeDosar for x in dosare"></select><br><br>
        Tip Document:<select class="form-control" ng-model="tipDocument" ng-options="x.tipDoc for x in tip"></select><br><br>
        Data deschidere document:<input type="date" class="form-control" ng-model="dataDeschidere"><br><br>
        Data expirare document:<input type="date" class="form-control" ng-model="dataExpirare"><br><br>
        Descriere:<input type="text" class="form-control" ng-model="descriereDocument"><br><br>
        <button id="creareDosar"  class="btn btn-primary" ng-click="creareDocument(numeDosar.numeDosar,tipDocument.tipDoc,dataDeschidere,dataExpirare,descriereDocument)">Inregistreaza Document</button>
    </div>
</div>


<%--<div id="formularDocument" ng-controller="documentcontroller">--%>
    <%--Nume dosar:<select ng-model="numeDosar" ng-options="x.numeDosar for x in dosare"></select><br><br>--%>
    <%--Tip Document:<select ng-model="tipDocument" ng-options="x.tipContract for x in tip"></select><br><br>--%>
    <%--Data deschidere document:<input type="date" ng-model="dataDeschidere"><br><br>--%>
    <%--Data expirare document:<input type="date" ng-model="dataExpirare"><br><br>--%>
    <%--Descriere:<input type="text" ng-model="descriereDocument"><br><br>--%>
    <%--<button id="creareDosar" ng-click="creareDocument(numeDosar,tipDocument,dataDeschidere,dataExpirare,descriereDocument)">Inregistreaza Document</button>--%>
<%--</div>--%>
</body>
</html>
