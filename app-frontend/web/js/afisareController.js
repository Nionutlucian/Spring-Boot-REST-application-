var app = angular.module('myApp',[]);
app.controller('afisarecontroller' ,function($scope,$http,$window) {



    userLogin = JSON.parse($window.sessionStorage.getItem("userLogat"));
    console.log(userLogin.id)

    $http({ method:'GET',
        url: 'http://localhost:8080/afisaredocumente',
        params: {id_user: userLogin.id}
    }).then(function (response){
        $scope.documente = response.data;
    });




});