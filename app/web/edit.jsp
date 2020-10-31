<%-- 
    Document   : index
    Created on : Oct 26, 2020, 6:29:43 AM
    Author     : mariomthree
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Utilizadores</title>
        <!-- css -->
        <link rel="stylesheet" type="text/css" href="<core:url value=" resources/css/bootstrap.css "/>">
        <link rel="stylesheet" type="text/css" href="<core:url value=" resources/css/jquery-ui.css "/>">
        <link rel="stylesheet" type="text/css"  href="<core:url value="resources/css/main.css"/>">
        <!--<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700">-->
        <!-- end of css -->
    </head>

    <body>

        <div class="container-fluid p-5">
            <div class="row">
                <div class="col-sm-12">
                    <div class="card card-primary">
                        <div class="card-header p-2">
                            <h5 class="card-title px-3 py-2">Actualizar utilizador</h5>
                        </div>
                        <div class="card-body">
                            <form id="form" class="form-horizontal" method="post" action="updateUser">
                                <input  type="hidden" id="id" name="id" value="${user.id}">
                                <div class="form-group">
                                    <label for="name">Nome:</label>
                                    <input type="text" id="name" name="name" class="form-control" value="${user.name}">
                                </div>
                                <div class="form-group">
                                    <label for="email">E-mail:</label>
                                    <input type="email" id="email" name="email" class="form-control" value="${user.email}">
                                </div>
                                <div class="form-group">
                                    <label for="dateOfBirth">Data de Nascimento:</label>
                                    <input type="text" id="dateOfBirth" name="dateOfBirth" class="form-control" value="${user.dateOfBirth}">
                                </div>
                                <div class="form-group">
                                    <button class="btn btn-primary" type="submit">Actualizar</button>
                                </div>
                            </form>
                        </div>
                        <div class="card-footer">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- js files -->
        <script type="text/javascript" src="<core:url value="resources/js/all.js"/>"></script>
        <script type="text/javascript" src="<core:url value="resources/js/jquery.js"/>"></script>
        <script type="text/javascript" src="<core:url value="resources/js/jquery-ui.js"/>"></script>
        <script type="text/javascript" src="<core:url value="resources/js/popper.js"/>"></script>
        <script type="text/javascript" src="<core:url value="resources/js/bootstrap.bundle.js"/>"></script>
        <script type="text/javascript" src="<core:url value="resources/js/jquery.validate.js"/>"></script>
        <script type="text/javascript" src="<core:url value="resources/js/additional-methods.js"/>"></script>
        <script type="text/javascript" src="<core:url value="resources/js/localization/messages_pt_PT.js"/>"></script>
        <script type="text/javascript" src="<core:url value="resources/js/jquery.dataTables.js"/>"></script>
        <script type="text/javascript" src="<core:url value="resources/js/dataTables.bootstrap4.js"/>"></script>
        <script type="text/javascript" src="<core:url value="resources/js/main.js"/>"></script>
        <!--  end of js files -->
    </body>

</html>