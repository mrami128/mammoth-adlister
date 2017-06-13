package com.codeup.adlister.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    protected void doGet(
        // TODO:done showing the registration form
            HttpServletRequest request, HttpServletResponse response)
        throws ServletException,IOException{
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request,response);

    }

    protected void doPost(
            HttpServletRequest request, HttpServletResponse response
    )throws ServletException, IOException{
        {
            // TODO: ensure the submitted information is valid
            //String username=
            //String email=
            //String password=
            // TODO: create a new user based off of the submitted information
            // TODO: if a user was successfully created, send them to their profile
        }
    }
}
