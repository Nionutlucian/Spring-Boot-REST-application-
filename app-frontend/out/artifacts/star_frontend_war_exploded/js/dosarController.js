var app = angular.module('myApp',[]);
app.controller('dosarcontroller' ,function($scope,$http,$window) {

    $scope.numeDosar = null;
    $scope.entitateContractanta = null;
    $scope.tipContract = null;
    $scope.dataDeschidere = null;
    $scope.dataExpirare = null;
    $scope.descriereContract = null;

    userLogin = JSON.parse($window.sessionStorage.getItem("userLogat"));

    $http.get("http://localhost:8080/tip")
        .then(function(response) {
            $scope.tip = response.data;
        });

    $http.get("http://localhost:8080/entitate")
        .then(function(response) {
            $scope.entitate = response.data;
        });


    // $scope.afisareTipContract = function () {
    //
    //
    //
    // }


    $scope.creareDosar = function (numeDosar,entitateContractanta,tipContract,dataDeschidere,dataExpirare,descriereContract){
        var obj = {
            numeDosar : numeDosar,
            entitateContractanta : entitateContractanta,
            tipContract : tipContract,
            dataDeschidere : dataDeschidere,
            dataExpirare : dataExpirare,
            descriereContract : descriereContract,
            id_user:userLogin.id
        };

        console.log(JSON.stringify(obj));
        $http({ method:'POST',
            url:'http://localhost:8080/dosar',
            data:JSON.stringify(obj),
            headers:{'Content-type':'application/json'}})
            .then(function (response){
                window.alert("Dosar inregistrat cu succes!");
                window.location.href = "/dashboard.jsp"
            }).catch(function (error){
             window.alert("A aparut o eroare de server");
        });
    };
});