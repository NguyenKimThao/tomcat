<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <title>BPMN Custom Execute</title>

    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Visual Admin Dashboard - Home</title>
    <meta name="description" content="">
    <meta name="author" content="templatemo">
    <link href="<c:url value="/resources/css/font-awesome.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/templatemo-style.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/util.css"/>" rel="stylesheet">
    
    
</head>
<body ng-app="example.app">
	<div ng-view></div>
    <footer class="text-right">
        <p>Copyright &copy; 2084 Company Name
            | Designed by <a href="#" target="_parent">webstoreapp</a></p>
    </footer>
    <!-- JS -->
    <script src="<c:url value="/resources/js/jquery-1.11.2.min.js"/>"></script>      <!-- jQuery -->
    <script src="<c:url value="/resources/js/jquery-migrate-1.2.1.min.js"/>"></script> <!--  jQuery Migrate Plugin -->

    <script type="text/javascript" src="<c:url value="/resources/js/templatemo-script.js"/>"></script>      <!-- Templatemo Script -->
    <script type="text/javascript" src="<c:url value="/resources/js/bootstrap-3.1.1.min.js"/>"></script>   
    <script type="text/javascript" src="<c:url value="/resources/js/angular/angular.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/angular/angular-cookies.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/angular/angular-route.js"/>"></script>
    <script src="<c:url value="/resources/js/camunda-bpm-sdk-angular.js"/>" type="text/javascript"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/angular/angular-animate.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/angular/ui-bootstrap-tpls-0.13.4.js"/>"></script>
    
    <script src="<c:url value="/resources/js/angular/angular-app.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/angular/authentication_service.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/angular/login_controller.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/angular/home_controller.js"/>" type="text/javascript"></script>
</body>
</html>
