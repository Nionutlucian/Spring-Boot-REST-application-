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
    <title>Creare dosar</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <script src="js/dosarController.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body ng-app="myApp">

<div class="container" ng-controller="dosarcontroller">
    <h2>Creare dosar</h2>
    <div class="form-group">
        Denumire dosar:<input type="text" class="form-control" ng-model="numeDosar" required><br><br>
        Entitate Contractanta:<select class="form-control" ng-model="entitateContractanta" ng-options="x.denumireEntitate for x in entitate"></select><br><br>
        Tip Contract:<select class="form-control" ng-model="tipContract" ng-options="x.tipContract for x in tip"></select><br><br>
        Data deschidere dosar:<input type="date" class="form-control" ng-model="dataDeschidere"><br><br>
        Data expirare dosar:<input type="date" class="form-control" ng-model="dataExpirare"><br><br>
        Descriere:<input type="text" class="form-control" ng-model="descriereContract"><br><br>
        <button id="creareDosar" class="btn btn-primary" ng-click="creareDosar(numeDosar,entitateContractanta.denumireEntitate,tipContract.tipContract,dataDeschidere,dataExpirare,descriereContract)">Inregistreaza Dosar</button>
    </div>
</div>


<%--<div id="formularDosar" ng-controller="dosarcontroller">--%>
    <%--Denumire dosar:<input type="text" ng-model="denumireDosar" required><br><br>--%>
    <%--Entitate Contractanta:<select ng-model="entitateContractanta" ng-options="x.denumireEntitate for x in entitate"></select><br><br>--%>
    <%--Tip Contract:<select ng-model="tipContract" ng-options="x.tipContract for x in tip"></select><br><br>--%>
    <%--Data deschidere dosar:<input type="date" ng-model="dataDeschidere"><br><br>--%>
    <%--Data expirare dosar:<input type="date" ng-model="dataExpirare"><br><br>--%>
    <%--Descriere:<input type="text" ng-model="descriereDosar"><br><br>--%>
    <%--<button id="creareDosar" ng-click="creareDosar(denumireDosar,entitateContractanta.denumireContractanta,tipContract.tipContract,dataDeschidere,dataExpirare,descriereDosar)">Inregistreaza Dosar</button>--%>
<%--</div>--%>
</body>
</html>
