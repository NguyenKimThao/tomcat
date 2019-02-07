"use strict";

// declare modules
var module_authen = angular.module("Authentication", []);
var module_home = angular.module("Home", ['cam.embedded.forms', 'ngAnimate', 'ui.bootstrap']);

var basicHttpAuthApp = angular.module("example.app", ["Authentication", "Home", "ngRoute", "ngCookies"]);

basicHttpAuthApp.config(["$routeProvider", function ($routeProvider) {
  $routeProvider
    .when("/login", {
      controller: "LoginController",
      templateUrl: "./resources/views/login.jsp",
      hideMenus: true
    })
    .when("/", {
      controller: "HomeController",
      templateUrl: "./resources/views/home.jsp"
    })
    .otherwise({ redirectTo: "/login" });
}])

basicHttpAuthApp.run(["$rootScope", "$location", "$cookieStore", "$http",
  function ($rootScope, $location, $cookieStore, $http) {
    // keep user logged in after page refresh
    $rootScope.globals = $cookieStore.get("globals") || {};
    if ($rootScope.globals.currentUser) {
      $http.defaults.headers.common["Authorization"] = "Basic " + $rootScope.globals.currentUser.authdata; // jshint ignore:line
    }

    $rootScope.$on("$locationChangeStart", function (event, next, current) {
      // redirect to login page if not logged in
      if ($location.path() !== "/login" && !$rootScope.globals.currentUser) {
        $location.path("/login");
      }
    });
  }
]);
