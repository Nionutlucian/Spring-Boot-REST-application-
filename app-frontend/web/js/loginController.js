var app = angular.module('myApp',[]);
app.controller('logincontroller' ,function($scope,$http,$window) {

    // var init = function () {
    //
    //     if ($window.sessionStorage.length == 0) {
    //         window.location.href="/login.jsp";
    //     }
    //
    //     if ($window.sessionStorage.length != 0) {
    //         window.location.href="/dashboard.jsp"
    //     }
    //
    // };
    // init();

    $scope.username = null;
    $scope.password = null;


    $scope.userLogin = JSON.parse($window.sessionStorage.getItem("userLogat"));


    $scope.logoutFunction = function () {
         $window.sessionStorage.clear();
         window.location.href="/login.jsp"
    };



    // $scope.toDosar = function () {
    //     window.location.href="/dosar.jsp"
    // }
    //
    // $scope.toDocument = function () {
    //     window.location.href="/document.jsp"
    // }

    $scope.loginFunction = function (username,password){
        var obj = {
            username : username,
            password : password
        };

        console.log(JSON.stringify(obj));
        $http({ method:'POST',
            url:'http://localhost:8080/login',
            data:JSON.stringify(obj),
            headers:{'Content-type':'application/json'}})
            .then(function (response){
               if(response.data != ""){
                   $window.sessionStorage.setItem("userLogat",JSON.stringify(response.data));
                   $window.location.href = '/dashboard.jsp';
               }
               else{
                   window.alert("Username or password incorect!");
               }
            }).catch(function (error){
            $scope.error = error;
            console.log(error);
        });
    };
});