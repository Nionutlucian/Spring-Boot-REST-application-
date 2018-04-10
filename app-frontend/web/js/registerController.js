var app = angular.module('myApp',[]);
app.controller('registercontroller' ,function($scope,$http) {
    $scope.firstName = null;
    $scope.lastName = null;
    $scope.username = null;
    $scope.password = null;
    $scope.email = null;

    $scope.registerFunction = function (firstname,lastname,username,password,email){
        var obj = {
            firstName : firstname,
            lastName : lastname,
            username : username,
            password : password,
            email : email,
        };

        console.log(JSON.stringify(obj));
        $http({ method:'POST',
            url:'http://localhost:8080/register',
            data:JSON.stringify(obj),
            headers:{'Content-type':'application/json'}})
            .then(function (response){
                console.log("a intrat");
                window.alert("Contul a fost creat cu succes!Va rugam sa va logati.")
                window.location.href = "/login.jsp"
                // $scope.mesaj = JSON.parse(response);
            }).catch(function (error){
            $scope.error = error;
            console.log(error);
        });
    };
});