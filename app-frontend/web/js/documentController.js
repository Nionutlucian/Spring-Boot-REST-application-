var app = angular.module('myApp',[]);
app.controller('documentcontroller' ,function($scope,$http,$window) {

    $scope.descriereDocument = null;
    $scope.dataExpirare = null;
    $scope.dataDeschidere = null;
    $scope.tipDocument = null;
    $scope.numeDosar = null;
    $scope.id_user = null
   // $scope.id_user = null;

    userLogin = JSON.parse($window.sessionStorage.getItem("userLogat"));
    console.log(userLogin.id)

    $http.get("http://localhost:8080//afisaretipdocument")
        .then(function(response) {
            $scope.tip = response.data;
        });

    $http({ method:'GET',
        url: 'http://localhost:8080/afisaredosare',
        params: {id_user: userLogin.id}
    }).then(function (response){
            $scope.dosare = response.data;
        });



    $scope.creareDocument = function (numeDosar,tipDocument,dataDeschidere,dataExpirare,descriereDocument){
        var obj = {
            numeDosar : numeDosar,
            tipDocument : tipDocument,
            dataDeschidere : dataDeschidere,
            dataExpirare : dataExpirare,
            descriereDocument : descriereDocument,
            id_user : userLogin.id
        };

        console.log(JSON.stringify(obj));
        $http({ method:'POST',
            url:'http://localhost:8080/c_document',
            data:JSON.stringify(obj),
            headers:{'Content-type':'application/json'}})
            .then(function (response){
                window.alert("Document inregistrat cu succes!");
                window.location.href = "/dashboard.jsp"
            }).catch(function (error){
            window.alert("A aparut o eroare de server");
        });
    };
});