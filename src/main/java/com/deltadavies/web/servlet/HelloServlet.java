package com.deltadavies.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: Jeremy Davies [jerdavies@gmail.com]
 */
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException
    {
        // reading the user input
        PrintWriter out = response.getWriter();
        out.println (getClass().getName() + " - entered ");
    }
}
