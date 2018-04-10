<!DOCTYPE html>
<html lang="en">
<head>
    <title>Vizualizare Documente</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <script src="js/afisareController.js"></script>

</head>
<body ng-app="myApp">


<div class="container" ng-controller="afisarecontroller">
    <h1>Documente inregistrate</h1>

    <table class="table">
        <thead>
        <tr>
            <th>Numar document</th>
            <th>Data deschidere</th>
            <th>Data expirare</th>
            <th>Nume dosar</th>
            <th>Tip document</th>
        </tr>
        </thead>
        <tbody>
        <tr ng-repeat="d in documente">
            <td>{{ d.id_document }}</td>
            <td>{{ x.dataDeschidere }}</td>
            <td>{{ x.dataExpirare }}</td>
            <td>{{ x.numeDosar }}</td>
            <td>{{ x.tipDocument }}</td>
        </tr>
        </tbody>
    </table>
</div>

</body>
</html>
