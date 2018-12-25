package com.kg.webapp1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * MyServlet
 */

 @WebServlet("/helloServlet")
public class MyServlet   extends HttpServlet  {

     private static final long serialVersionUID = 1L;

    @Override
     protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        //  super.doGet(req, response);


        //  response.addHeader("Access-Control-Allow-Origin", "*");
response.getWriter().println("{\"id\" : \"1\" , \"value\" : \"AwesomeAPI\"}");
     }






    
}