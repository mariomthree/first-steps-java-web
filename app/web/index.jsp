<%-- 
    Document   : index
    Created on : Oct 26, 2020, 6:29:43 AM
    Author     : mariomthree
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="userController" class="Controller.UserController"/>
<jsp:useBean id="user" class="Model.User"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Utilizadores</title>
        <link rel="stylesheet" type="text/css"  href="<c:url value="resources/css/bootstrap.css"/>">  
        <link rel="stylesheet" type="text/css"  href="<c:url value="resources/css/jquery-ui.css"/>">
        <link rel="stylesheet" type="text/css"  href="<c:url value="resources/css/dataTables.bootstrap4.css"/>">      
        <link rel="stylesheet" type="text/css"  href="<c:url value="resources/css/main.css"/>">

        <!--<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700">-->

    </head>
    <body>
        <div class="container-fluid px-5 pb-2 pt-5">
            <div class="row">
                <div class="col-sm-12 p-4 text-center">
                    <c:if test="${not empty message}">
                        <div class="alert alert-success">
                            ${message}
                        </div>
                    </c:if>
                </div>
            </div>
        </div>
        <div class="container-fluid px-5 pb-5">
            <div class="row">
                <div class="col-sm-5">
                    <div class="card card-primary">
                        <div class="card-header p-2">
                            <h5 class="card-title px-3 py-2">Adicionar utilizador</h5>
                        </div>
                        <div class="card-body">
                            <form id="form" class="form-horizontal" method="post" action="createUser">
                                <div class="form-group">
                                    <label for="name">Nome:</label>
                                    <input type="text" id="name" name="name" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label for="email">E-mail:</label>
                                    <input type="email" id="email" name="email" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label for="dateOfBirth">Data de Nascimento:</label>
                                    <input type="text" id="dateOfBirth" name="dateOfBirth" class="form-control">
                                </div>
                                <div class="form-group">
                                    <button class="btn btn-primary" type="submit">Adicionar</button>
                                </div>
                            </form>
                        </div>
                        <div class="card-footer">
                        </div>
                    </div>
                </div>
                <div class="col-sm-7">
                    <div class="card card-primary">
                        <div class="card-header p-2">
                            <h5 class="card-title px-3 py-2">Utilizadores</h5>
                        </div><!-- /.card-header -->
                        <div class="card-body">
                            <table id="table" class="table">
                                <thead>
                                <th>Nome</th>
                                <th>E-mail</th>
                                <th>Data de Nascimento</th>
                                <th>Acções</th>
                                </thead>
                                <tbody>
                                    <c:forEach var="user" items="${userController.read()}">
                                        <tr>
                                            <td>${user.name}</td>
                                            <td>${user.email}</td>
                                            <td>${user.dateOfBirth}</td>
                                            <td>
                                                <div class="btn-group btn-group-sm">
                                                    <a href="editUser?id=${user.id}" class="btn btn-primary"><i class="fa fa-edit"></i></a>
                                                    <a href="deleteUser?id=${user.id}" class="btn btn-danger"><i class="fa fa-trash"></i></a>
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div><!-- /.card-body -->
                        <div class="card-footer">

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- js files -->
        <script type="text/javascript" src="<c:url value="resources/js/all.js"/>"></script>
        <script type="text/javascript" src="<c:url value="resources/js/jquery.js"/>"></script>
        <script type="text/javascript" src="<c:url value="resources/js/jquery-ui.js"/>"></script>
        <script type="text/javascript" src="<c:url value="resources/js/popper.js"/>"></script>
        <script type="text/javascript" src="<c:url value="resources/js/bootstrap.bundle.js"/>"></script>
        <script type="text/javascript" src="<c:url value="resources/js/jquery.validate.js"/>"></script>
        <script type="text/javascript" src="<c:url value="resources/js/additional-methods.js"/>"></script>
        <script type="text/javascript" src="<c:url value="resources/js/localization/messages_pt_PT.js"/>"></script>
        <script type="text/javascript" src="<c:url value="resources/js/jquery.dataTables.js"/>"></script>
        <script type="text/javascript" src="<c:url value="resources/js/dataTables.bootstrap4.js"/>"></script>
        <script type="text/javascript" src="<c:url value="resources/js/main.js"/>"></script>
        <!--  end of js files -->
    </body>
</html>