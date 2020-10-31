package Servlet;

import Controller.UserController;
import Model.User;
import java.io.IOException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mariomthree
 */
@WebServlet("/updateUser")
public class UpdateUserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String stringId = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String dateOfBirthString = request.getParameter("dateOfBirth");
        Date dateOfBirth = Helpers.convertStringToDateAndReturn(dateOfBirthString);

        User user = new UserController().findById(Long.valueOf(stringId));

        user.setEmail(email);
        user.setName(name);
        user.setDateOfBirth(dateOfBirth);

        new UserController().updateUser(user);
        
        request.setAttribute("message", "Utilizador actualizado.");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request, response);
    }
}
