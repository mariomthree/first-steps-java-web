<%-- 
    Document   : 404
    Created on : Oct 26, 2020, 8:46:12 AM
    Author     : mariomthree
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Erro 404</title>
        <link rel="stylesheet" type="text/css"  href="<c:url value="resources/css/bootstrap.css"/>">  
        <link rel="stylesheet" type="text/css"  href="<c:url value="resources/css/jquery-ui.css"/>">
        <link rel="stylesheet" type="text/css"  href="<c:url value="resources/css/main.css"/>">
        <!--<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700">-->
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-sm-12 not-found">
                    <h2>404 | Página não encontrada.</h2>
                    <h5>
                        <i class="fa fa-angle-double-left"></i> 
                        <a href="javascript:history.back()">Voltar</a>
                    </h5>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="<c:url value="resources/js/all.js"/>"></script>
        <script type="text/javascript" src="<c:url value="resources/js/jquery.js"/>"></script>
        <script type="text/javascript" src="<c:url value="resources/js/jquery-ui.js"/>"></script>
        <script type="text/javascript" src="<c:url value="resources/js/popper.js"/>"></script>
        <script type="text/javascript" src="<c:url value="resources/js/bootstrap.bundle.js"/>"></script>
    </body>
</html>
